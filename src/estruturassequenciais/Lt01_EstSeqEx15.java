/*
 * Objetivo: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
 * 
 * Autor: Gustavo Alves
 * Data: 10 de fev de 2019
 */

package estruturassequenciais;

import java.util.Scanner;

public class Lt01_EstSeqEx15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int cateto1;
		int cateto2;
		double hipotenusa;

		System.out.printf("1º cateto: ");
		cateto1 = input.nextInt();

		System.out.printf("2º cateto: ");
		cateto2 = input.nextInt();
		input.close();

		hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

		System.out.printf("Hipotenusa = %,.0f cm", hipotenusa);

	}

}
