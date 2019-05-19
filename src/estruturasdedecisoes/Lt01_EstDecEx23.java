/*
 * Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e 
 * um 4º valor não necessariamente em ordem. 
 * Mostre os 4 números em ordem crescente.
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

		System.out.print("Digite o 1º valor: ");
		int number1 = input.nextInt();

		System.out.print("Digite o 2º valor: ");
		int number2 = input.nextInt();

		System.out.print("Digite o 3º valor: ");
		int number3 = input.nextInt();

		if (number1 < number2 && number2 < number3) {
			System.out.print("Digite o 4º valor (não necessiariamente em ordem): ");
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
			System.err.println("Exception: valores não estão em ordem crescente!");

		input.close();

	}
}
