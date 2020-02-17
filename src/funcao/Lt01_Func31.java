/*
 * Objetivo     : 31. Calcule e mostre o quadrado dos números entre 10 e 150.
 * 
 * Programador  : Gustavo Alves
 * Data Criação : 8 de mar de 2019
 */

package funcao;

public class Lt01_Func31 {

	public static void main(String[] args) {
		for (int i = 11; i < 150; i++)
			System.out.printf("%d² = %d%n", i, calcularQuadrado(i));
	}

	public static int calcularQuadrado(int number) {
		return number * number;
	}

}
