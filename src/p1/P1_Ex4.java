/*
 * Objetivo: Receber um valor positivo maior que 0, caso contrário emitir 
 * uma mensagem de erro e coletar o valor até ser válido após isso chamar 
 * uma função recursiva que recebe o valor e retorne a soma da série.
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
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número natural N* (maior que 0):"));

			if (numero < 1)
				JOptionPane.showMessageDialog(null, "Error: o número deve ser maior que 0");

		} while (numero < 1);

		JOptionPane.showMessageDialog(null, String.format("Resultado da série = %,.2f", serieRecursiva(1, numero)));

	}

	public static double serieRecursiva(int numerador, int numero) {
		return numero == 0 ? 0 : (double) numerador / numero + serieRecursiva(numerador + 2, numero - 1);
	}

}
