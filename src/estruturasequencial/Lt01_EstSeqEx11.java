/*
 * Objetivo: Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
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

		System.out.printf("Digite o raio da circunferência: ");
		raio = scanner.nextDouble();
		scanner.close();

		comprimentoCircunferencia = 2 * Math.PI * raio;

		System.out.printf("Comprimento da circunferência = %,.2f m", comprimentoCircunferencia);
	}

}
