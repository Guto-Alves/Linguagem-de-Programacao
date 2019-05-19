/*
 * Objetivo: Serie2 = (N) + (N-1) + (N-2) + ... + (1) 
 * 
 * Autor: Gustavo Alves
 * Data: 16/03/2019
 */

package recursao;

import javax.swing.JOptionPane;

public class RecursividadeEx2 {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

		JOptionPane.showMessageDialog(null, String.format("Resultado da série é %d", calculaSerie2(number)),
				"Serie = (N) + (N-1) + (N-2) + ... + (1) ", JOptionPane.INFORMATION_MESSAGE);

	}

	public static int calculaSerie2(int number) {
		return number <= 1 ? number : number + calculaSerie2(number - 1);

	}

}
