/*
 * Objetivo: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de
 * duração (minutos). Calcule e mostre a velocidade média em km/h.
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

		System.out.print("Digite o número de voltas: ");
		numVoltas = scanner.nextInt();

		System.out.print("Digite a extensão do círculo (em metros): ");
		extensaoCirculo = scanner.nextDouble();

		System.out.print("Digite o tempo de duração (em minutos): ");
		tempoDuracao = scanner.nextInt();
		scanner.close();

		extensaoCirculo /= 1000; // transforma metro em km
		tempoDuracao /= 60; // transforma minuto em hora
		
		double velocidadeMedia = (extensaoCirculo * numVoltas) / tempoDuracao;

		System.out.printf("Velocidade média = %,.1f km/h.", velocidadeMedia);
	}

}
