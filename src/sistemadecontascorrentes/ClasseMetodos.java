package sistemadecontascorrentes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ClasseMetodos {
	private String accountsfile = "contas.txt";
	private String movementsfile = "movimentos.txt";
	private String updatedaccountfile = "atualizados.txt";
	private String regexAccount = "\\d+\\s{1}[A-Z][a-z]+\\s{1}\\d+\\s{1}\\d+\\s{1}\\d+";
	private String regexMovement = "\\d+\\s{1}\\d+\\s{1}\\d+\\s{1}\\d+";

	public void cadastrarContas(ContaCorrente[] contasCorrentes) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(accountsfile));

		for (int i = 0; i < contasCorrentes.length; i++) {
			String conta = JOptionPane.showInputDialog(null,
					"Digite todos os dados da conta a ser\ncadastrada separados por um espaço!\n\nEx.:\nCód. Nome Saldo Limite Tipo\n1 Gustavo 1050 1000 1",
					"Cadastrar Contas", JOptionPane.PLAIN_MESSAGE);

			if (conta.matches(regexAccount))
				writer.write(String.format("%d %s%n", i, conta));
			else
				JOptionPane.showMessageDialog(null, "Dado(s) inválido(s). Tente novamente!");
		}

		writer.close();
	}

	public void cadastrarMovimentos(MovimentoConta[] movimentosContas) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(movementsfile));

		for (int i = 0; i < movimentosContas.length; i++) {
			String movimento = JOptionPane.showInputDialog(null,
					"Digite todos os dados da conta que foi\n movimentada separados por um espaço!\n\nEx.:\nCód. Valor Tipo Status\n1 500 3 4",
					"Cadastrar Movimentos", JOptionPane.PLAIN_MESSAGE);

			if (movimento.matches(regexMovement)) {
				writer.write(String.format("%d %s%n", i, movimento));
			} else
				JOptionPane.showMessageDialog(null, "Dado(s) inválido(s). Tente novamente!");

		}

		writer.close();

	}

	public void gerarContasAtualizadas() throws IOException {
		BufferedReader readerAccount = new BufferedReader(new FileReader(accountsfile));

		BufferedWriter writer = new BufferedWriter(new FileWriter(updatedaccountfile));

		for (int i = 0; i < 3; i++) {
			String account = readerAccount.readLine();

			BufferedReader readerMovements = new BufferedReader(new FileReader(movementsfile));
			for (int j = 0; j < 3; j++) {
				String movement = readerMovements.readLine();

				String[] tokensMovement = movement.split(" ");
				String[] tokensAccount = account.split(" ");

				if (tokensAccount[0].equals(tokensMovement[0])) { // verifica correspondência
					if (tokensMovement[3].equals("1")) { // verifica status

					}
				}

			}
			readerMovements.close();

		}

		readerAccount.close();
		writer.close();

	}

	public void consultarCadastros() {
		String message = String.format("%s%n%s%n%s%n%s%n%s", "1 - Contas Correntes", "2 - Movimento", "3 - Atualizado",
				"9 - Voltar");

		String option;
		do {
			option = JOptionPane.showInputDialog(null, message, "Consulta Cadastros", JOptionPane.PLAIN_MESSAGE);

			if (option.matches("\\d+")) {
				switch (Integer.parseInt(option)) {
				case 1:

					break;
				case 2:

					break;
				case 3:

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

}
