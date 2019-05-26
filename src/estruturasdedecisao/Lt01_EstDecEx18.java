/*
 * Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferen�a do maior pelo menor valor.
 * 
 * Autor: Gustavo Alves
 * Data: 14 de fev de 2019
 */

package estruturasdedecisao;

import javax.swing.JOptionPane;

public class Lt01_EstDecEx18 {

	public static void main(String[] args) {
		int number1, number2, difference;

		number1 = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite um inteiro", "N�mero 1", JOptionPane.PLAIN_MESSAGE));
		number2 = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite outro inteiro", "N�mero 2", JOptionPane.PLAIN_MESSAGE));

		if (number1 <= number2)
			difference = number2 - number1;
		else
			difference = number1 - number2;

		JOptionPane.showMessageDialog(null, String.format("A diferen�a dos n�meros � %d", difference),
				"Resultado da Diferen�a", JOptionPane.INFORMATION_MESSAGE);

	}

}
