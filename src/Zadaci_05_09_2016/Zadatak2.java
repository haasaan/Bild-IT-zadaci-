package Zadaci_05_09_2016;

import java.math.BigDecimal;

public class Zadatak2 {

	public static void main(String[] args) {
		// Pravimo objekat bigRational i dajemo mu vrijednosti
		BigRational bigRational = new BigRational(new BigDecimal(4), new BigDecimal(8));
		// Pozivamo metodu multiply i printamo objekat
		System.out.println(bigRational);
		bigRational = bigRational.multiply(bigRational);
		System.out.println(bigRational);

	}

}
