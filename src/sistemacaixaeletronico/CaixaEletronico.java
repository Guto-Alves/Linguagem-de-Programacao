/*
 * Objetivo: CAIXA ELETR�NICO
 * 1. Criar um menu de op��es: 
 * 		Menu Principal 
 * 	1 � Carregar Notas 
 * 	2 � Retirar Notas 
 * 	3 � Estat�stica 
 * 	9 � Fim
 *
 * 1.1. Carregar a quantidade de notas em uma �rea da mem�ria com 6 ocorr�ncias.
 *
 * 1.2. Solicitar que o cliente fa�a a retirada de valores obedecendo ao crit�rio do maior pelo menor.
 * 
 * 1.3. Dar a op��o para o cliente escolher o valor e a quantidade de notas. P. ex.: 1 x 20, 2 x 10...
 * 
 * 1.4. Caso n�o tenha o valor da maior c�dula, disponibilizar a pr�xima.
 * 
 * 1.5. Se o valor a ser solicitado for maior que o saldo total do caixa, enviar a mensagem �EXCEDEU O LIMITE DO CAIXA�.
 * 
 * 1.6. Solicitar at� 100 retiradas ou at� n�o haver mais notas.
 * 
 * 1.7. No momento da solicita��o do valor, coletar tamb�m o c�digo do banco que o cliente tem conta, segundo:
 * 		C�digo:		     1				  2			  3	      4	
 * 		Banco :    Banco do Brasil	  Santander		Ita�	Caixa
 * 
 * 1.8. No final, exibir a estat�stica, separada por nomesDosBancos, com:
 * 	1.8.1. O maior e o menor valor sacado;
 * 	1.8.2. A m�dia dos saques;
 * 	1.8.3. Valor total dos saques;
 * 	1.8.4. Valor das sobras dos caixas.
 * 
 * Autor: Gustavo Alves
 * Data: 25/03/2019
 */

package sistemacaixaeletronico;

import javax.swing.JOptionPane;

public class CaixaEletronico {
	private static int[] notas = { 100, 50, 20, 10, 5, 2 };
	private static int[][] quantidadeNotas = new int[5][notas.length];
	private static int[] saldoCaixa = new int[5];

	private static final String[] nomesDosBancos = { null, "Banco do Brasil", "Santander", "Ita�", "Caixa" };
	private static int[][] estatisticaPorBanco = new int[5][5];

	private static int counterRetiradas = 0;

	public static void main(String[] args) {
		menuOpcoes();
	}

	public static void menuOpcoes() {
		boolean notasAtualizadas = false;
		int op;

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Menu Principal\n1 - Carregar Notas\n2 - " + "Retirar Notas\n3 - Estat�stica\n9 - Fim",
					"Menu de Op��es", JOptionPane.QUESTION_MESSAGE));

			switch (op) {
			case 1:
				if (notasAtualizadas)
					JOptionPane.showMessageDialog(null, "As notas j� foram carregadas!", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				else {
					carregarNotas();
					JOptionPane.showMessageDialog(null, "Notas carregadas com sucesso!", "Carregar Notas",
							JOptionPane.INFORMATION_MESSAGE);
				}
				notasAtualizadas = true;
				break;
			case 2:
				retirarNotas();
				break;
			case 3:
				estatistica();
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Encerrando caixa. Volte sempre!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida.", "Error", JOptionPane.ERROR_MESSAGE);
				break;
			}
		} while (op != 9 && counterRetiradas < 100);

		if (counterRetiradas == 100)
			JOptionPane.showMessageDialog(null, "Voc� atingiu o limite de retiradas.", "Encerrando",
					JOptionPane.INFORMATION_MESSAGE);

	}

	public static void carregarNotas() {
		for (int i = 1; i < quantidadeNotas.length; i++) {
			int saldo = 0;
			for (int j = 0; j < quantidadeNotas[0].length; j++) {
				quantidadeNotas[i][j] = 100;
				saldo += quantidadeNotas[i][j] * notas[j];
			}
			saldoCaixa[i] = saldo;
		}

	}

	public static void retirarNotas() {
		int codigoBanco = Integer.parseInt(JOptionPane.showInputDialog(null,
				String.format("Bancos\n1. %s%n2. %s%n3. %s%n4. %s%n9. Voltar\n- Por favor, digite o c�digo do banco: ",
						nomesDosBancos[1], nomesDosBancos[2], nomesDosBancos[3], nomesDosBancos[4]),
				"Retirar Notas", JOptionPane.QUESTION_MESSAGE));

		if (codigoBanco == 9)
			return;
		if (codigoBanco > 4 || codigoBanco < 1) {
			JOptionPane.showMessageDialog(null, "Banco inv�lido!", "Retirar Notas", JOptionPane.ERROR_MESSAGE);
			return;
		}

		int valorSerRetirado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor a ser retirado: ",
				"Retirar Notas - " + nomesDosBancos[codigoBanco], JOptionPane.QUESTION_MESSAGE));

		if (valorSerRetirado > saldoCaixa[codigoBanco]) {
			JOptionPane.showMessageDialog(null, "EXCEDEU O LIMITE DO CAIXA!", "Retirar Notas - Aviso",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		int opcaoDeRetirada = JOptionPane.showConfirmDialog(null, "Deseja escolher a quantidade de cada nota?",
				"Retirar Notas - " + nomesDosBancos[codigoBanco], JOptionPane.YES_NO_OPTION);

		if (opcaoDeRetirada == 0)
			retirarNotasPersonalizado(codigoBanco, valorSerRetirado);
		else
			retirarNotasPadrao(codigoBanco, valorSerRetirado);

		saldoCaixa[codigoBanco] -= valorSerRetirado;
		JOptionPane.showMessageDialog(null, "Valor retirado com sucesso!",
				"Retirar Notas - " + nomesDosBancos[codigoBanco], JOptionPane.INFORMATION_MESSAGE);

		counterRetiradas++;

		// coleta informa��o para gerar as estat�sticas
		if (valorSerRetirado > estatisticaPorBanco[codigoBanco][0])
			estatisticaPorBanco[codigoBanco][0] = valorSerRetirado;
		if (estatisticaPorBanco[codigoBanco][1] == 0)
			estatisticaPorBanco[codigoBanco][1] = valorSerRetirado;
		else if (valorSerRetirado < estatisticaPorBanco[codigoBanco][1])
			estatisticaPorBanco[codigoBanco][1] = valorSerRetirado;

		estatisticaPorBanco[codigoBanco][2]++;
		estatisticaPorBanco[codigoBanco][3] += valorSerRetirado;

	}

	public static void retirarNotasPadrao(int codigoBanco, int valorSerRetirado) {
		int indiceNotas = 0;

		while (valorSerRetirado > 0) {
			while (notas[indiceNotas] <= valorSerRetirado) {
				valorSerRetirado -= notas[indiceNotas];
				quantidadeNotas[codigoBanco][indiceNotas]--;
			}
			indiceNotas++;
		}

	}

	public static void retirarNotasPersonalizado(int codigoBanco, int valorSerRetirado) {
		int valorRetirado = 0;
		int indiceNotas = 0;

		while (valorRetirado < valorSerRetirado) {
			if (indiceNotas == notas.length)
				indiceNotas = 0;

			while (quantidadeNotas[codigoBanco][indiceNotas] == 0 || notas[indiceNotas] > valorSerRetirado) {
				if (indiceNotas == notas.length)
					indiceNotas = 0;
				else
					indiceNotas++;
			}

			int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, String.format(
					"Obs: Valor a ser retirado = R$ %d,00\n          Valor j� retirado = R$ %d,00\n\nQuantas notas de R$ %d,00: ",
					valorSerRetirado, valorRetirado, notas[indiceNotas]),
					"Retirar Notas - " + nomesDosBancos[codigoBanco], JOptionPane.QUESTION_MESSAGE));

			if (quantidadeNotas[codigoBanco][indiceNotas] - quantidade < 0)
				JOptionPane.showMessageDialog(null,
						String.format("Caixa tem apenas %d nota(s) de R$ %d,00!",
								quantidadeNotas[codigoBanco][indiceNotas], notas[indiceNotas]),
						"Retirar Notas - " + nomesDosBancos[codigoBanco], JOptionPane.INFORMATION_MESSAGE);
			else {
				int total = quantidade * notas[indiceNotas];
				if (total + valorRetirado > valorSerRetirado)
					JOptionPane.showMessageDialog(null,
							"A soma das notas que voc� escolheu ultrapassam o valor a ser retido! Por favor, tente novamente.",
							"Retirar notas - " + nomesDosBancos[codigoBanco], JOptionPane.ERROR_MESSAGE);
				else if (total > valorSerRetirado) {
					JOptionPane.showMessageDialog(null,
							"A soma das notas que voc� escolheu ultrapassam o valor a ser retido! Por favor, tente novamente.",
							"Retirar notas - " + nomesDosBancos[codigoBanco], JOptionPane.ERROR_MESSAGE);
				} else {
					valorRetirado += total;
					quantidadeNotas[codigoBanco][indiceNotas] -= quantidade;
					indiceNotas++;

				}
			}
		}
	}

	public static void estatistica() {
		String banco = "";

		for (int i = 1; i < estatisticaPorBanco.length; i++) {
			banco += nomesDosBancos[i];
			for (int j = 0; j < estatisticaPorBanco[0].length; j++) {
				switch (j) {
				case 0:
					banco += String.format("\n - Maior valor sacado: R$ %,.2f.", (double) estatisticaPorBanco[i][j]);
					break;
				case 1:
					banco += String.format("\n - Menor valor sacado: R$ %,.2f.", (double) estatisticaPorBanco[i][j]);
					break;
				case 2:
					banco += String.format("\n - M�dia dos saques: R$ %,.2f.", estatisticaPorBanco[i][3] == 0 ? 0.0
							: estatisticaPorBanco[i][3] / estatisticaPorBanco[i][j]);
					break;
				case 3:
					banco += String.format("\n - Valor total dos saques: R$ %,.2f.",
							(double) estatisticaPorBanco[i][j]);
					break;
				case 4:
					banco += String.format("\n - Valor da sobra do caixa: R$ %,.2f.\n\n", (double) saldoCaixa[i]);
					break;
				}
			}
		}

		JOptionPane.showMessageDialog(null, banco, "Estat�sticas separa por Banco", JOptionPane.PLAIN_MESSAGE);

	}
}
