/*
 * Objetivo: Receba o valor de um depósito em poupança. Calcule e mostre o valor 
 * após 1 mês de aplicação sabendo que rende 1,3% a. m.
 * 
 * Autor Gustavo Alves
 * Data 9 de fev de 2019
 */

package estruturasequencial;

import javax.swing.JOptionPane;

public class Lt01_EstSeqEx08 {

	public static void main(String[] args) {
		double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do depósito: ",
				"- DEPÓSITO EM POUPANÇA", JOptionPane.QUESTION_MESSAGE));

		valorDeposito *= 1.013;

		JOptionPane.showMessageDialog(null, String.format("Redimento após um més = R$ %,.2f", valorDeposito),
				"- DEPÓSITO EM POUPANÇA", JOptionPane.INFORMATION_MESSAGE);
	}

}
