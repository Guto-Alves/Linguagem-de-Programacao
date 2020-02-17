/*
 * Objetivo: Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
 *  
 * Autor Gustavo Alves
 * Data 9 de fev de 2019
 */

package estruturasequencial;

import javax.swing.JOptionPane;

public class Lt01_EstSeqEx07 {

	public static void main(String[] args) {
		double comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento: "));
		double largura = Integer.parseInt(JOptionPane.showInputDialog("Digite o largura: "));
		double altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o altura: "));

		double volume = comprimento * largura * altura;

		JOptionPane.showMessageDialog(null, String.format("Volume = %,.2f cm³", volume), " - VOLUME PARALELEPÍPEDO",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
