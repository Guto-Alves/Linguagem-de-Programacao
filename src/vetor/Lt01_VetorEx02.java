/*
 * Objetivo: Criar e coletar um vetor [100] inteiro e exibir:
 * a. O maior e o menor valor;
 * b. A média dos valores.
 * 
 * Autor: Gustavo Alves
 * Data: 22/03/2019
 */

package vetor;

import java.util.Scanner;

public class Lt01_VetorEx02 {

	public static void main(String[] args) {
		int[] array = new int[100];

		array = fill(array);
		displaySmallestAndLargest(array);
		System.out.printf("Média dos valores é de %,.1f", average(array));
	}

	public static int[] fill(int[] array) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d° Valor: ", i + 1);
			array[i] = scanner.nextInt();
		}
		scanner.close();
		return array;
	}

	public static void displaySmallestAndLargest(int[] array) {
		int smaller = array[0];
		int largest = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > largest)
				largest = array[i];
			if (array[i] < smaller)
				smaller = array[i];
		}

		System.out.printf("O maior valor é %d%n", largest);
		System.out.printf("O menor valor é %d%n", smaller);
	}

	public static double average(int[] array) {
		double average = 0;

		for (int valor : array)
			average += valor;

		average /= array.length;

		return average;
	}

}
