package sistemadecontascorrentes;

import java.io.IOException;

import javax.swing.JOptionPane;

public class MainTest {

	public static void main(String[] args) throws IOException {
		Conta[] contasCorrentes = new Conta[5];
		MovimentoConta[] movimentosContas = new MovimentoConta[3];
		ClasseMetodos metodos = new ClasseMetodos();

		String message = String.format("%s%n%s%n%s%n%s%n%s", "1 - Cadastrar contas correntes",
				"2 - Cadastrar movimentos", "3 - Gerar contas atualizadas", "4 - Consultar cadastros", "9 - Fim");

		String option;
		do {
			option = JOptionPane.showInputDialog(null, message, "Menu Principal", JOptionPane.PLAIN_MESSAGE);

			if (option.matches("\\d+")) {
				switch (Integer.parseInt(option)) {
				case 1:
					metodos.cadastrarContas(contasCorrentes);
					break;
				case 2:
					metodos.cadastrarMovimentos(movimentosContas);
					break;
				case 3:
					metodos.gerarContasAtualizadas();
					break;
				case 4:
					metodos.consultarCadastros();
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
