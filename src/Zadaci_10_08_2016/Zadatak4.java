package Zadaci_10_08_2016;

import java.util.Scanner;

public class Zadatak4 {
	// Pravimo metodu koja ce nam brojati karaktere u odredjennom stringu i
	// prosljedjujemo joj 2 parametra string i char
	public static int count(String str, char a) {
		// Pravimo varijablu count preko koje cemo da brojimo karatkere u
		// stringu
		int count = 0;
		// Koristimo for petlju prolazimo kroz string i onda postavljamo uslov
		// ako su karakteri na indexu i jednaki nasem karakteru a poveceavamo
		// nas brojac
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				count++;
			}
		}
		// Vracamo izbrojene karaktere
		return count;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese string
		System.out.println("Unesite string ");
		String str = input.nextLine();
		// Trazimo od korisnika da unese karakter
		System.out.println("Unesite karakter");
		char a = input.next().trim().charAt(0);
		// Pozivamo metodu count u kojoj smo projali kolko se puta ponovio
		// odredjeni karakter te onda sve printamo
		System.out.println("Karakter se ponovio " + count(str, a) + " puta");
		// Zatvaramo unos
		input.close();

	}

}
