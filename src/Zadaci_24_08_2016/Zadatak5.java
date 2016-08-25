package Zadaci_24_08_2016;

import java.math.BigDecimal;

public class Zadatak5 {

	public static void main(String[] args) {
		// Pravimo varijablu brojac
		int count = 0;
		// Ponovo objekat BigDecimal kome prosljedjujemo najvecu vrijednost i
		// dodajemo jedan
		BigDecimal num = new BigDecimal(Long.MAX_VALUE).add(BigDecimal.ONE);
		// Sve dok je brojac manji od 10
		while (count < 10) {
			// Reminder nam ima vrijedsnot 5 i ako je jednak 0 ili reminder 6
			// jednak 0 povecavamo brojac
			if (num.remainder(new BigDecimal(5)).equals(BigDecimal.ZERO)
					|| num.remainder(new BigDecimal(6)).equals(BigDecimal.ZERO)) {
				count++;
				// Printamo brojac i brojeve
				System.out.println(count + ": " + num);
			}
			num = num.add(BigDecimal.ONE);
		}

	}

}
