package Zadaci_07_09_2016;

import java.util.Scanner;

public class Zadatak3 {
	// Rekurzivna metoda koja pronalazikoliko se puta ponovio jedan karakter u
	// stringu
	public static int count(String s, char ch) {

		int n = (ch == s.charAt(0)) ? 1 : 0;
		// Ako je duzina stringa jednaka jedan vracamo n
		if (s.length() == 1)
			return n;
		// Ako je drugacije sabiramo sring sa substringom i karakterom koji se
		// ponavlja
		else
			return n + count(s.substring(1), ch);
	}

	public static void main(String[] args) {
		// Trazimo od korisnika da unese string
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite string: ");
		String str = input.next();
		char ch = input.next().charAt(0);
		// Pozivamo metodu i printamo koliko se puta karakter ponovio
		System.out.println(count(str, ch));
		// Zatavarmo unos
		input.close();

	}

}
