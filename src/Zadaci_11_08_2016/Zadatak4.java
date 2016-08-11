package Zadaci_11_08_2016;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese minute
		System.out.println("Unesite minute ");
		double mins = input.nextDouble();
		// Racunamo minute u godini
		double minofYear = 365 * 24 * 60;
		// Racunamo godine koristeci formulu
		double year = mins / minofYear;
		// Racunamo dane koristeci forumulu
		double day = (mins % minofYear) / (24 * 60);
		// Ispisujemo godine i dane za unesene minute
		System.out.println("To je: " + (int) year + " godina i " + (int) day + " dana");
		input.close();

	}

}
