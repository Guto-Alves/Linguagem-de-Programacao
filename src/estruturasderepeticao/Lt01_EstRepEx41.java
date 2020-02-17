/*
 * Objetivo   : Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 *
 * Programador: Gustavo Alves
 * Data       : 21 de fev de 2019
 */

package estruturasderepeticao;

public class Lt01_EstRepEx41 {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 7) {
					System.out.printf("%d + %d = %d%n", i, j, i + j);
				}
			}
		}
	}

}
