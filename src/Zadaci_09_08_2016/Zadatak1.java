package Zadaci_09_08_2016;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite danasnji dan u sedmici ");
		// Trazimo od korisnika da unese danasnji dan u sedmici
		int danasnjiDan = input.nextInt();
		System.out.println("Unesite koji dan zelite da znate u buducnosti ");
		// Trazimo od korisnika da unese koji dan zeli znati u buducnosti
		int buduciDan = input.nextInt();
		// Pravimo varijablu dane
		int dani;
		// Koristimo formulu kako bi izracunali dane u buducnosti
		dani = buduciDan + danasnjiDan;

		// Postavljamo uslov ako je 0 broj koji korisnik unese program ce mu
		// ispisat daje danasnji dna ponedjeljak i tako za svih 7 dana
		if (danasnjiDan == 0) {
			System.out.println("Danasnji dan je ponedjeljak ");

		} else if (danasnjiDan == 1) {
			System.out.println("Danasnji dan je utorak");

		} else if (danasnjiDan == 2) {
			System.out.println("Danasnji dan je srijeda");

		} else if (danasnjiDan == 3) {
			System.out.println("Danasnji dan je cetvrtak");

		} else if (danasnjiDan == 4) {
			System.out.println("Danasnji dan je petak");

		} else if (danasnjiDan == 5) {
			System.out.println("Danasnji dan je subota");

		} else if (danasnjiDan == 6) {
			System.out.println("Danasnji dan je nedjelja");

			// Ponovo postavljamo uslov i poredimo nasu varijablu dani preko
			// koje smo postavili formulu i izracunali buduce dane u formuli te
			// kada
			// korisnik unese odredjene brojeve program ce mu ispisat danasnji
			// dan i dan u buducnosti
		}
		if (dani == 0) {
			System.out.println("Dan u buducnosti je ponedjeljak");
		} else if (dani == 1) {
			System.out.println("Dan u budcnosti je utorak");
		} else if (dani == 2) {
			System.out.println("Dan u buducnosti je srijeda");
		} else if (dani == 3) {
			System.out.println("Dan u budnocsti je cetvrtak");
		} else if (dani == 4) {
			System.out.println("Dan u buducnosti je petak");
		} else if (dani == 5) {
			System.out.println("Dan u buducnosti je subota");
		} else if (dani == 6) {
			System.out.println("Dan u buducnosti je ndjelja");
		}
		input.close();

	}
}
