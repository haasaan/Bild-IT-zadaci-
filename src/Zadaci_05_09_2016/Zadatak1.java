package Zadaci_05_09_2016;

public class Zadatak1 {

	public static void main(String[] args) {
		// Pravimo objekat rational i prosljedujemo mu vrijednosti
		Rational rational = new Rational(4, 10);
		// Pozivamo multiply metodu i ispisujemo
		rational = rational.multiply(new Rational(2, 4));
		System.out.println(rational);

	}

}
