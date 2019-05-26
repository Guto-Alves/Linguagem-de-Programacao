/*
 * Objetivo   : Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 *
 * Programador: Gustavo Alves
 * Data       : 21 de fev de 2019
 */

package estruturasderepeticao;

public class Lt01_EstRepEx45 {

	public static void main(String[] args) {
		double serie = 0;

		for (int i = 1; i <= 15; i++)
			serie += i / Math.pow(i, 2);

		System.out.printf("Result of the series is: %,.2f ", serie);

	}
}
