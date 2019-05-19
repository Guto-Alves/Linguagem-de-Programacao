/*
 * Objetivo     : 27. Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
 * Calcule e mostre a velocidade média em km/h.
 * 
 * Programador  : Gustavo Alves
 * Data Criação : 7 de mar de 2019
 */

package procedimento;

import javax.swing.JOptionPane;

public class Lt01_Proc27 {

	public static void main(String[] args) {
		int numVoltas = Integer.parseInt(JOptionPane.showInputDialog("Digite número de voltas"));
		double extensaoMetros = Double
				.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito (em metros)"));
		int tempoMinutos = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de duração(minutos)"));

		calculaVelocidadeMedia(numVoltas, extensaoMetros, tempoMinutos);

	}

	public static void calculaVelocidadeMedia(int numVoltas, double extensaoMetros, int tempoMinutos) {

		extensaoMetros /= 1000; // transforma metro em km
		tempoMinutos /= 60; // tranforma minutos em horas
		double velocidadeMedia = (extensaoMetros * numVoltas) / tempoMinutos;

		JOptionPane.showMessageDialog(null, String.format("Velocidade média = %,.1f km/h", velocidadeMedia));

	}

}
