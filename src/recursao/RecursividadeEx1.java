/*
 * Objetivo: Serie1 = (1+2+3+...+100)
 * 
 * Autor: Gustavo Alves
 * Data: 15/03/2019
 */

package recursao;

import javax.swing.JOptionPane;

public class RecursividadeEx1 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, String.format("Resultado da série = %d", calculaSerie(1)),
				"Serie = (1+2+3+...+100)", JOptionPane.INFORMATION_MESSAGE);
	}

	public static int calculaSerie(int number) {
		return number == 100 ? 100 : number + calculaSerie(number + 1);
	}

}
