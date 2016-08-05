package Zadaci_05_08_2016;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Unosimo prvi string
		System.out.println("Unesite prvi string: ");
		String s1 = input.nextLine();
		// Unosimo drugi string
		System.out.println("Unesite drugi string: ");
		String s2 = input.nextLine();
		// Pravimo varijablu minDuzina koja je jednaka duzini prvog stringa
		// Postavljamo uslov ako je duzina prvog stringa veca od duzine drugog
		// stringa onda ce varijabla minDuzina preuzeti duzinu drugog stringa
		int minDuzina = s1.length();
		if (minDuzina > s2.length()) {
			minDuzina = s2.length();
		}
		// Koristimo for petlju i prolazimo kroz petlju i postavljamo nasu
		// varijablu kao duzinu
		for (int i = 0; i < minDuzina; i++) {
			// I opet uslov ako su karatkteri na stringu 1 i na stringu 2 isti
			// ispisujemo karaktere sa prvog stringa ako nisu prekidamo program
			// jer nemamo zajednickog prefixa
			if (s1.charAt(i) == s2.charAt(i)) {
				System.out.print(s1.charAt(i));
			} else {
				break;
			}
		}
		input.close();

	}
}