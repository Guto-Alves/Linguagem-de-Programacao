/*
 * Objetivo: 10. Criar uma matriz [8][8] onde o programa irá carregar segundo:
 * 							casa: 	1	2	3	4	...
 * 							valor:	1	2 	4	8 	...
 * 									Exibir a soma dos valores
 * 
 * Autor: Gustavo Alves
 * Data: 29/03/2019
 */

package matriz;

public class Lt01_MatrizEx10 {

	public static void main(String[] args) {
		double[][] array = new double[8][8];

		array = load(array);
		display(array);
		sum(array);
	}

	public static double[][] load(double[][] array) {
		int expoent = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = Math.pow(2, expoent);
				expoent++;
			}
		}

		return array;
	}

	public static void display(double[][] array) {
		System.out.printf("%7s %30s%n", "Casa", "Valor");

		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++)
				System.out.printf("%5d %,30.0f%n", ++counter, array[i][j]);
		}
	}

	public static void sum(double[][] array) {
		double sum = 0.0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++)
				sum += array[i][j];
		}

		System.out.printf("%10s = %,.0f", "Soma dos valores", sum);
	}

}
