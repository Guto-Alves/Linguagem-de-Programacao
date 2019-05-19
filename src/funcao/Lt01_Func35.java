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
		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro"));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro"));

		JOptionPane.showMessageDialog(null, String.format("Somatória dos impares entre %d e %d = %d", number1, number2,
				somatoriaImpares(number1, number2)), "Somatória Impares", JOptionPane.INFORMATION_MESSAGE);
		somatoriaImpares(number1, number2);

	}

	public static int somatoriaImpares(int number1, int number2) {
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
