/*
 * Objetivo: Criar e coletar um vetor [50] inteiro. Calcular e exibir:
 * 	a. A média dos valores entre 10 e 200;
 * 	b. A soma dos números ímpares.
 * 
 * Autor: Gustavo Alves
 * Data: 22/03/2019
 */

package vetor;

import java.util.Scanner;

public class Lt01_VetorEx01 {

	public static void main(String[] args) {
		int[] array = new int[50];

		fill(array);

		System.out.printf("Média dos valores entre 10 e 200 = %,.1f%n", average(array));
		System.out.printf("Soma dos números ímpares = %d", sumOdd(array));
	}

	public static void fill(int[] array) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d° Valor: ", i + 1);
			array[i] = scanner.nextInt();
		}

		scanner.close();
	}

	public static double average(int[] array) {
		double average = 0;
		double counter = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 10 && array[i] < 200) {
				average += array[i];
				counter++;
			}
		}

		average = average / counter;

		return average;
	}

	public static int sumOdd(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1)
				sum += array[i];
		}

		return sum;
	}
}
