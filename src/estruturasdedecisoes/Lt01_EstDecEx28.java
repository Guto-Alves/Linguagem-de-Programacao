/*
 * Objetivo: Receba o pre�o atual e a m�dia mensal de um produto. Calcule e mostre o
 * novo pre�o sabendo que:
 *  Venda Mensal        Pre�o Atual          Pre�o Novo
 *   < 500                < 30                  + 10%
 *   >= 500 e < 1000      >= 30 e < 80          + 15%
 *   >= 1000              >= 80                 - 5%
 * Obs.: para outras condi��es, pre�o novo ser� igual ao pre�o atual.
 * 
 * Autor: Gustavo Alves
 * Data: 15 de fev de 2019
 */

package estruturasdedecisoes;

import java.util.Scanner;

public class Lt01_EstDecEx28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double pre�oAtual;
		double mediaMensal;
		double pre�oNovo = 0;

		System.out.print("Digite o Pre�o Atual: ");
		pre�oAtual = scanner.nextDouble();

		System.out.print("Digite a M�dia/Venda Mensal: ");
		mediaMensal = scanner.nextDouble();
		scanner.close();

		// caso nenhuma condi��o seja correspondente; pre�o novo ser� igual ao pre�o
		// atual
		pre�oNovo = pre�oAtual;

		// calcula novo pre�o
		if (mediaMensal < 500.0 && pre�oAtual < 30.0)
			pre�oNovo = pre�oAtual * 1.10;
		else if (mediaMensal >= 500.0 && mediaMensal < 1000 && pre�oAtual >= 30 && pre�oAtual < 80)
			pre�oNovo = pre�oAtual * 1.15;
		else if (mediaMensal >= 1000 && pre�oAtual >= 80)
			pre�oNovo = pre�oAtual * 0.95;

		System.out.printf("Novo pre�o � R$ %,.2f", pre�oNovo);

	}

}
