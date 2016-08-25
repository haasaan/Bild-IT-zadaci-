package Zadaci_24_08_2016;

import java.math.BigDecimal;

public class Zadatak2 {

	public static void main(String[] args) {
		// Ponovo objekat BigDecimal kome prosljedjujemo najvec vrijednost
		BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
		// Long tip varijabla start te koristimo kvadrat za najvecu vrijednost
		long start = (long) Math.sqrt(Long.MAX_VALUE);
		BigDecimal n = new BigDecimal(start);
		int count = 0;
		// Metoda broji do 10
		while (count < 10) {
			// Umnozavamo brojeve
			BigDecimal squared = n.multiply(n);
			// Ako je kvadrat usporedjen sa najvecom vrijednosti jednak 0 brojac
			// povecavamo
			if (squared.compareTo(longMaxValue) > 0) {
				count++;
				// Printamo nase brojeve na kvadrat
				System.out.println(count + ": " + n + " kvadrat je  = " + squared);
			}
			n = n.add(BigDecimal.ONE);
		}

	}

}
