/*
 * Objetivo     : 33. Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 *
 * Programador  : Gustavo Alves
 * Data Criação : 8 de mar de 2019
 */

package funcao;

import javax.swing.JOptionPane;

public class Lt01_Func33 {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro",
				"Série 1 + 1/2 + 1/3 + ... + 1/N", JOptionPane.QUESTION_MESSAGE));

		JOptionPane.showMessageDialog(null, String.format("Resultado da série = %,.2f", serie33(number)),
				"Série 1 + 1/2 + 1/3 + ... + 1/N", JOptionPane.INFORMATION_MESSAGE);
	}

	public static double serie33(int number) {
		double series = 0;

		for (int i = 1; i <= number; i++)
			series += (double) 1 / i;

		return series;
	}

}
