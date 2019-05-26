/*
 * Objetivo: Receba o ano de nascimento e o ano atual. Calcule e mostre 
 * a sua idade e quantos anos terá daqui a 17 anos.
 * 
 * Autor: Gustavo Alves
 * Data: 9 de fev de 2019
 */

package estruturasequencial;

import javax.swing.JOptionPane;

public class Lt01_EstSeqEx12 {

	public static void main(String[] args) {
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));

		JOptionPane.showMessageDialog(null, String.format("Sua idade é %d anos%nDaqui a 17 anos você terá %d",
				(anoAtual - anoNascimento), (anoAtual - anoNascimento) + 17));
	}

}
