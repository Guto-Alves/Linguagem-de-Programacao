/*
 * Objetivo     : 40. Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
 *
 * Programador  : Gustavo Alves
 * Data Criação : 9 de mar de 2019
 */

package funcao;

import javax.swing.JOptionPane;

public class Lt01_Func40 {
	private enum Status {
		YES, NO
	};

	public static void main(String[] args) {
		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));

		JOptionPane.showMessageDialog(null, "Primos entre os números digitados: " + primeNumbers(number1, number2),
				"Primos entre os númeors ", JOptionPane.INFORMATION_MESSAGE);

	}

	public static String primeNumbers(int number1, int number2) {
		String primosString = "";
		int largest;
		int smaller;
		Status primo = Status.YES;

		if (number1 > number2) {
			largest = number1;
			smaller = number2;
		} else {
			largest = number2;
			smaller = number1;
		}

		// Verifica todos os números primos existentes entre eles
		for (int i = smaller + 1; i < largest; i++) {
			// verica se i é primo
			double root = Math.sqrt(i);

			for (int j = 2; j <= root; j++) {
				if (i % j == 0) {
					primo = Status.NO;
					break;
				}
			}

			if (primo == Status.YES && i != 1)
				primosString += i + " ";

			primo = Status.YES;
		}

		if (primosString.equals(""))
			primosString = "não existe!.";

		return primosString;
	}

}
