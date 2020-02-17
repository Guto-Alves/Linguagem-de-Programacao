/*
 * Objetivo: Receba o valor de um dep�sito em poupan�a. Calcule e mostre o valor 
 * ap�s 1 m�s de aplica��o sabendo que rende 1,3% a. m.
 * 
 * Autor Gustavo Alves
 * Data 9 de fev de 2019
 */

package estruturasequencial;

import javax.swing.JOptionPane;

public class Lt01_EstSeqEx08 {

	public static void main(String[] args) {
		double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do dep�sito: ",
				"- DEP�SITO EM POUPAN�A", JOptionPane.QUESTION_MESSAGE));

		valorDeposito *= 1.013;

		JOptionPane.showMessageDialog(null, String.format("Redimento ap�s um m�s = R$ %,.2f", valorDeposito),
				"- DEP�SITO EM POUPAN�A", JOptionPane.INFORMATION_MESSAGE);
	}

}
