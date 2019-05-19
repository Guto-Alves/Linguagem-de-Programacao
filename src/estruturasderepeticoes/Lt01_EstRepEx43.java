/*
 * Objetivo   : Calcule e mostre quantos anos serão necessários para que Ana seja maior que
 * Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m
 * e cresce 2 cm ao ano.
 *
 * Programador: Gustavo Alves
 * Data       : 21 de fev de 2019
 */

package estruturasderepeticoes;

public class Lt01_EstRepEx43 {
	public static void main(String[] args) {
		double ana = 1.10;
		double maria = 1.50;
		int ano = 0;

		while (ana < maria) {
			ano++;
			ana += 0.03;
			maria += 0.02;
		}

		System.out.printf("Seram necessários %d anos para que Ana seja maior que Maria!", ano);
	}
}
