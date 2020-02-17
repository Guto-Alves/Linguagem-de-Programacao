/*
 * Objetivo     :  Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 * 
 * Programador  : Gustavo Alves
 * Data Criação : 8 de mar de 2019
 */

package funcao;

public class Lt01_Func45 {

	public static void main(String[] args) {
		System.out.printf("Resultado da série = %,.2f", calcularSerie());
	}

	public static double calcularSerie() {
		double serie = 0;

		for (int i = 1; i <= 15; i++)
			serie += i / Math.pow(i, 2);

		return serie;
	}

}
