/*
 * Objetivo   : Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 *
 * Programador: Gustavo Alves
 * Data       : 21 de fev de 2019
 */

package estruturasderepeticoes;

public class Lt01_EstRepEx42 {

	public static void main(String[] args) {
		double series = 0;
		int odd = 1;
		for (int i = 1; i <= 50; i++) {
			series += (double) i / odd;
			odd += 2;
		}

		System.out.printf("Summation of the series is: %,.2f", series);

	}

}
