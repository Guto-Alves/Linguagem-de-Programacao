/*
 * Objetivo: Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
 * 
 * Autor: Gustavo Alves
 * Data: 10 de fev de 2019
 */

package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("1º ângulo: ");
		int angulo1 = input.nextInt();

		System.out.print("2º ângulo: ");
		int angulo2 = input.nextInt();

		int angulo3 = 180 - (angulo1 + angulo2);

		System.out.printf("3º ângulo = %d", angulo3);

		input.close();

	}

}
