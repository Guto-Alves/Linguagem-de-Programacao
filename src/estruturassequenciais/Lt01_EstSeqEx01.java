/*
 * Objetivo: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
 * 
 * Autor: Gustavo Alves
 * Data: 9 de fev de 2019
 */

package estruturassequenciais;

import javax.swing.JOptionPane;

public class Lt01_EstSeqEx01 {

	public static void main(String[] args) {
		double lado;
		double areaQuadrado;

		lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do quadrado"));

		areaQuadrado = Math.pow(lado, 2);

		JOptionPane.showMessageDialog(null, "Área do quadrado é de " + areaQuadrado + " cm²");

	}

}
