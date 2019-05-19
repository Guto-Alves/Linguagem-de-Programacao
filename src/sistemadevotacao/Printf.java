/*
 * Objetivo: 
 * 
 * Autor: Gustavo Alves
 */

package sistemadevotacao;

public class Printf {

	public static void main(String[] args) {
		for (int i = 0; i < 52; i++)
			System.out.printf("%-10s%s", i, ((i + 1) % 4 == 0 ? "\n" : ""));

	}

}
