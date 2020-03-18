/*
 * Objetivo     : 34. Receba um n�mero. Calcule e mostre os resultados da tabuada desse n�mero.
 *
 * Programador  : Gustavo Alves
 * Data Cria��o : 9 de mar de 2019
 */

package funcao;

import java.util.Scanner;

public class Lt01_Func34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um n�mero inteiro: ");
		int number = input.nextInt();

		input.close();

		System.out.println(calculateMultiplicationTable(number));
	}

	public static String calculateMultiplicationTable(int number) {
		String result = "";

		for (int i = 1; i <= 10; i++)
			result += String.format("%d x %2d = %3d%n", number, i, number * i);

		System.out.println(result);

		return result;
	}

}
