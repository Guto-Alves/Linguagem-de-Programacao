/*
 * Objetivo: Receba o n�mero de voltas, a extens�o do circuito (em metros) e o tempo de
 * dura��o (minutos). Calcule e mostre a velocidade m�dia em km/h.
 * 
 * @author Gustavo Alves
 * @date 15 de fev de 2019
 */

package estruturasdedecisao;

import java.util.Scanner;

public class Lt01_EstDecEx27 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numVoltas;
		double extensaoCirculo;
		double tempoDuracao;

		System.out.print("Digite o n�mero de voltas: ");
		numVoltas = scanner.nextInt();

		System.out.print("Digite a extens�o do c�rculo (em metros): ");
		extensaoCirculo = scanner.nextDouble();

		System.out.print("Digite o tempo de dura��o (em minutos): ");
		tempoDuracao = scanner.nextInt();
		scanner.close();

		extensaoCirculo /= 1000; // transforma metro em km
		tempoDuracao /= 60; // transforma minuto em hora
		
		double velocidadeMedia = (extensaoCirculo * numVoltas) / tempoDuracao;

		System.out.printf("Velocidade m�dia = %,.1f km/h.", velocidadeMedia);
	}

}
