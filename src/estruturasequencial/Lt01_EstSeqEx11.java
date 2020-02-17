/*
 * Objetivo: Receba o raio de uma circunfer�ncia. Calcule e mostre o comprimento da circunfer�ncia.
 * Autor: Gustavo Alves
 * Data: 9 de fev de 2019
 */

package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double comprimentoCircunferencia;
		double raio;

		System.out.printf("Digite o raio da circunfer�ncia: ");
		raio = scanner.nextDouble();
		scanner.close();

		comprimentoCircunferencia = 2 * Math.PI * raio;

		System.out.printf("Comprimento da circunfer�ncia = %,.2f m", comprimentoCircunferencia);
	}

}
