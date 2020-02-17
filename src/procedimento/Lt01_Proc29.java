/*
 * Objetivo     : 29. Receba o tipo de investimento (1 = poupança e 2 = renda fixa) 
 * e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo 
 * que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
 * 
 * Programador  : Gustavo Alves
 * Data Criação : 8 de mar de 2019
 */

package procedimento;

import javax.swing.JOptionPane;

public class Lt01_Proc29 {

	public static void main(String[] args) {
		int tipoInvestimento = Integer.parseInt(JOptionPane
				.showInputDialog("Menu de opções\n1. Poupança\n2. Renda fixa\n - Digite o tipo de invesvimento: "));

		if (tipoInvestimento < 1 || tipoInvestimento > 2) {
			JOptionPane.showMessageDialog(null, "Erro: tipo de investimento inválido!", "Erro",
					JOptionPane.ERROR_MESSAGE);
		} else {
			double valorInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do investimento:"));

			if (valorInvestimento <= 0.0) {
				calcularInvestimento(tipoInvestimento, valorInvestimento);
			} else {
				JOptionPane.showMessageDialog(null, "Erro: valor do investimento inválido!", "Erro",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public static void calcularInvestimento(int tipoInvestimento, double valorInvestimento) {
		double valorCorrigido;

		if (tipoInvestimento == 1) // poupança
			valorCorrigido = valorInvestimento * 1.03;
		else // renda fixa
			valorCorrigido = valorInvestimento * 1.05;

		JOptionPane.showMessageDialog(null, String.format("Valor após 30 dias = R$ %,.2f", valorCorrigido), "",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
