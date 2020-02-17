/*
 * Objetivo   : Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 *
 * Programador: Gustavo Alves
 * Data       : 21 de fev de 2019
 */

package estruturasderepeticao;

import java.util.Scanner;

public class Lt01_EstRepEx33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number;
		double serie = 0;

		System.out.print("Enter a integer: ");
		number = input.nextInt();
		input.close();

		for (int i = 1; i <= number; i++)
			serie += 1 / (double) i;

		System.out.printf("Series result is %,.2f%n", serie);
	}

}
