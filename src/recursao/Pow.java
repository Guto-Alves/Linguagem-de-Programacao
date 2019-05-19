/*
 * Objetivo:  Implemente uma função recursiva que,
 * dados dois números inteiros x e n, calcula o
 * valor de x ^ n.
 * 
 * Autor: Gustavo Alves
 * Data: 16/03/2019
 */

package recursao;

public class Pow {

	public static void main(String[] args) {
		System.out.println(pow(2, 0));
	}

	public static int pow(int base, int expoente) {
		return expoente == 0 ? 1 : base * pow(base, expoente - 1);

	}

}
