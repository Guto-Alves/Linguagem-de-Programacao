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
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro inteiro"));

		ordemCrescente(numero1, numero2);

	}

	public static void ordemCrescente(int numero1, int numero2) {
		if (numero1 < numero2)
			JOptionPane.showMessageDialog(null, String.format("%d, %d.", numero1, numero2), "Ordem Crescente",
					JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, String.format("%d, %d.", numero2, numero1), "Ordem Crescente",
					JOptionPane.INFORMATION_MESSAGE);

	}

}
