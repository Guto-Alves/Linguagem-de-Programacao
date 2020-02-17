/*
 * Objetivo: Receber um valor positivo maior que 0, caso contr�rio emitir 
 * uma mensagem de erro e coletar o valor at� ser v�lido ap�s isso chamar 
 * uma fun��o recursiva que recebe o valor e retorne a soma da s�rie.
 * 
 * 	1/(n) + 3/(n-1) + 5/(n-2) + ... + x/(n=1)
 * 
 * Autor: Gustavo Alves
 */

package p1;

import javax.swing.JOptionPane;

public class P1_Ex4 {

	public static void main(String[] args) {
		int numero;

		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero natural N* (maior que 0):"));

			if (numero < 1)
				JOptionPane.showMessageDialog(null, "Error: o n�mero deve ser maior que 0");

		} while (numero < 1);

		JOptionPane.showMessageDialog(null, String.format("Resultado da s�rie = %,.2f", serieRecursiva(1, numero)));

	}

	public static double serieRecursiva(int numerador, int numero) {
		return numero == 0 ? 0 : (double) numerador / numero + serieRecursiva(numerador + 2, numero - 1);
	}

}
