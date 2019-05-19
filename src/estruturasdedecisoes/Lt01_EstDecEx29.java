/*
 * Objetivo: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do
 * investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a
 * poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
 * 
 * Autor: Gustavo Alves
 * Data: 14 de fev de 2019
 */

package estruturasdedecisoes;

import javax.swing.JOptionPane;

public class Lt01_EstDecEx29 {

	public static void main(String[] args) {
		int tipoInvestimento = Integer.parseInt(JOptionPane.showInputDialog(null,
				"  Menu de opções\n1 - Poupança\n2 - Renda Fixa\n- Digite sua opção: ", "Tipo de Investimento",
				JOptionPane.PLAIN_MESSAGE));

		double valorInvestimento = Double
				.parseDouble(JOptionPane.showInputDialog("- Digite o valor do investimento: "));

		if (tipoInvestimento < 1 || tipoInvestimento > 2 || valorInvestimento < 0.0)
			JOptionPane.showMessageDialog(null, "Exception: tipo e/ou valor do investimento invalído!", "Exception",
					JOptionPane.ERROR_MESSAGE);
		else {
			if (tipoInvestimento == 1)
				JOptionPane.showMessageDialog(null,
						String.format("Tipo investimento: Poupança%nValor após 30 dias:%nde R$ %,.2f para R$ %,.2f.",
								valorInvestimento, valorInvestimento * 1.03)); // poupança rende = 3%
			else
				JOptionPane.showMessageDialog(null,
						String.format("Tipo investimento: Renda Fixa%nValor após 30 dias:%nde R$ %,.2f para R$ %,.2f.",
								valorInvestimento, valorInvestimento * 1.05)); // renda fixa = 5%

		}

	}

}
