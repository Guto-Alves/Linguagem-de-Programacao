package sistemadevotacao;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Votacao2019 {

	public static void main(String[] args) {
		Votacao[] votacoes = new Votacao[100];
		ClasseMetodos metodos = new ClasseMetodos();

		String message = String.format("%s%n%s%n%s%n%s%n%s", "1 – Carregar Seção/Número Eleitor",
				"2 – Classificar por Seção", "3 – Gravar Registros", "4 – Mostrar Indicadores", "9 – Finalizar");
		int option;

		do {
			option = Integer.parseInt(
					JOptionPane.showInputDialog(null, message, "Sistema de Votação", JOptionPane.QUESTION_MESSAGE));

			switch (option) {
			case 1:
				votacoes = metodos.cadastrarVotacao(votacoes);
				break;
			case 2:
				try {
					metodos.classificarSecao();
					JOptionPane.showMessageDialog(null, "Dados classificados!", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "Erro ao classificar os registros!", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				break;
			case 3:
				try {
					metodos.gravarVotacao(votacoes);
					JOptionPane.showMessageDialog(null, "Arquivo gerado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "Erro ao gravar os registros!", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				break;
			case 4:
				metodos.mostrarIndicadores();
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Encerrando .. ");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente!", "Error",
						JOptionPane.ERROR_MESSAGE);
				break;
			}

		} while (option != 9);

	}

}
