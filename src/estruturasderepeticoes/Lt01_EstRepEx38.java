/*
 * Objetivo   : Receba 100 n�meros inteiros reais. 
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
			System.out.printf("Digite o %d� n�mero: ", i + 1);
			double number = scanner.nextDouble();

			if (number < 0.0)
				System.out.println(" - Oops! insira somente n�meros posivitos. Tente novamente!");
			else {
				if (i == 0) { // primeiro n�mero digitado vai para o maior e menor
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