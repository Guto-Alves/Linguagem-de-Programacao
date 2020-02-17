/*
 * Objetivo   : Receba 2 números inteiros. Verifique e mostre todos
 * os números primos existentes entre eles.
 *
 * Programador: Gustavo Alves
 * Data       : 21 de fev de 2019
 */

package estruturasderepeticao;

import java.util.Scanner;

public class Lt01_EstRepEx40 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number1, number2;
		int largest;
		int smaller;

		System.out.print("Digite um número inteiro: ");
		number1 = scanner.nextInt();

		System.out.print("Digite outro número inteiro: ");
		number2 = scanner.nextInt();
		scanner.close();

		if (number1 < number2) {
			smaller = number1;
			largest = number2;
		} else {
			smaller = number2;
			largest = number1;
		}

		System.out.print("\nPrimos entre os números digitados: ");

		for (int i = smaller + 1; i < largest; i++) {

			boolean isPrimo = true;

			if (i < 2) {
				isPrimo = false;
			} else {
				double root = Math.sqrt(i);

				for (int j = 2; j <= root; j++) {
					if (i % j == 0) {
						isPrimo = false;
						break;
					}
				}
			}

			if (isPrimo) {
				System.out.printf("%d ", i);
			}
		}
	}

}
