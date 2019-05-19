/*
 * Objetivo   : Receba um número inteiro. Calcule e mostre o seu fatorial.
 *
 * Programador: Gustavo Alves
 * Data       : 21 de fev de 2019
 */

package estruturasderepeticoes;

import javax.swing.JOptionPane;

public class Lt01_EstRepEx32 {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a integer: ", "Calculate the Factorial",
				JOptionPane.QUESTION_MESSAGE));

		int fat = 1;

		for (int i = number; i > 1; i--)
			fat *= i;

		JOptionPane.showMessageDialog(null, String.format("%d! = %d", number, fat), "Factorial is",
				JOptionPane.INFORMATION_MESSAGE);

	}
}
