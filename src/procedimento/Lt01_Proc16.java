/*
 * Objetivo     : 16. Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
 * de desconto e o número de descendentes. Calcule o salário que serão as
 * horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário
 * Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário
 * Líquido. Exiba o salário a receber.
 * 
 * Programador  : Gustavo Alves
 * Data Criação : 7 de mar de 2019
 */

package procedimento;

import javax.swing.JOptionPane;

public class Lt01_Proc16 {

	public static void main(String[] args) {
		double horasTrabalhadas = Double
				.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
		double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora"));
		double percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto"));
		double numeroDescendentes = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de descendentes"));

		calcularSalario(horasTrabalhadas, valorHora, percentualDesconto, numeroDescendentes);
	}

	public static void calcularSalario(double horasTrabalhadas, double valorHora, double percentualDesconto,
			double numeroDescendentes) {
		double salarioBruto = horasTrabalhadas * valorHora;
		
		double valorDesconto = salarioBruto * percentualDesconto / 100;
		
		double salarioLiquido = (salarioBruto - valorDesconto) + numeroDescendentes * 100;

		JOptionPane.showMessageDialog(null, String.format("Salário a receber R$ %,.2f", salarioLiquido), "Salário",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
