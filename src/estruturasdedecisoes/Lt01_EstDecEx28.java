/*
 * Objetivo: Receba o preço atual e a média mensal de um produto. Calcule e mostre o
 * novo preço sabendo que:
 *  Venda Mensal        Preço Atual          Preço Novo
 *   < 500                < 30                  + 10%
 *   >= 500 e < 1000      >= 30 e < 80          + 15%
 *   >= 1000              >= 80                 - 5%
 * Obs.: para outras condições, preço novo será igual ao preço atual.
 * 
 * Autor: Gustavo Alves
 * Data: 15 de fev de 2019
 */

package estruturasdedecisoes;

import java.util.Scanner;

public class Lt01_EstDecEx28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double preçoAtual;
		double mediaMensal;
		double preçoNovo = 0;

		System.out.print("Digite o Preço Atual: ");
		preçoAtual = scanner.nextDouble();

		System.out.print("Digite a Média/Venda Mensal: ");
		mediaMensal = scanner.nextDouble();
		scanner.close();

		// caso nenhuma condição seja correspondente; preço novo será igual ao preço
		// atual
		preçoNovo = preçoAtual;

		// calcula novo preço
		if (mediaMensal < 500.0 && preçoAtual < 30.0)
			preçoNovo = preçoAtual * 1.10;
		else if (mediaMensal >= 500.0 && mediaMensal < 1000 && preçoAtual >= 30 && preçoAtual < 80)
			preçoNovo = preçoAtual * 1.15;
		else if (mediaMensal >= 1000 && preçoAtual >= 80)
			preçoNovo = preçoAtual * 0.95;

		System.out.printf("Novo preço é R$ %,.2f", preçoNovo);

	}

}
