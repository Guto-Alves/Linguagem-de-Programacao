/*
 * Objetivo: Criar e coletar em um vetor [20] com números aleatórios. 
 * Classificar este vetor em ordem crescente e mostre os dados.
 * 
 * Autor: Gustavo Alves
 * Data: 23/03/2019
 */

package vetor;

import java.security.SecureRandom;
import java.util.Arrays;

public class Lt01_VetorEx06 {
	private static final SecureRandom random = new SecureRandom();

	public static void main(String[] args) {
		int[] array = new int[20];

		fillArray(array);
		displayArray(array);

		bubbleSort(array);
		displayArray(array);
	}

	public static void fillArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(21);
		}
	}

	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
	}

	public static void displayArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
}
