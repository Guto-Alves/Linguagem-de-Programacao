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
		int[] vt1 = new int[3];
		int[] vt2 = new int[3];

		System.out.println("- Valores para o primeiro vetor");
		vt1 = fillArray(vt1);

		System.out.println("\n- Valores para o segundo vetor");
		vt2 = fillArray(vt2);

		int[] vt3 = concatenarVetores(vt1, vt2);

		displayArray(vt3);

	}

	public static int[] fillArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d° Valor: ", i + 1);
			array[i] = scanner.nextInt();
		}

		return array;
	}

	// concatena quaisquer dois vetores e retorna o vetor resultando
	public static int[] concatenarVetores(int[] vt1, int[] vt2) {
		int[] vt3 = new int[vt1.length + vt2.length];

		for (int i = 0; i < vt1.length; i++)
			vt3[i] = vt1[i];

		for (int i = 0; i < vt2.length; i++)
			vt3[i + vt1.length] = vt2[i];

		for (int i = 0; i < vt3.length; i++) {
			if (i < vt1.length)
				vt3[i] = vt1[i];
			else
				vt3[i] = vt2[i - vt1.length];
		}

		return vt3;

	}

	public static void displayArray(int[] array) {
		for (int valor : array)
			System.out.print(valor + " ");
	}

}
