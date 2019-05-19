/*
 * Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e 
 * um 4� valor n�o necessariamente em ordem. 
 * Mostre os 4 n�meros em ordem crescente.
 * 
 * Autor: Gustavo Alves
 * Data: 14 de fev de 2019
 */

package estruturasdedecisoes;

import java.util.Scanner;

public class Lt01_EstDecEx23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("- Insira 3 valores obrigatoriamente em ordem crescente!");

		System.out.print("Digite o 1� valor: ");
		int number1 = input.nextInt();

		System.out.print("Digite o 2� valor: ");
		int number2 = input.nextInt();

		System.out.print("Digite o 3� valor: ");
		int number3 = input.nextInt();

		if (number1 < number2 && number2 < number3) {
			System.out.print("Digite o 4� valor (n�o necessiariamente em ordem): ");
			int number4 = input.nextInt();

			if (number4 <= number1)
				System.out.printf("Ordem crescente: %d, %d, %d, %d.", number4, number1, number2, number3);
			else if (number4 <= number2)
				System.out.printf("Ordem crescente: %d, %d, %d, %d.", number1, number4, number2, number3);
			else if (number4 <= number3)
				System.out.printf("Ordem crescente: %d, %d, %d, %d.", number1, number2, number4, number3);
			else
				System.out.printf("Ordem crescente: %d, %d, %d, %d.", number1, number2, number3, number4);

		} else
			System.err.println("Exception: valores n�o est�o em ordem crescente!");

		input.close();

	}
}
