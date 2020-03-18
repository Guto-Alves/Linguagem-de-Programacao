/*
 * Objetivo     : 17. Calcule a quantidade de litros gastos em uma viagem, sabendo que o autom�vel faz 12 km/l. 
 * Receber o tempo de percurso e a velocidade m�dia.
 * 
 * Programador  : Gustavo Alves
 * Data Cria��o : 7 de mar de 2019
 */

package procedimento;

import javax.swing.JOptionPane;

public class Lt01_Proc17 {

	public static void main(String[] args) {
		double tempoPercurso = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso"));
		double velocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade m�dia"));

		litrosGastos(tempoPercurso, velocidadeMedia);
	}

	public static void litrosGastos(double tempoPercurso, double velocidadeMedia) {
		double litrosGastos = tempoPercurso * velocidadeMedia / 12;

		JOptionPane.showMessageDialog(null, String.format("Consumo foi de %,.2f litros.", litrosGastos));
	}
	
}
