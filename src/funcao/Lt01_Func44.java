/*
 * Objetivo     : 44. Receba o n�mero da base e do expoente. Calcule e mostre o valor da pot�ncia.
 *
 * Programador  : Gustavo Alves
 * Data Cria��o : 8 de mar de 2019
 */

package funcao;

import javax.swing.JOptionPane;

public class Lt01_Func44 {

	public static void main(String[] args) {
		int base = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite a base", "Potencia��o", JOptionPane.QUESTION_MESSAGE));
		int expoente = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite o expoente", "Potencia��o", JOptionPane.QUESTION_MESSAGE));

		JOptionPane.showMessageDialog(null, String.format("%d ^ %d = %d", base, expoente, potencia(base, expoente)),
				"Potencia��o", JOptionPane.INFORMATION_MESSAGE);
	}

	public static int potencia(int base, int expoente) {
		int pow = 1;

		for (int i = 1; i <= expoente; i++)
			pow *= base;

		return pow;
	}

}
