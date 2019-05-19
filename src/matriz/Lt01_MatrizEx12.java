/*
 * Objetivo: 12. Carregar códigos das peças em um tabuleiro de xadrez, onde:
 * 	Código:  1 		2		3		4		 5		 6		7
 * 	Peça:	Peão  Torre   Bispo   Cavalo   Rainha   Rei    Vazio
 * 
 * Autor: Gustavo Alves
 * Data: 28/03/2019
 */

package matriz;

import java.security.SecureRandom;

public class Lt01_MatrizEx12 {
	private static final SecureRandom random = new SecureRandom();

	public static void main(String[] args) {
		int[][] chessboard = new int[8][8];

		chessboard = fillChessboard(chessboard);
		displayChessboard(chessboard);
		piecesSum(chessboard);

	}

	public static int[][] fillChessboard(int[][] chessboard) {
		for (int i = 0; i < chessboard.length; i++) {
			for (int j = 0; j < chessboard.length; j++)
				chessboard[i][j] = 1 + random.nextInt(7);
		}

		return chessboard;
	}

	public static void piecesSum(int[][] chessboard) {
		int[] piecesCounter = new int[8];

		for (int i = 0; i < chessboard.length; i++) {
			for (int j = 0; j < chessboard.length; j++)
				piecesCounter[chessboard[i][j]]++;
		}

		for (int i = 1; i < piecesCounter.length; i++)
			System.out.printf("%d = %d%n", i, piecesCounter[i]);

	}

	public static void displayChessboard(int[][] chessboard) {
		for (int i = 0; i < chessboard.length; i++) {
			for (int j = 0; j < chessboard.length; j++) {
				System.out.print(chessboard[i][j] + "  ");
			}

			System.out.println();
		}

	}

}
