package Zadaci_07_09_2016;

import java.util.Scanner;

public class Zadatak4 {
	// Metoda koja sabira brojeve u integeru koji unesemo npr ako unesemo 234(2
	// + 3 + 4 = 9)
	public static long sumDigits(long n) {
		// Ako je n jednako nuli vracamo n
		if (n == 0)
			return n;
		// Ako nije vracamo da zadnji broj broja n odvajamo te broj koji nam
		// ostaje dijelimo sa 10
		return n % 10 + sumDigits(n / 10);
	}

	public static void main(String[] args) {
		// Trazimo od korisnika da unese neki integer
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite integer: ");
		long n = input.nextLong();
		// Pozivamo metodu i prinatmo sumu brojeva
		System.out.println(sumDigits(n));
		// Zatvarmo unos
		input.close();
	}

}
