/*
 * Objetivo: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
 * 
 * Autor: Gustavo Alves
 * Data: 9 de fev de 2019
 */

package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double salarioAtual;
		double salarioReajuste;

		System.out.print("Digite o salário atual: ");
		salarioAtual = input.nextDouble();
		input.close();

		salarioReajuste = salarioAtual * 1.15;

		System.out.printf("Novo salário com reajuste de 15%% = R$ %.2f", salarioReajuste);

	}

}
