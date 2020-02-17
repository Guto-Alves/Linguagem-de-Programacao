/*
 * Objetivo     : 41. Mostre todas as possibilidades de 2 dados de forma 
 * que a soma tenha como resultado 7.
 *
 * Programador  : Gustavo Alves
 * Data Criação : 9 de mar de 2019
 */

package funcao;

public class Lt01_Func41 {

	public static void main(String[] args) {
		for (int dice1 = 1; dice1 <= 6; dice1++) {
			for (int dice2 = 1; dice2 <= 6; dice2++) {
				if (isSum7(dice1, dice2)) {
					System.out.printf(String.format("%d + %d = %d%n", dice1, dice2, dice1 + dice2));
				}
			}
		}
	}

	public static boolean isSum7(int dice1, int dice2) {
		return dice1 + dice2 == 7;
	}

}
