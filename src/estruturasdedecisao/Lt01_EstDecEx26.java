/*
 * Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 * 
 * Autor: Gustavo Alves
 * Data: 15 de fev de 2019
 */

package estruturasdedecisao;

import java.util.Scanner;

public class Lt01_EstDecEx26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um inteiro: ");
		int number1 = scanner.nextInt();

		System.out.print("Digite outro inteiro: ");
		int number2 = scanner.nextInt();
		scanner.close();

		if (number1 > number2) {
			if (number1 % number2 == 0)
				System.out.printf("%d é multiplo do %d", number1, number2);
			else
				System.out.printf("%d é não multiplo do %d", number1, number2);

		} else {
			if (number2 % number1 == 0)
				System.out.printf("%d é multiplo do %d", number2, number1);
			else
				System.out.printf("%d é não multiplo do %d", number1, number2);

		}
	}

}
