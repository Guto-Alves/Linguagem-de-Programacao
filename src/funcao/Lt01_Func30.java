/*
 * Objetivo     : Receba a data de nascimento e atual em ano, mês e dia. 
 * Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
 *
 * Programador  : Gustavo Alves
 * Data Criação : 15 de fev de 2019
 */

package funcao;

import java.util.Scanner;

public class Lt01_Func30 {
	public static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int dayBirth, monthBirth, yearBirth;
		int dayCurrent, monthCurrent, yearCurrent;

		System.out.println(" - Digite sua Data de Nascimento! ");
		System.out.print("Dia: ");
		dayBirth = input.nextInt();

		System.out.print("Mês: ");
		monthBirth = input.nextInt();

		System.out.print("Ano: ");
		yearBirth = input.nextInt();

		System.out.println();

		System.out.println(" - Digite a Data Atual! ");
		System.out.print("Dia: ");
		dayCurrent = input.nextInt();

		System.out.print("Mês: ");
		monthCurrent = input.nextInt();

		System.out.print("Ano: ");
		yearCurrent = input.nextInt();
		input.close();

		if (isValid(dayBirth, monthBirth, yearBirth, dayCurrent, monthCurrent, yearCurrent)) {
			System.out.printf("%nIdade em:%nAnos = %d%nMêses = %d%nDias = %d%n",
					ageInYears(ageInDays(dayBirth, monthBirth, yearBirth, dayCurrent, monthCurrent, yearCurrent)),
					ageInMonths(dayBirth, monthBirth, yearBirth, dayCurrent, monthCurrent, yearCurrent),
					ageInDays(dayBirth, monthBirth, yearBirth, dayCurrent, monthCurrent, yearCurrent));
		}

	}

	public static boolean isLeapYear(int year) {
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			return true;
		else
			return false;
	}

	public static boolean isValid(int dayBirth, int monthBirth, int yearBirth, int dayCurrent, int monthCurrent,
			int yearCurrent) {

		boolean valid = true;

		// verifica se os anos são positivos
		if (yearBirth <= 0 || yearCurrent <= 0) {
			System.err.println("Exception: ano deve ser maior que 0!");
			valid = false;
		}

		// verifica se os mêses estão no intervalo 1-12
		if (monthBirth <= 0 || monthBirth > 12 || monthCurrent <= 0 || monthCurrent > 12) {
			System.err.println("Exception: mês deve estar entre 1-12!");
			valid = false;
		}

		// verifica se dayBirth está no intervalo para month and year
		try {
			if (dayBirth <= 0 || (dayBirth > daysPerMonth[monthBirth] && !(monthBirth == 2 && dayBirth == 29))) {
				System.err
						.println("Exception: dia de nascimento está fora do intervalo para o mês e ano especificado!");
				valid = false;
			}
		} catch (Exception e) {
		}

		// verifique no ano bissexto se o mês é 2 e o dia é 29
		if (monthBirth == 2 && dayBirth == 29
				&& !(yearBirth % 400 == 0 || (yearBirth % 4 == 0 && yearBirth % 100 != 0))) {
			System.err.println("Exception: dia de nascimento está fora do intervalo para o mês e ano especificado!");
			valid = false;
		}

		// verifica se dayCurrent está no intervalo para month and year
		if (dayCurrent <= 0 || (dayCurrent > daysPerMonth[monthCurrent] && !(monthCurrent == 2 && dayCurrent == 29))) {
			System.err.println("Exception: dia atual está fora do intervalo para o mês e ano especificado!");
			valid = false;
		}

		// verifique no ano bissexto se o mês é 2 e o dia é 29
		if (monthCurrent == 2 && dayCurrent == 29
				&& !(yearCurrent % 400 == 0 || (yearCurrent % 4 == 0 && yearCurrent % 100 != 0))) {
			System.err.println("Exception: dia atual está fora do intervalo para o mês e ano especificado!");
			valid = false;
		}

		// validando se data de nascimento maior que data atual;
		if (yearBirth > yearCurrent || (yearBirth == yearCurrent && monthBirth > monthCurrent)
				|| (yearBirth == yearCurrent && monthBirth == monthCurrent && dayBirth > dayCurrent)) {
			System.err.println("Exception: data de nascimento maior que data atual!");
			valid = false;
		}

		return valid;

	}

	public static int ageInDays(int dayBirth, int monthBirth, int yearBirth, int dayCurrent, int monthCurrent,
			int yearCurrent) {
		int totalDays = 0;

		while (dayBirth != dayCurrent || monthBirth != monthCurrent || yearBirth != yearCurrent) {
			if (dayBirth == 31 && monthBirth == 12) {
				yearBirth++;
				dayBirth = 1;
				monthBirth = 1;
				totalDays++;
			} else if (isLeapYear(yearBirth) && monthBirth == 2) {
				if (dayBirth <= (daysPerMonth[monthBirth])) {
					totalDays++;
					dayBirth++;
				} else {
					dayBirth = 1;
					monthBirth++;
					totalDays++;
				}
			} else if (dayBirth == daysPerMonth[monthBirth]) {
				dayBirth = 1;
				monthBirth++;
				totalDays++;
			} else {
				dayBirth++;
				totalDays++;
			}
		}

		return totalDays;

	}

	public static int ageInMonths(int dayBirth, int monthBirth, int yearBirth, int dayCurrent, int monthCurrent,
			int yearCurrent) {
		int ageMonths = 0;

		if (yearBirth == yearCurrent) {
			for (int i = monthBirth; i < monthCurrent; i++)
				ageMonths++;
		} else {
			int auxMonth = monthBirth;
			int auxYear = yearBirth;

			for (; auxMonth != monthCurrent || auxYear != yearCurrent;) {
				if (auxMonth == 12) {
					auxMonth = 1;
					auxYear++;
					ageMonths++;
				} else {
					auxMonth++;
					ageMonths++;
				}
			}
		}
		return ageMonths;
	}

	public static int ageInYears(int totalDays) {
		return totalDays / 365;
	}

}
