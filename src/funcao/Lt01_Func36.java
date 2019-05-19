package funcao;

import javax.swing.JOptionPane;

/*
 * Objetivo     : 36. Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 *
 * Programador  : Gustavo Alves
 * Data Criação : 8 de mar de 2019
 */

public class Lt01_Func36 {

	public static void main(String[] args) {

		int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));

		JOptionPane.showMessageDialog(null, String.format("Resultado da série = %,.2f", serie36(number)),
				"Série  1 + 1/1! + 1/2! + ... + 1/N!", JOptionPane.INFORMATION_MESSAGE);

	}

	public static double serie36(int number) {
		double serie = 1;

		for (int i = 1; i <= number; i++) {

			// calcula fatorial do denominador
			int fat = 1;
			for (int j = 1; j <= i; j++)
				fat *= j;

			serie += (double) 1 / fat;

		}

		return serie;
	}

}
