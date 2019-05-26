/*
 * Receba 3 coeficientes A, B, e C de uma equa��o do 2� grau da f�rmula AX�+BX+C=0.
 * Verifique e mostre a exist�ncia de ra�zes reais e se caso exista, calcule e mostre.
 * 
 *  Obs: para calcular o valor do delta: f�rmula: delta = b� � 4 * a * c
 * 
 * Autor: Gustavo Alves
 * Data: 14 de fev de 2019
 */

package estruturasdedecisao;

import javax.swing.JOptionPane;

public class Lt01_EstDecEx20 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente A: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente B: "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente C: "));

		// calcula valor do delta
		double delta = Math.pow(b, 2) - 4 * a * c;

		if (a == 0) // coeficiente 'A' n�o pode ser igual a zero
			JOptionPane.showMessageDialog(null,
					String.format("Exception: n�o � uma equa��o do 2� grau - 'A' inval�do!"), "Solu��o da Equa��o",
					JOptionPane.ERROR_MESSAGE);
		else if (delta > 0) { // duas ra�zes
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			JOptionPane.showMessageDialog(null, String.format("X' = %,.0f%nX\" = %,.0f ", x1, x2), "Solu��o da Equa��o",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (delta == 0) { // ra�z �nica
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			JOptionPane.showMessageDialog(null, String.format("X' = X\" = %,.0f", x1), "Solu��o da Equa��o",
					JOptionPane.INFORMATION_MESSAGE);
		} else // (delta < 0) nenhuma raiz
			JOptionPane.showMessageDialog(null, "Equa��o n�o possui ra�zes reais... ", "Solu��o da Equa��o",
					JOptionPane.INFORMATION_MESSAGE);

	}

}
