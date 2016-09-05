package Zadaci_05_09_2016;

public class Zadatak4 {

	public static void main(String[] args) {
		// Pozivamo sve metodekoje smo napravili u klasi Complex i dodjeljujemo
		// vrijednosti te ispisujemo sve
		System.out.println(new Complex(3.5, 5.5).add(new Complex(-3.5, 1)));
		System.out.println(new Complex(3.5, 5.5).subtract(new Complex(-3.5, 1)));
		System.out.println(new Complex(3.5, 5.5).multiply(new Complex(-3.5, 1)));
		System.out.println(new Complex(3.5, 5.5).divide(new Complex(-3.5, 1)));

	}

}
