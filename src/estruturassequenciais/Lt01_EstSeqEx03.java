/*
 * Objetivo: Receba a base e a altura de um tri‚ngulo. Calcule e mostre a sua ·rea.
 * 
 * Autor: Gustavo Alves
 * Data: 9 de fev de 2019
 */

package estruturassequenciais;

import java.util.Scanner;

public class Lt01_EstSeqEx03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a base: ");
		double base = scanner.nextDouble();

		System.out.print("Digite a altura: ");
		double altura = scanner.nextDouble();
		scanner.close();

		double areaTriangulo = (base * altura) / 2;

		System.out.printf("%n¡rea do tri‚ngulo È %,.1f cm≤", areaTriangulo);

	}

}
