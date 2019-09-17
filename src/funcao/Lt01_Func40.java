/*
 * Objetivo     : 40. Receba 2 n�meros inteiros. Verifique e mostre todos os n�meros primos existentes entre eles.
 *
 * Programador  : Gustavo Alves
 * Data Cria��o : 9 de mar de 2019
 */

package funcao;

import javax.swing.JOptionPane;

public class Lt01_Func40 {

	public static void main(String[] args) {
		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro"));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero inteiro"));

		JOptionPane.showMessageDialog(null, "Primo(s) entre os n�meros digitados: " + primeNumbers(number1, number2),
				"Primos entre os n�meors ", JOptionPane.INFORMATION_MESSAGE);

	}

	public static boolean isPrime(int number) {
		if (number < 2)
			return false;

		if (number % 2 == 0 && number > 2)
			return false;

		int root = (int) Math.sqrt(number);

		for (int i = 2; i <= root; i += 2) {
			if (number % i == 0)
				return false;
		}

		return true;
	}

	public static String primeNumbers(int number1, int number2) {
		String primosString = "";
		int largest;
		int smaller;

		if (number1 > number2) {
			largest = number1;
			smaller = number2;
		} else {
			largest = number2;
			smaller = number1;
		}

		// Verifica todos os n�meros primos existentes entre eles
		for (int i = smaller + 1; i < largest; i++) {
			if (isPrime(i))
				primosString += i + " ";
		}

		if (primosString.equals(""))
			primosString = "n�o existe!";

		return primosString;
	}

}
