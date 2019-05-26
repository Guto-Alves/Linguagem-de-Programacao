/*
 * Objetivo: Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
 * 
 * @author Gustavo Alves
 * @date 9 de fev de 2019
 */

package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x;
		int y;
		int aux; // para armazenar temporáriamente o valor de x

		System.out.print("Digite um valor para X: ");
		x = scanner.nextInt();

		System.out.print("Digite um valor para Y: ");
		y = scanner.nextInt();
		scanner.close();

		System.out.printf("%nEfetuando a troca dos valores de x e y ...%n");
		aux = x;
		x = y;
		y = aux;

		System.out.printf("X = %d%nY = %d%n", x, y);

	}

}
