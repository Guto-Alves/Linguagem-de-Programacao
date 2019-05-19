package sistemadecontascorrentes;

import java.io.IOException;

import javax.swing.JOptionPane;

public class MainTest {

	public static void main(String[] args) {
		ContaCorrente[] contasCorrentes = new ContaCorrente[5];
		MovimentoConta[] movimentosContas = new MovimentoConta[10];
		ClasseMetodos metodos = new ClasseMetodos();

		String message = String.format("%s%n%s%n%s%n%s%n%s", "1 - Cadastra Contas Correntes", "2 - Cadastra movimento",
				"3 - Gera Contas Atualizadas", "4 - Consulta cadastros", "9 - FIM");

		String option;
		do {
			option = JOptionPane.showInputDialog(null, message, "Menu Principal", JOptionPane.PLAIN_MESSAGE);

			if (option.matches("\\d+")) {
				switch (Integer.parseInt(option)) {
				case 1:
					try {
						metodos.cadastrarContas(contasCorrentes);
					} catch (IOException e) {
						JOptionPane.showMessageDialog(null, "Error ao cadastrar contas!", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 2:
					try {
						metodos.cadastrarMovimentos(movimentosContas);
					} catch (IOException e) {
						JOptionPane.showMessageDialog(null, "Error ao cadastrar contas!", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
					break;
				case 3:

					break;
				case 4:

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
