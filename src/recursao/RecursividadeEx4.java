/*
 * Objetivo: Serie4 = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N) 
 * 
 * Autor: Gustavo Alves
 * Data: 16/03/2019
 */

package recursao;

import javax.swing.JOptionPane;

public class RecursividadeEx4 {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro: ",
				" Serie = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N)", JOptionPane.QUESTION_MESSAGE));

		JOptionPane.showMessageDialog(null, String.format("Resutado da série = %,.2f", calculaSerie4(number, 1)),
				" Serie = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N)", JOptionPane.INFORMATION_MESSAGE);

	}

	public static double calculaSerie4(int number, int denominator) {
		return number <= 1 ? number : (number / denominator) + calculaSerie4(number - 1, denominator + 1);

	}

}
