/*
 * Objetivo   : Receba 2 números inteiros. Verifique e mostre todos
 * os números primos existentes entre eles.
 *
 * Programador: Gustavo Alves
 * Data       : 21 de fev de 2019
 */

package estruturasderepeticoes;

import java.util.Scanner;

public class Lt01_EstRepEx40 {
	private enum Status {
		YES, NO
	};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number1, number2;
		int largest;
		int smaller;
		Status primo = Status.YES;

		System.out.print("Digite um número inteiro: ");
		number1 = scanner.nextInt();

		System.out.print("Digite outro número inteiro: ");
		number2 = scanner.nextInt();
		scanner.close();

		if (number1 > number2) {
			largest = number1;
			smaller = number2;
		} else {
			largest = number2;
			smaller = number1;
		}

		System.out.print("\nPrimos Entre os Números Digitados: ");
		for (int i = smaller + 1; i < largest; i++) {

			double root = Math.sqrt(i);
			for (int j = 2; j <= root; j++) {
				if (i % j == 0) {
					primo = Status.NO;
					break;
				}
			}

			if (primo == Status.YES && i != 1)
				System.out.printf("%d ", i);

			primo = Status.YES;

		}
	}

}
