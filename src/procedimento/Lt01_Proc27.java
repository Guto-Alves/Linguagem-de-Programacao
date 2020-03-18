/*
 * Objetivo     : 27. Receba o n�mero de voltas, a extens�o do circuito (em metros) e o tempo de dura��o (minutos). 
 * Calcule e mostre a velocidade m�dia em km/h.
 * 
 * Programador  : Gustavo Alves
 * Data Cria��o : 7 de mar de 2019
 */

package procedimento;

import javax.swing.JOptionPane;

public class Lt01_Proc27 {

	public static void main(String[] args) {
		int numVoltas = Integer.parseInt(JOptionPane.showInputDialog("Digite n�mero de voltas"));
		double extensaoMetros = Double
				.parseDouble(JOptionPane.showInputDialog("Digite a extens�o do circuito (em metros)"));
		int tempoMinutos = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de dura��o (minutos)"));

		calcularVelocidadeMedia(numVoltas, extensaoMetros, tempoMinutos);
	}

	public static void calcularVelocidadeMedia(int numVoltas, double extensaoMetros, double tempoMinutos) {
		extensaoMetros /= 1000; // transforma metro em km
		tempoMinutos /= 60; // transforma minutos em horas
		
		double velocidadeMedia = (extensaoMetros * numVoltas) / tempoMinutos;

		JOptionPane.showMessageDialog(null, String.format("Velocidade m�dia = %,.1f km/h", velocidadeMedia));
	}

}
