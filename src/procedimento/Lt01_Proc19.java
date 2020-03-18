/*
 * Objetivo     : 19. Receba 2 valores reais. Calcule e mostre o maior deles.
 * 
 * Programador  : Gustavo Alves
 * Data Criação : 7 de mar de 2019
 */

package procedimento;

import javax.swing.JOptionPane;

public class Lt01_Proc19 {

	public static void main(String[] args) {
		double number1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número real",
				"Maior de Dois Números", JOptionPane.PLAIN_MESSAGE));
		double number2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro número real:",
				"Maior de Dois Números", JOptionPane.PLAIN_MESSAGE));

		max(number1, number2);
	}

	public static void max(double number1, double number2) {
		if (number1 > number2)
			JOptionPane.showMessageDialog(null, String.format("O maior é %,.2f", number1), "Maior de Dois Números",
					JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, String.format("O maior é %,.2f", number2), "Maior de Dois Números",
					JOptionPane.INFORMATION_MESSAGE);
	}

}
