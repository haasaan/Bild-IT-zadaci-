package Zadaci_24_08_2016;

import java.math.BigDecimal;

public class Zadatak4 {
	// Metoda koja provjerava da li je broj prost
	public static boolean isPrime(long n) {

		long square = (long) Math.sqrt(n);
		for (int i = 2; i <= square; i++) {

			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	// Staticna metoda bigDecimal koja pravi decimalne brojeve te koristimo
	// metodju getMarsennePrime
	public static BigDecimal getMersennePrime(int p) {

		return new BigDecimal(2).pow(p).subtract(BigDecimal.ONE);
	}

	public static void main(String[] args) {
		// Printamo formulu
		System.out.printf("%-10s%7s\n", "P", "2 * P -1");
		int numberOfPrimes = 0;
		for (int i = 2; numberOfPrimes < 100; i++) {
			// Provjeravamo da li je broj prost
			if (isPrime(i)) {
				numberOfPrimes++;
				// Printamo te implementiramo metodu MarsenePrime
				System.out.printf("%-10d%-10s\n", i, getMersennePrime(i));
			}
		}
	}

}
