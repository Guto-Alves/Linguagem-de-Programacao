/*
 * Objetivo   : Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 *
 * Programador: Gustavo Alves
 * Data       : 21 de fev de 2019
 */

package estruturasderepeticoes;

import java.util.Scanner;

public class Lt01_EstRepEx36 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number;
		double series = 1;

		System.out.print("Enter a integer: ");
		number = scanner.nextInt();
		scanner.close();

		// Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
		for (int i = 1; i <= number; i++) {

			// calcula o fatorial do denominador da série
			int fat = 1;
			for (int j = i; j > 1; j--)
				fat *= j;

			series += (double) 1 / fat;
		}

		System.out.printf("Series result is %,.2f", series);

	}

}
