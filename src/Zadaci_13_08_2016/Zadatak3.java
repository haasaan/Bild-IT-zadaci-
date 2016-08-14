package Zadaci_13_08_2016;

public class Zadatak3 {
	// Pravimo metodu isPrime koja provjerava da li su brojevi prime
	public static boolean isPrime(int p) {
		// For petljom prolazimo kroz brojeve od 2 do bra p
		for (int i = 2; i < p; i++) {
			// Uslov if ako je ostatak djeljenja jednak 0 uslov vraca false
			if (p % i == 0) {
				return false;

			}
		}
		// Ako nije uslov vraca true
		return true;

	}

	// Medtoda koja vraca brojeve unazad
	public static int reverse(int r) {
		if (r < 10)
			return r;
		// Metoda koja vraca brojeve unazad implementirajuci flipper metodu
		return flipper(r % 10, r / 10);
	}

	// Metoda koja vraca brojeve unazad
	public static int flipper(int a, int b) {
		// Uslov if ako je broj b manji od jeda vraca broj a
		if (b < 1)
			return a;
		// Vraca nam brojeve unazad
		return flipper(a * 10 + b % 10, b / 10);

	}

	// Provjeravamo da li su brojevi emirp
	public static boolean isEmirp(int x) {
		// Metoda implementira metodu isPrime i reverse Metodu
		return isPrime(x) && isPrime(reverse(x));
	}

	public static void main(String[] args) {
		// Pravimo dvije variable a koja ima vrijednost 13 i count ima
		// vrojednost 0 i broji nam brojeve
		int a = 13;
		int count = 0;
		// While petlja sve dok je brojac manji od 100
		while (count < 100) {
			// Uslov if pozivamo metodu isEmirp koja provjerava da li su brojevi
			// emirp i ispisujemo ih
			if (isEmirp(a)) {
				System.out.print(a + "    ");
				count++;
				// Printamo brojeve 10 po liniji
				if (count % 10 == 0)
					System.out.println();

			}
			// Povecavamo brojac za jedan kada brojac dodje do 100 program se
			// prekida ii ispisuje nam prvih 100 emirp brojeves
			a++;
		}

	}

}
