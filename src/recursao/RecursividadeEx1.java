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
		JOptionPane.showMessageDialog(null, "Resultado da série = %d", "Serie = (1+2+3+...+100)",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public static int calculaSerie1(int number) {
		return number == 1 ? 1 : number + calculaSerie1(number - 1);
	}

}
