package Zadaci_10_08_2016;

import java.util.Scanner;

public class Zadatak1 {
	// Pravimo metodu preko koje cemo izracunati dane za svaku godinu u rasponu
	// koji unesemo
	public static int dayInYear(int year) {
		int days = 0;
		// Postavljamo uslov i racunamo prestupnu godinu te ako je godina
		// prestupa program ce nam ispisati da ta godina ima 366 dana ako godina
		// nije prestupna program nam ispisuje dagodina ima 365 dana
		if (year % 4 == 0) {
			days = 366;
		} else {
			days = 365;
		}
		// Vracamo izracunate dane
		return days;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korsnika da unese pocetnu godinu
		System.out.println("Unesite pocetnu godinu");
		int pocetnaGodina = input.nextInt();
		// Trazimo od korisnika da unese krajnju godinu
		System.out.println("Unesite krajnju godinu");
		int krajnjaGodina = input.nextInt();
		// Ispisujeemo dane za svaku godinz u rasponukoji smo unijeli
		System.out.println("Broj dana za svaku godinu u rasponu ");
		for (int i = pocetnaGodina; i < krajnjaGodina + 1; i++) {
			System.out.println(dayInYear(i));

		}
		input.close();

	}

}
