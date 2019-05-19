/*
 * Objetivo: Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
 * 		1	1	1	1	1	1	1	1
 * 		1	2	2	2	2	2	2	1
 * 		1	2	3	3	3	3	2	1
 * 		1	2	3	4	4	3	2	1
 * 		1	2	3	4	4	3	2	1
 * 		1	2	3	3	3	3	2	1
 * 		1	2	2	2	2	2	2	1
 * 		1	1	1	1	1	1	1	1			
 * 	
 * 
 * Autor: Gustavo Alves
 * Data: 28/03/2019
 */

package matriz;

import javax.swing.JOptionPane;

public class Lt01_MatrizEx11 {

	public static void main(String[] args) {
		int[][] array = new int[8][8];

		array = spiral(array);
		displayArray(array);
	}

	// prencher o array em forma de uma espiral
	public static int[][] spiral(int[][] array) {
		for (int i = 1; i <= 4; i++) {
			for (int row = (i - 1); row <= (array.length - i); row++) {
				for (int column = (i - 1); column <= (array.length - i); column++)
					array[row][column] = i;
			}
		}

		return array;

	}

	public static void displayArray(int[][] array) {
		String display = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++)
				display += array[i][j] + "        ";
			display += "\n";
		}

		JOptionPane.showMessageDialog(null, display, "Espiral", JOptionPane.PLAIN_MESSAGE);
	}

}
