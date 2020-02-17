/*
 * Objetivo: Receba a hora de início e de final de um jogo (HH,MM) sabendo que o
 * tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
 * 
 * Autor: Gustavo Alves
 * Data: 14 de fev de 2019
 */

package estruturasdedecisao;

import java.util.Scanner;

public class Lt01_EstDecEx25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("  HORÁRIO DE INÍCIO DO JOGO");

		System.out.print(" - Hora: ");
		int horaInicial = scanner.nextInt();

		System.out.print(" - Minuto: ");
		int minInicial = scanner.nextInt();

		System.out.println("\n  HORÁRIO DE FINAL DO JOGO");

		System.out.print(" - Hora: ");
		int horaFinal = scanner.nextInt();

		System.out.print(" - Minuto: ");
		int minFinal = scanner.nextInt();
		scanner.close();

		if (horaInicial < 0 || horaInicial > 23 || horaFinal < 0 || horaFinal > 23 || minInicial < 0 || minInicial > 59
				|| minFinal < 0 || minFinal > 59)
			System.err.printf("Exception: horário(s) invalído(s)");
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
