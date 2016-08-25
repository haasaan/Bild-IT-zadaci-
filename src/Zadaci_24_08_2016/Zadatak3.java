package Zadaci_24_08_2016;

import java.math.BigDecimal;

public class Zadatak3 {
	// Metoda koja provjerava da li su brojevi prosti koju cemo kasnije
	// implementirati u mainu
	public static boolean isPrime(long n) {

		long square = (long) Math.sqrt(n);
		for (int i = 2; i <= square; i++) {

			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	// Ponovo klasa bigDecimal preko koje koristimo metodu getMarsenePrime od
	// koje dobijamo algoritam preko MArsen koji nam daje proste brojeve po tom
	// algoritmu
	public static BigDecimal getMersennePrime(int p) {

		return new BigDecimal(2).pow(p).subtract(BigDecimal.ONE);
	}

	public static void main(String[] args) {
		System.out.println("Prvo koristimo Marsene algoritam");
		System.out.printf("%-10s%7s\n", "P", "2 * P -1");

		for (int i = 270; i <= 300; i++) {
			if (isPrime(i)) {
				System.out.printf("%-10d%-10s\n", i, getMersennePrime(i));
			}
		}
		System.out.println("5 prostih brojeva koji su veci od MAX Value.");

	}

}
