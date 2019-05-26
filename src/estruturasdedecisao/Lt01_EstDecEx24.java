/*
 * Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 *  
 * Autor: Gustavo Alves
 * Data: 14 de fev de 2019
 */

package estruturasdedecisao;

import java.util.Scanner;

public class Lt01_EstDecEx24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int number = scanner.nextInt();
		scanner.close();

		if (number % 2 == 0 && number % 3 == 0)
			System.out.printf("%d é divisível por 2 e 3.%n", number);
		else
			System.out.printf("%d não é divisível por 2 e 3.", number);

	}

}
