package Zadaci_16_08_2016_;

import java.util.Scanner;

public class Zadatak1 {
	// Pravimo metodu koja provjerava da lije broj palindrom ili nije
	public static boolean isPalindrome(int number) {
		// Pravimo varijable palindrom koja ima vrijednost naseg broja i
		// varijablu reverse
		int palindrome = number;
		int reverse = 0;
		// While petlja sve dok je broj razlicit od 0
		while (palindrome != 0) {
			// Nasa varijabla reminder ce pamtiti zanji broj naseg broja
			int remainder = palindrome % 10;
			// Zatim varijabla revesre ce biti pomnozena sa 10 te saberemo sa
			// varijablom reminder
			reverse = reverse * 10 + remainder;
			// Racunamo broj palindrom
			palindrome = palindrome / 10;
		}

		// Uslov if ako je broj jednak nasem palindromo to znaci da je broj
		// palindrom tj isti je kad se cita i sapocetka i sa kraja
		if (number == reverse) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese neki broj
		System.out.println("Unesite neki broj");
		int palindrome = input.nextInt();
		// Koristimo uslov if pozivamo metodu isPlindrom ako je broj palindrom
		// ispisi
		if (isPalindrome(palindrome)) {
			System.out.println("Broj " + palindrome + " je palindrom");
			// Ako nije ispisi broj nije palindrom
		} else {
			System.out.println("Broj  " + palindrome + " nije palindrom");
		}
		// Zatvaramo unos
		input.close();

	}

}
