/*
 * Objetivo   : Receba 100 números inteiros reais. 
 * Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
 *
 * Programador: Gustavo Alves
 * Data       : 21 de fev de 2019
 */

package estruturasderepeticoes;

import java.util.Scanner;

public class Lt01_EstRepEx38 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double largest = 0;
		double smaller = 0;

		for (int i = 0; i < 100;) {
			System.out.printf("Digite o %dº número: ", i + 1);
			double number = scanner.nextDouble();

			if (number < 0.0)
				System.out.println(" - Oops! insira somente números posivitos. Tente novamente!");
			else {
				if (i == 0) { // primeiro número digitado vai para o maior e menor
					largest = number;
					smaller = number;
				} else {
					if (number > largest)
						largest = number;
					else if (number < smaller)
						smaller = number;
				}
				i++;
			}
		}
		scanner.close();

		System.out.printf("Largest is %,.2f%nSmaller is %,.2f", largest, smaller);

	}
}