/*
 * Objetivo: Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
 * Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. 
 * ex: VT1| 1| 2| 3|    |VT2| 4| 5| 6|  >> |VT3| 1| 2| 3| 4| 5| 6
 * 
 * Autor: Gustavo Alves
 * Data: 22/03/2019
 */

package vetor;

import java.util.Scanner;

public class Lt01_VetorEx03 {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array1 = new int[3];
		int[] array2 = new int[3];

		System.out.println("- Valores para o primeiro vetor");
		fill(array1);

		System.out.println("\n- Valores para o segundo vetor");
		fill(array2);

		int[] array3 = concatenate(array1, array2);

		System.out.println();

		display(array3);
	}

	public static void fill(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d° Valor: ", i + 1);
			array[i] = scanner.nextInt();
		}
	}

	public static int[] concatenate(int[] array1, int[] array2) {
		int[] array3 = new int[array1.length + array2.length];

		for (int i = 0; i < array3.length; i++) {
			if (i < array1.length)
				array3[i] = array1[i];
			else
				array3[i] = array2[i - array1.length];
		}

		return array3;
	}

	public static void display(int[] array) {
		for (int value : array) {
			System.out.print(value + " ");
		}
	}
}
