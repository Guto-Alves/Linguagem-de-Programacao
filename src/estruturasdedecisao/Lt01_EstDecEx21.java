/*
 * Objetivo: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. 
 * Mostre a mensagem de acordo com a média:
 * 
 * a. Se a média for >= 6,0 exibir “APROVADO”;
 * b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
 * c. Se a média for < 3,0 exibir “RETIDO”.
 * 
 * @author Gustavo Alves
 * @date 14 de fev de 2019
 */

package estruturasdedecisao;

import javax.swing.JOptionPane;

public class Lt01_EstDecEx21 {

	public static void main(String[] args) {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2ª nota: "));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3ª nota: "));
		double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4ª nota: "));

		double media = (n1 + n2 + n3 + n4) / 4;

		if (media >= 6.0)
			JOptionPane.showMessageDialog(null, String.format("APROVADO!%nMédia = %,.2f", media), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		else if (media >= 3.0 && media < 6.0)
			JOptionPane.showMessageDialog(null, String.format("EXAME!%nMédia = %,.2f", media), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, String.format("RETIDO!%nMédia = %,.2f", media), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
	}

}
