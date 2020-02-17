/*
 * Objetivo   : Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 *
 * Programador: Gustavo Alves
 * Data       : 21 de fev de 2019
 */

package estruturasderepeticao;

public class Lt01_EstRepEx42 {

	public static void main(String[] args) {
		double result = 0;
		int denominator = 1;

		for (int numerator = 1; numerator <= 50; numerator++) {
			result += (double) numerator / denominator;
			denominator += 2;
		}

		System.out.printf("Summation of the series is: %,.2f", result);
	}

}
