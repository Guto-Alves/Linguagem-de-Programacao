package sistemadecontascorrentes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ClasseMetodos {
	private String accountsFile = "contas.txt";
	private String movementsFile = "movimentos.txt";
	private String updatedAccountFile = "contas_atualizadas.txt";

	public void cadastrarContas(Conta[] contasCorrentes) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(accountsFile));
		int counter = 0;

		while (counter < contasCorrentes.length) {
			String conta = JOptionPane.showInputDialog(null,
					"Digite todos os dados da conta a serem\ncadastrados separados por espaço!\n\nEx.:\nCód. Nome Saldo Limite Tipo\n1 Gustavo 1050 1000 1",
					"Cadastrar Contas", JOptionPane.PLAIN_MESSAGE);

			if (new Validation().validarContaCorrente(conta)) {
				writer.write(String.format("%s%n", conta));
				counter++;
			}
		}
		writer.close();
		sortFile(accountsFile, contasCorrentes);
	}

	public void cadastrarMovimentos(MovimentoConta[] movimentosContas) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(movementsFile));

		for (int i = 0; i < movimentosContas.length;) {
			String movimento = JOptionPane.showInputDialog(null,
					"Digite todos os dados da conta que foi\n movimentada separados por espaço!\n\nEx.:\nCód. Valor Tipo Status\n1 500 2 1",
					"Cadastrar Movimentos", JOptionPane.PLAIN_MESSAGE);

			if (new Validation().validarMovimento(movimento)) {
				writer.write(String.format("%s%n", movimento));
				i++;
			}
		}
		writer.close();
		sortFile(movementsFile, movimentosContas);
	}

	public void gerarContasAtualizadas() throws IOException {
		BufferedReader accountsReader = new BufferedReader(new FileReader(accountsFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(updatedAccountFile));

		String accountLine;
		while ((accountLine = accountsReader.readLine()) != null) {
			String[] accountTokens = accountLine.split(" ");

			BufferedReader movementReader = new BufferedReader(new FileReader(movementsFile));
			String movementLine;
			while ((movementLine = movementReader.readLine()) != null) {
				String[] movementTokens = movementLine.split(" ");

				if (accountTokens[0].equals(movementTokens[0])) { // identifica correnpondência cód.
					if (movementTokens[3].equals("1")) // verifica status< == 1
						writer.write(String.format("%s %s %s %s %s%n", accountTokens[0], accountTokens[1],
								accountTokens[2], accountTokens[3], accountTokens[4]));
					else if (movementTokens[3].equals("2")) { // verifica statusM == 2
						if (accountTokens[2] != movementTokens[1]) { // caso saldoContaC < ValorMovimentoM

						} else {// caso saldoContaC > ValorMovimentoM

						}
					}
				}
			}
			movementReader.close();
		}
		accountsReader.close();

	}

	public void consultarCadastros() throws IOException {
		String message = String.format("%s%n%s%n%s%n%s", "1 - Contas Correntes", "2 - Movimento", "3 - Atualizado",
				"9 - Voltar");

		String option;
		do {
			option = JOptionPane.showInputDialog(null, message, "Consultar Cadastros", JOptionPane.PLAIN_MESSAGE);

			if (option.matches("\\d+")) {
				switch (Integer.parseInt(option)) {
				case 1:
					displayFile(accountsFile, "Contas Correntes");
					break;
				case 2:
					displayFile(movementsFile, "Movimentos");
					break;
				case 3:
					displayFile(updatedAccountFile, "Contas Atualizadas");
					break;
				case 9:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!", "Error", JOptionPane.ERROR_MESSAGE);
					break;
				}
			} else
				JOptionPane.showMessageDialog(null, "Entrada inválida!", "Error", JOptionPane.ERROR_MESSAGE);

		} while (!option.equals("9"));
	}

	private void displayFile(String fileName, String description) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String file = "";
		String line;

		while ((line = reader.readLine()) != null)
			file += line + "\n";

		reader.close();

		JOptionPane.showMessageDialog(null, file, description, JOptionPane.INFORMATION_MESSAGE);
	}

	public void sortFile(String fileName, Object[] accounts) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String line;

		if (fileName.equals(accountsFile)) {
			// recupera as contas do arquivo e coloca no array
			Conta[] contasCorrentes = new Conta[accounts.length];
			int counter = 0;

			while ((line = reader.readLine()) != null) {
				String[] tokens = line.split(" ");

				contasCorrentes[counter] = new Conta();

				contasCorrentes[counter].setCod(Integer.parseInt(tokens[0]));
				contasCorrentes[counter].setNome(tokens[1]);
				contasCorrentes[counter].setSaldo(Double.parseDouble(tokens[2]));
				contasCorrentes[counter].setLimite(Double.parseDouble(tokens[3]));
				contasCorrentes[counter].setTipo(Integer.parseInt(tokens[4]));
				counter++;
			}
			reader.close();

			// classifica contas por Cód.
			for (int i = 0; i < contasCorrentes.length - 1; i++) {
				for (int j = i + 1; j < contasCorrentes.length; j++) {
					if (contasCorrentes[i].getCod() > contasCorrentes[j].getCod()) {
						Conta contaAxililar = contasCorrentes[i];
						contasCorrentes[i] = contasCorrentes[j];
						contasCorrentes[j] = contaAxililar;
					}
				}
			}

			// grava no arquivo mesmo arquivo só que com as contas classificadas
			BufferedWriter writer = new BufferedWriter(new FileWriter(accountsFile));
			for (int i = 0; i < contasCorrentes.length; i++)
				writer.write(String.format("%s %s %s %s %s%n", contasCorrentes[i].getCod(),
						contasCorrentes[i].getNome(), contasCorrentes[i].getSaldo(), contasCorrentes[i].getLimite(),
						contasCorrentes[i].getTipo()));

			writer.close();

		} else {
			MovimentoConta[] movimentosContas = new MovimentoConta[accounts.length];
			int counter = 0;

			while ((line = reader.readLine()) != null) {
				String[] tokens = line.split(" ");

				movimentosContas[counter] = new MovimentoConta();

				movimentosContas[counter].setCod(Integer.parseInt(tokens[0]));
				movimentosContas[counter].setValor(Double.parseDouble(tokens[1]));
				movimentosContas[counter].setTipo(Integer.parseInt(tokens[3]));
				movimentosContas[counter].setStatus(Integer.parseInt(tokens[2]));
				counter++;
			}
			reader.close();

			for (int i = 0; i < movimentosContas.length - 1; i++) {
				for (int j = i + 1; j < movimentosContas.length; j++) {
					if (movimentosContas[i].getCod() > movimentosContas[j].getCod()) {
						MovimentoConta contaAxililar = movimentosContas[i];
						movimentosContas[i] = movimentosContas[j];
						movimentosContas[j] = contaAxililar;
					}
				}
			}

			BufferedWriter writer = new BufferedWriter(new FileWriter(movementsFile));
			for (int i = 0; i < movimentosContas.length; i++)
				writer.write(
						String.format("%s %s %s %s%n", movimentosContas[i].getCod(), movimentosContas[i].getValor(),
								movimentosContas[i].getTipo(), movimentosContas[i].getStatus()));

			writer.close();
		}
	}

}
