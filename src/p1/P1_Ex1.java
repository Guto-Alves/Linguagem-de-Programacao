/*
 * Objetivo: Criar uma fun��o que receba e retorne o vetor carregado
 * somente com valores entre 1 a 400, demais valores dever�o ser despresados,
 * informar e completar os 300 valores v�lidos.
 * 
 * Autor: Gustavo Alves
 */

package p1;

import java.security.SecureRandom;

public class P1_Ex1 {

	public static int[] carregarVetor(int[] vetor) {
		SecureRandom random = new SecureRandom();

		for (int i = 0; i < vetor.length; i++)
			vetor[i] = 1 + random.nextInt(400);

		return vetor;
	}

}
