/*
 * Objetivo     : 22. Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 * 
 * Programador  : Gustavo Alves
 * Data Criação : 7 de mar de 2019
 */

package procedimento;

import javax.swing.JOptionPane;

public class Lt01_Proc22 {

	public static void main(String[] args) {
		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro inteiro"));

		showInAscendingOrder(number1, number2);
	}

	public static void showInAscendingOrder(int number1, int number2) {
		if (number1 < number2)
			JOptionPane.showMessageDialog(null, String.format("%d, %d.", number1, number2), "Ordem Crescente",
					JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, String.format("%d, %d.", number2, number1), "Ordem Crescente",
					JOptionPane.INFORMATION_MESSAGE);
	}

}
