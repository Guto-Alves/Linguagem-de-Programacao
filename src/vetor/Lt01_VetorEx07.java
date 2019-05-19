/*
 * Objetivo: A partir do exercício 6 (vetor classificado) solicitar um valor qualquer 
 * e verificar a sua existência no vetor (utilizar pesquisa binária).
 * 
 * Autor: Gustavo Alves
 * Data: 23/03/2019
 */

package vetor;

import java.security.SecureRandom;
import java.util.Scanner;

public class Lt01_VetorEx07 {
	private static final SecureRandom random = new SecureRandom();

	public static void main(String[] args) {
		int[] array = new int[20];

		array = fillArray(array);
		array = bubbleSort(array);
		displayArray(array);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor procurado: ");

		if (binarySearch(array, scanner.nextInt()))
			System.out.print("Valor encontrado!");
		else
			System.out.println("Valor não encontrado!");

		scanner.close();

	}

	// verifica a existência de um valor no vetor usando o técnica da pesquisa
	// binária
	public static boolean binarySearch(int[] array, int key) {
		int start = 0;
		int middle = array.length / 2;
		int end = array.length - 1;

		while (start <= end) {
			if (key == array[middle])
				return true;
			else if (key > array[middle]) {
				start = middle + 1;
				middle = (start + end) / 2;
			} else {
				end = middle - 1;
				middle = (start + end) / 2;
			}

		}
		return false;

	}

	public static int[] fillArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(21);
			System.out.println(i + 1 + "° = " + array[i]);
		}
		return array;
	}

	public static int[] bubbleSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}

		return array;
	}

	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1)
				System.out.printf("%d.%n", array[i]);
			else
				System.out.printf("%d, ", array[i]);

		}
	}

}
