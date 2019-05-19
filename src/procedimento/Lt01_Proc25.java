/*
 * Objetivo             : 25. Receba a hora de início e de final de um jogo (HH,MM) sabendo que o
 * tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
 * 
 * Nome do Programador  : Gustavo Alves
 * Data de Desenvolvimento : 7 de mar de 2019
 */

package procedimento;

import javax.swing.JOptionPane;

public class Lt01_Proc25 {

	public static void main(String[] args) {
		int horaInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial"));
		int minutoInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial"));
		int horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final"));
		int minutoFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final"));

		if (isValid(horaInicial, minutoInicial, horaFinal, minutoFinal))
			calculaTempo(horaInicial, minutoInicial, horaFinal, minutoFinal);
		else
			JOptionPane.showMessageDialog(null, "Error: data(s) inválida(s)!", "Error", JOptionPane.ERROR_MESSAGE);

	}

	public static void calculaTempo(int horaInicial, int minutoInicial, int horaFinal, int minutoFinal) {
		int diferencaHora = horaFinal - horaInicial;
		int diferencaMinuto = minutoFinal - minutoInicial;

		if (diferencaMinuto < 0) {
			diferencaHora--;
			diferencaMinuto = 60 + diferencaMinuto;
		}

		if (diferencaHora < 0)
			diferencaHora = 24 + diferencaHora;

		if (diferencaHora == 0 && diferencaMinuto == 0)
			diferencaHora = 24;

		JOptionPane.showMessageDialog(null, String.format("O jogo durou %02d:%02d", diferencaHora, diferencaMinuto),
				"Tempo Total", JOptionPane.INFORMATION_MESSAGE);
	}

	public static boolean isValid(int horaInicial, int minutoInicial, int horaFinal, int minutoFinal) {
		if (horaInicial < 0 || horaInicial > 23 || minutoInicial < 0 || minutoInicial > 59 || horaFinal < 0
				|| horaFinal > 23 || minutoFinal < 0 || minutoFinal > 59)
			return false;

		return true;

	}

}
