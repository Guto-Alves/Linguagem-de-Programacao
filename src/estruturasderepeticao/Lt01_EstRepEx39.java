/*
 * Objetivo   : Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
 * Casa: 1 2 3 4 ... 64
 * Qte:  1 2 4 8 ... N
 *
 * Programador: Gustavo Alves
 * Data       : 21 de fev de 2019
 */

package estruturasderepeticao;

public class Lt01_EstRepEx39 {

	public static void main(String[] args) {
		System.out.printf("%s%10s%n", "Casa", "N. grãos");

		for (int i = 0; i < 64; i++)
			System.out.printf("%2d\t%,.0f%n", i + 1, Math.pow(2, i));

	}

}
