/*
 * Objetivo: Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N)
 * 
 * Autor: Gustavo Alves
 * Data: 16/03/2019
 */

package recursao;

import javax.swing.JOptionPane;

public class RecursividadeEx3 {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro: ",
				"Serie = (1/1) + (1/2) + (1/3) + ....+ (1/N)", JOptionPane.QUESTION_MESSAGE));

		JOptionPane.showMessageDialog(null, String.format("Resutado da série é de %,.2f", calculaSerie3(number)),
				"Serie = (1/1) + (1/2) + (1/3) + ....+ (1/N)", JOptionPane.INFORMATION_MESSAGE);
	}

	public static double calculaSerie3(int number) {
		return number == 1 ? 1 : ((double) 1 / number) + (1 / calculaSerie3(number - 1));

	}

}
