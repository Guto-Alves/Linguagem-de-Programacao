/*
 * Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 * 
 * Autor: Gustavo Alves
 * Data: 14 de fev de 2019
 */

package estruturasdedecisao;

import java.util.Scanner;

public class Lt01_EstDecEx22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um inteiro: ");
		int number1 = scanner.nextInt();

		System.out.print("Digite outro inteiro: ");
		int number2 = scanner.nextInt();
		scanner.close();

		if (number1 == number2)
			System.err.print("Exception: os números devem ser diferentes!");
		else if (number1 > number2)
			System.out.printf("Ordem crescente: %d, %d.%n", number2, number1);
		else
			System.out.printf("Ordem crescente: %d, %d.%n", number1, number2);
	}

}
