/*
 * Objetivo: Receba 2 números reais. Calcule e mostre a diferença desses valores.
 * @author Gustavo Alves
 * @date 9 de fev de 2019
 */

package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double number1;
		double number2;

		System.out.print("Digite um número real: ");
		number1 = scanner.nextDouble();

		System.out.println("Digite outro número real: ");
		number2 = scanner.nextDouble();
		scanner.close();

		double diferenca = number1 - number2;

		System.out.printf("Diferença = %,.f", diferenca);

	}

}
