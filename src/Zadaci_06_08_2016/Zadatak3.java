package Zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak3 {
	public static int reverse(int number) {
		// Napravili smo dvije varijable rezultat i privremenu vrijednost temp
		int result = 0;
		int temp;
		// Koritimo while petlju dok je broj veci od nule
		while (number > 0) {
			// Privremena vrijednost ce biti zadnji broj naseg broja koji smo
			// unijeli
			temp = number % 10;
			// Ovdje dijelimo nas broj sa 10 koji nam je ostao da bi dobili
			// drugu vrijednost naseg broja unazad
			number = number / 10;
			// Rezultat ce biti nas broj unazad
			result = result * 10 + temp;
		}
		// Vracamo rezulat

		return result;
	}

	public static boolean isPalindrom(int number) {
		// Ovdje korstimo uslov if ako je nas broj unazad jednak broju koji
		// unesemo uslov ce nam vratiti true i tad cemo znati da je broj
		// palindrom ako nije uslov nam vraca false i znamo da nas broj nije
		// palindrom
		if (reverse(number) == number) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// Trazimo od korsnika da unese svoj broj
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj ");
		int num = input.nextInt();
		// Ispisujemo broj unazad pozivajuci metodu reverse
		System.out.println("Nas uneseni broj unazad ");
		System.out.println(reverse(num));
		// Ispisujemo da li je broj palindrom pozivajuci metodu isPalidndrom
		System.out.println("Da li je nas broj palindrom ");
		System.out.println(isPalindrom(num));
		input.close();

	}

}
