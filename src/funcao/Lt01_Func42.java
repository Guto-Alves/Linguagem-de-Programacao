/*
 * Objetivo     : 42. Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 *
 * Programador  : Gustavo Alves
 * Data Criação : 9 de mar de 2019
 */

package funcao;

public class Lt01_Func42 {

	public static void main(String[] args) {
		System.out.printf("Summation of the series is: %,.2f", calculaSerie());

	}

	public static double calculaSerie() {
		double series = 0;
		int odd = 1;
		for (int i = 1; i <= 50; i++) {
			series += (double) i / odd;
			odd += 2;
		}

		return series;
	}

}
