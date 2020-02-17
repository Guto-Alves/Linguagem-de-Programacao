/*
 * Objetivo   : Receba o número da base e do expoente. 
 * Calcule e mostre o valor da potência.
 *
 * Programador: Gustavo Alves
 * Data       : 21 de fev de 2019
 */

package estruturasderepeticao;

import javax.swing.JOptionPane;

public class Lt01_EstRepEx44 {

	public static void main(String[] args) {
		int base = Integer.parseInt(JOptionPane.showInputDialog("Digite o base: "));
		int expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente: "));

		int pow = 1;

		for (int i = 0; i < expoente; i++) {
			pow *= base;
		}

		JOptionPane.showMessageDialog(null, String.format("%d ^ %d = %d", base, expoente, pow), "Resultado da Potência",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
