/*
 * Objetivo     : Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
 * Casa: 1 2 3 4 ... 64
 * Qte:  1 2 4 8 ... N
 *
 * Programador  : Gustavo Alves
 * Data Criação : 9 de mar de 2019
 */

package funcao;

public class Lt01_Func39 {

	public static void main(String[] args) {
		System.out.println(graosTabuleiroXadrez());
	}

	public static String graosTabuleiroXadrez() {
		String tabela = String.format(" %4s%14s%n", "Casa", "N. grãos");

		for (int i = 0; i < 64; i++)
			tabela += String.format("  %02d\t\t%,.0f%n", i + 1, Math.pow(2, i));

		return tabela;
	}

}
