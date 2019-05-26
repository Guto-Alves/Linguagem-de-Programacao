/*
 * Objetivo   : Receba um número. Calcule e mostre os resultados da tabuada desse número.
 *
 * Programador: Gustavo Alves
 * Data       : 21 de fev de 2019
 */

package estruturasderepeticao;

import java.util.Scanner;

public class Lt01_EstRepEx34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number;

		System.out.print("Enter a integer: ");
		number = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= 10; i++)
			System.out.printf("%d x %d = %d%n", number, i, number * i);

	}

}
