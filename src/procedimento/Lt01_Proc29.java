/*
 * Objetivo     : 29. Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
 * Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados
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

		double valorInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do investimento:"));

		if (!(isValido(tipoInvestimento, valorInvestimento)))
			JOptionPane.showMessageDialog(null, "Error: dado(s) inválido(s)!", "Error", JOptionPane.ERROR_MESSAGE);
		else
			calculaInvestimento(tipoInvestimento, valorInvestimento);

	}

	public static boolean isValido(int tipoInvestimento, double valorInvestimento) {
		if (tipoInvestimento < 1 || tipoInvestimento > 2 || valorInvestimento <= 0.0)
			return false;
		else
			return true;

	}

	public static void calculaInvestimento(int tipoInvestimento, double valorInvestimento) {
		double valorCorrigido;

		if (tipoInvestimento == 1) // poupança
			valorCorrigido = valorInvestimento * 1.03;
		else // renda fixa
			valorCorrigido = valorInvestimento * 1.05;

		JOptionPane.showMessageDialog(null, String.format("Valor após 30 dias = R$ %,.2f", valorCorrigido), "",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
