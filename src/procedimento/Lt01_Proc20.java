/*
 * Objetivo     : 20. Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
 * Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
 * 
 * Programador  : Gustavo Alves
 * Data Criação : 7 de mar de 2019
 */

package procedimento;

import javax.swing.JOptionPane;

public class Lt01_Proc20 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente A"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente B"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente C"));

		calcularEquacao2Grau(a, b, c);
	}

	public static void calcularEquacao2Grau(int a, int b, int c) {
		double delta = Math.pow(b, 2) - 4 * a * c;

		if (a == 0) {
			JOptionPane.showMessageDialog(null,
					String.format("Exception: não é uma equação do 2º grau - 'A' invalído!"), "Solução da Equação",
					JOptionPane.ERROR_MESSAGE);
		} else if (delta > 0) { // duas raízes
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			JOptionPane.showMessageDialog(null, String.format("X' = %,.1f%nX\" = %,.1f ", x1, x2), "Solução da Equação",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (delta == 0) { // raíz única
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			JOptionPane.showMessageDialog(null, String.format("X' = X\" = %,.1f", x1), "Solução da Equação",
					JOptionPane.INFORMATION_MESSAGE);
		} else // (delta < 0) nenhuma raiz
			JOptionPane.showMessageDialog(null, "Equação não possui raízes reais... ", "Solução da Equação",
					JOptionPane.INFORMATION_MESSAGE);
	}

}
