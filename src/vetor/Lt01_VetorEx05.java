/*
 * Objetivo: Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo: Σ (A[1] – A[21–1]) i = 1
 * 
 * Autor: Gustavo Alves
 * Data: 23/03/2019
 */

package vetor;

import java.util.Scanner;

public class Lt01_VetorEx05 {

	public static void main(String[] args) {
		int[] array = new int[20];

		array = preencherArray(array);

		System.out.printf("Resultado: %d", somatoriaSerie(array));

	}

	public static int[] preencherArray(int[] array) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d° Valor: ", i + 1);
			array[i] = scanner.nextInt();
		}
		scanner.close();

		return array;
	}

	public static int somatoriaSerie(int[] array) {
		int result = 0;

		for (int i = 0; i < array.length / 2; i++)
			result += array[i] - array[i + array.length / 2];

		return result;

	}

}
