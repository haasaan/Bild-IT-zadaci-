package Zadaci_03_08_2016;

public class Zadatak1 {

	public static void Prime(int a, int b) {

		System.out.println("Prosti brojevi su: ");

		// Petljom prolazimo od pocetnog broja do kranjeg broja
		for (int i = a; i < b; i++) {
			// Postavljamo uslov ako je ostatak djeljenja sa nekim brojem
			// razlicit od 0 onda je broj prost.
			if (i % 2 != 0)

				// Printamo sve u liniji
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		// pravimo dvije varijable koje ce nam sluziti za pocetnu i krajnju
		// vrijednost
		int a = 1;
		int b = 50;
		Prime(a, b);

	}

}
