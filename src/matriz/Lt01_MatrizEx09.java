/*
 * Objetivo: Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a
 * diagonal principal terá seus dados carregados no programa segundo:
 *		1			
 *			4			
 *				16		
 *					64
 *
 * Autor: Gustavo Alves
 * Data: 28/03/2019
 */

package matriz;

import java.security.SecureRandom;
import javax.swing.JOptionPane;

public class Lt01_MatrizEx09 {

	public static void main(String[] args) {
		int[][] array = new int[4][4];

		array = fill(array);
		display(array);
	}

	public static int[][] fill(int[][] array) {
		SecureRandom random = new SecureRandom();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == j && i == 0)
					array[0][0] = 1;
				else if (i == j && i > 0)
					array[i][j] = array[i - 1][j - 1] * 4;
				else
					array[i][j] = random.nextInt(11);
			}

		}

		return array;
	}

	public static void display(int[][] array) {
		String arrayDisplay = "";

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++)
				arrayDisplay += String.format("%02d ", array[i][j]);
			arrayDisplay += "\n";
		}

		JOptionPane.showMessageDialog(null, arrayDisplay);
	}
}
