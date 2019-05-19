/*
 * Objetivo     : 44. Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 *
 * Programador  : Gustavo Alves
 * Data Criação : 8 de mar de 2019
 */

package funcao;

import javax.swing.JOptionPane;

public class Lt01_Func44 {

	public static void main(String[] args) {
		int base = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite a base", "Potenciação", JOptionPane.QUESTION_MESSAGE));
		int expoente = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite o expoente", "Potenciação", JOptionPane.QUESTION_MESSAGE));

		JOptionPane.showMessageDialog(null, String.format("%d ^ %d = %d", base, expoente, potencia(base, expoente)),
				"Potenciação", JOptionPane.INFORMATION_MESSAGE);
	}

	public static int potencia(int base, int expoente) {
		int pow = 1;

		for (int i = 1; i <= expoente; i++)
			pow *= base;

		return pow;
	}

}
