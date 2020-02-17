/*
 * Objetivo     : 35. Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e
 * mostre o resultado da somatória dos números ímpares entre esses valores.
 *
 * Programador  : Gustavo Alves
 * Data Criação : 9 de mar de 2019
 */

package funcao;

import javax.swing.JOptionPane;

public class Lt01_Func35 {

	public static void main(String[] args) {
		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));

		JOptionPane.showMessageDialog(null,
				String.format("Somatória dos impares entre %d e %d = %d", number1, number2,
						calcularSomatoriaDosImpares(number1, number2)),
				"Somatória Impares", JOptionPane.INFORMATION_MESSAGE);
	}

	public static int calcularSomatoriaDosImpares(int number1, int number2) {
		int largest;
		int smaller;
		int result = 0;

		if (number1 > number2) {
			largest = number1;
			smaller = number2;
		} else {
			largest = number2;
			smaller = number1;
		}

		for (int i = smaller + 1; i < largest; i++) {
			if (i % 2 == 1)
				result += i;
		}

		return result;
	}
}
