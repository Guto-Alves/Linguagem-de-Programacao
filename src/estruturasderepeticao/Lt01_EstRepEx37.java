/*
 * Objetivo   : Receba um n�mero inteiro. Calcule e mostre 
 * a s�rie de Fibonacci at� o seu N�n�simo termo.
 *
 * Programador: Gustavo Alves
 * Data       : 21 de fev de 2019
 */

package estruturasderepeticao;

import java.util.Scanner;

public class Lt01_EstRepEx37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int termo;

		System.out.print("Enter a number: ");
		termo = input.nextInt();
		input.close();

		int numAnterior = 0;
		int numAtual = 1;

		for (int i = 0; i <= termo; i++) {
			if (i <= 1)
				System.out.print(i + " ");
			else {
				int numProximo = numAnterior + numAtual;

				System.out.printf("%d ", numProximo);

				numAnterior = numAtual;
				numAtual = numProximo;
			}
		}
	}

}
