/*
 * Objetivo:  Criar um procedimento que receba um numero inteiro e mostre a
 * sequência Fibonacci no próprio método.
 * 
 * Autor: Gustavo Alves
 */

package p1;

import javax.swing.JOptionPane;

public class P1_Ex2 {

	public static void fibonacci(int numeroDeTermos) {
		int anterior = 0;
		int atual = 1;
		int proximo;
		String sequencia = "";

		for (int i = 0; i < numeroDeTermos; i++) {
			if (i < 2)
				sequencia += i + " ";
			else {
				proximo = anterior + atual;

				sequencia += proximo + " ";

				anterior = atual;
				atual = proximo;
			}
		}

		JOptionPane.showMessageDialog(null, sequencia);
	}

}
