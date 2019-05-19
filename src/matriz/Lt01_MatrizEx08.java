/*
 * Objetivo: Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos
 * vendidos em 4 semanas. Calcular e exibir:
 * 	a. A quantidade de cada produto vendido no mês;
 * 	b. A quantidade de produtos vendidos por semana;
 * 	c. O total de produtos vendidos no mês.
 * 
 * Autor: Gustavo Alves
 * Data: 28/03/2019
 */

package matriz;

import java.util.Scanner;

public class Lt01_MatrizEx08 {

	public static void main(String[] args) {
		int[][] array = new int[4][3];

		array = preencherArray(array);
		quantidadeCadaProduto(array);
		quantidadeProdutosSemana(array);
		totalProdutos(array);

	}

	public static int[][] preencherArray(int[][] array) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.printf("%d° semana, %d° produto: ", i + 1, j + 1);
				array[i][j] = input.nextInt();
			}
		}
		input.close();

		return array;

	}

	public static void quantidadeCadaProduto(int[][] array) {
		int[] produtos = new int[3];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++)
				produtos[j] += array[i][j];
		}

		for (int i = 0; i < produtos.length; i++)
			System.out.printf("Produto %d vendeu = %d%n", i + 1, produtos[i]);

	}

	public static void quantidadeProdutosSemana(int[][] array) {
		int[] quantidadeSemana = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++)
				quantidadeSemana[i] += array[i][j];
		}

		for (int i = 0; i < quantidadeSemana.length; i++)
			System.out.printf("Na semana %d vendeu = %d%n", i + 1, quantidadeSemana[i]);

	}

	public static void totalProdutos(int[][] array) {
		int total = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++)
				total += array[i][j];
		}

		System.out.printf("Total de produtos vendidos no mês é %d%n", total);
	}
}
