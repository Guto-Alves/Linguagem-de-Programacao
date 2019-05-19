/*
 * Objetivo: Criar um menu de opções para chamada das questões 1 e 2, 
 * assim como as respectivas variáveis de envio e retorno. 
 * Na opção 2 enviar cada valor do vetor somente entre 1 a 10
 * 
 *  --     Menu Principal         --
 *  -- 1 - Carrega vetor          --
 *  -- 2 - Mostrar sequência Fibo --
 *  -- 3 - Fim 
 * 
 * Autor: Gustavo Alves
 */

package p1questoes;

import javax.swing.JOptionPane;

public class P1_Ex3 {

	public static void main(String[] args) {
		int[] vetor = new int[300];
		int op;

		do {
			op = Integer.parseInt(
					JOptionPane.showInputDialog("Menu Principal\n1 - Carregar vetor\n2 - Mostrar Fibonacci\n9 - Fim"));

			switch (op) {
			case 1:
				vetor = P1_Ex1.carregarVetor(vetor);
				JOptionPane.showMessageDialog(null, "Vetor carredo com sucesso!");
				break;
			case 2:
				for (int i = 0; i < vetor.length; i++) {
					if (vetor[i] >= 1 && vetor[i] <= 10)
						P1_Ex2.fibonacci(vetor[i]);
				}
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Encerrando .. ");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
			}
			
		} while (op != 9);

	}

}
