/*
 * Objetivo:  Receba a temperatura em graus Celsius. Calcule e mostre
 * a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
 * 
 * Autor: Gustavo Alves
 * Data: 9 de fev de 2019
 */

package estruturassequenciais;

import java.util.Scanner;

public class Lt01_EstSeqEx04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a temperatura em Celsius: ");
		double Celsius = scanner.nextDouble();
		scanner.close();

		double Fahrenheit = (9 * Celsius + 160) / 5;

		System.out.printf("%,.2f °C = %,.2f °F", Celsius, Fahrenheit);

	}

}
