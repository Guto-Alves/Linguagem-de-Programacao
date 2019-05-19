/*
 * Objetivo     : 18. Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do
 * maior pelo menor valor.
 * 
 * Programador  : Gustavo Alves
 * Data Criação : 7 de mar de 2019
 */

package procedimento;

import javax.swing.JOptionPane;

public class Lt01_Proc18 {

	public static void main(String[] args) {
		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

		difference(number1, number2);
	}

	public static void difference(int number1, int number2) {
		int difference;

		if (number1 > number2)
			difference = number1 - number2;
		else
			difference = number2 - number1;

		JOptionPane.showMessageDialog(null, "Diferença dos números é " + difference, "Diferença de Dois Números",
				JOptionPane.INFORMATION_MESSAGE);

	}
}
