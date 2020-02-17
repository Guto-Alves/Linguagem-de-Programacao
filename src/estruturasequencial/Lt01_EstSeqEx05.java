/*
 * Objetivo:  Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0).
 * Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).
 *
 * Autor: Gustavo Alves
 * Data: 9 de fev de 2019
 */

package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, c;
		double raiz1, raiz2;

		System.out.print("Digite o coeficiente A: ");
		a = scanner.nextInt();

		System.out.print("Digite o coeficiente B: ");
		b = scanner.nextInt();

		System.out.print("Digite o coeficiente C: ");
		c = scanner.nextInt();
		scanner.close();

		raiz1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		raiz2 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

		System.out.printf("Raiz 1: %,.2f%n", raiz1);
		System.out.printf("Raiz 2: %,.2f%n", raiz2);
	}

}
