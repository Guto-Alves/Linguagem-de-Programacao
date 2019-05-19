/*
 * Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.
 * 
 * Autor: Gustavo Alves
 * Data: 14 de fev de 2019
 */

package estruturasdedecisoes;

import javax.swing.JOptionPane;

public class Lt01_EstDecEx19 {

	public static void main(String[] args) {
		double number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero real: "));
		double number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro n�mero real: "));

		if (number1 == number2)
			JOptionPane.showMessageDialog(null, "- Os n�meros s�o iguais ", "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		else if (number1 > number2)
			JOptionPane.showMessageDialog(null, String.format("O maior � %,.1f", number1), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, String.format("O maior � %,.1f", number2), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
	}

}
