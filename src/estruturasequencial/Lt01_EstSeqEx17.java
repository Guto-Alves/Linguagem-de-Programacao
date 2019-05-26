/* 
 * Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. 
 * Receber o tempo de percurso e a velocidade média.
 * 
 * Obs: Desta forma, será possível obter a distância percorrida com a fórmula DISTÂNCIA = TEMPO * VELOCIDADE.
 * Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com 
 * a fórmula: LITROS_GASTOS = DISTÂNCIA / 12
 * 
 * Autor Gustavo Alves
 * Data 10 de fev de 2019
 */

package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double tempoPercurso;
		double velocidadeMedia;
		double litrosGastos;

		System.out.printf("Tempo de percurso (em horas): ");
		tempoPercurso = scanner.nextDouble();

		System.out.printf("Velocidade média (em km/h): ");
		velocidadeMedia = scanner.nextDouble();
		scanner.close();

		litrosGastos = tempoPercurso * velocidadeMedia / 12;

		System.out.printf("Consumo foi de %,.2f litros.", litrosGastos);

	}

}
