/*
 * Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
 * 
 * Autor: Gustavo Alves
 * Data: 15/03/2019
 */

package recursao;

import javax.swing.JOptionPane;

public class RecursividadeEx0 {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro: ", "Fatorial",
				JOptionPane.QUESTION_MESSAGE));

		JOptionPane.showMessageDialog(null, String.format("%d! = %d", number, fatorial(number)), "Fatorial",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public static int fatorial(int number) throws IllegalArgumentException {
		if (number < 0)
			throw new IllegalArgumentException("Não existe fatorial de número negativo");

		return number == 0 ? 1 : number * fatorial(number - 1);
	}

}
