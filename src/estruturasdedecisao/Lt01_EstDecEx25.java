/*
 * Objetivo: Receba a hora de in�cio e de final de um jogo (HH,MM) sabendo que o
 * tempo m�ximo � de 24 horas e pode come�ar num dia e terminar noutro.
 * 
 * Autor: Gustavo Alves
 * Data: 14 de fev de 2019
 */

package estruturasdedecisao;

import java.util.Scanner;

public class Lt01_EstDecEx25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("  HOR�RIO DE IN�CIO DO JOGO");

		System.out.print(" - Hora: ");
		int horaInicial = scanner.nextInt();

		System.out.print(" - Minuto: ");
		int minInicial = scanner.nextInt();

		System.out.println("\n  HOR�RIO DE FINAL DO JOGO");

		System.out.print(" - Hora: ");
		int horaFinal = scanner.nextInt();

		System.out.print(" - Minuto: ");
		int minFinal = scanner.nextInt();
		scanner.close();

		if (horaInicial < 0 || horaInicial > 23 || horaFinal < 0 || horaFinal > 23 || minInicial < 0 || minInicial > 59
				|| minFinal < 0 || minFinal > 59)
			System.err.printf("Exception: hor�rio(s) inval�do(s)");
		else {
			int diferencaHora = horaFinal - horaInicial;
			int diferencaMinuto = minFinal - minInicial;

			if (diferencaMinuto < 0) {
				diferencaHora--;
				diferencaMinuto = 60 + diferencaMinuto;
			}

			if (diferencaHora < 0)
				diferencaHora = 24 + diferencaHora;

			if (diferencaHora == 0 && diferencaMinuto == 0)
				diferencaHora = 24;

			System.out.printf("%n  O JOGO DUROU %02d:%02d%n", diferencaHora, diferencaMinuto);
		}
	}

}
