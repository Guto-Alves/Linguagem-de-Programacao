/*
 * Objetivo     : 21. Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
 * Mostre a mensagem de acordo com a média:
 * 
 * a. Se a média for >= 6,0 exibir “APROVADO”;
 * b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
 * c. Se a média for < 3,0 exibir “RETIDO”.
 * 
 * Programador  : Gustavo Alves
 * Data Criação : 7 de mar de 2019
 */

package procedimento;

import javax.swing.JOptionPane;

public class Lt01_Proc21 {

	public static void main(String[] args) {
		double grade1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota: "));
		double grade2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2ª nota: "));
		double grade3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3ª nota: "));
		double grade4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4ª nota: "));

		arithmeticAverage(grade1, grade2, grade3, grade4);

	}

	public static void arithmeticAverage(double grade1, double grade2, double grade3, double grade4) {
		double average = (grade1 + grade2 + grade3 + grade4) / 4;

		if (average >= 6.0)
			JOptionPane.showMessageDialog(null, String.format("Média = %,.2f APROVADO!", average), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		else if (average >= 3.0 && average < 6.0)
			JOptionPane.showMessageDialog(null, String.format("Média = %,.2f EXAME!", average), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		else if (average < 3.0)
			JOptionPane.showMessageDialog(null, String.format("Média = %,.2f RETIDO!", average), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
	}

}
