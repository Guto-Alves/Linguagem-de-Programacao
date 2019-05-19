/*
 * Objetivo: Receba os 2 n�meros inteiros. Calcule e mostre a soma dos quadrados.
 * Autor: Gustavo Alves
 * Data: 9 de fev de 2019
 */

package estruturassequenciais;

import java.util.Scanner;

public class Lt01_EstSeqEx09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		int number1 = input.nextInt();

		System.out.print("Digite outro n�mero: ");
		int number2 = input.nextInt();
		input.close();

		int somaDosQuadrados = number1 * number1 + number2 * number2;

		System.out.printf("Soma dos quadrados � %d%n", somaDosQuadrados);

	}

}
