/*
 * Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o 
 * número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. 
 * Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no
 * Salário Líquido. Exiba o salário a receber.
 * 
 * Autor: Gustavo Alves
 * Data: 10 de fev de 2019
 */

package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double horasTrabalhadas;
		double valorHora;
		double percentualDesconto;
		int numeroDescendentes; // número de filhos
		double salarioBruto;
		double salarioLiquido;

		System.out.print("Quantidade de horas trabalhadas: ");
		horasTrabalhadas = input.nextDouble();

		System.out.print("Valor por hora: ");
		valorHora = input.nextDouble();

		System.out.print("Percentual de desconto: ");
		percentualDesconto = input.nextDouble();

		System.out.print("Número de descendentes: ");
		numeroDescendentes = input.nextInt();
		input.close();

		salarioBruto = valorHora * horasTrabalhadas;

		percentualDesconto = 1 - (percentualDesconto / 100);
		salarioLiquido = (salarioBruto * percentualDesconto) + numeroDescendentes * 100;

		System.out.printf("Salário a receber = R$ %,.2f", salarioLiquido);
	}

}
