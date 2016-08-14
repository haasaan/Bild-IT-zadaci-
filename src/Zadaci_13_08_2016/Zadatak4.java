package Zadaci_13_08_2016;

public class Zadatak4 {
	// Metoda koja provjerava da li su brojevi prime
	public static boolean Prime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false; // Ako broj nije prime uslov vraca false
			}
		}
		return true; // Ako je broj prime uslov vraca true
	}

	// Metoda koja provjerava da li su brojevi palindrom
	public static boolean Palindromic(int num) {
		// Pravimodvije varijable result koja ima vrijendost 0 i number koja ima
		// vrojednost broja
		int result = 0;
		int number = num;

		// Koristimo while petlju da okrenemo brojeve unazad
		while (num != 0) {
			int lastDigit = num % 10;
			result = result * 10 + lastDigit;
			num /= 10;

		} // Zavrsavamo petlju kada je broj razlicit od 0

		if (number == result) {
			return true; // Uslov if vraca true ako je broj palindrom
		}
		return false; // Uslov if vraca false ako broj nije palindrom
	}

	public static void main(String[] args) {

		// Pravimo 3 varijable count number i string result
		int count = 1, number = 2;
		String result = "";
		// Korsitimo while petlju kazemo ako je brojac manji od 100
		while (count <= 100) {
			// Provjeravamo da li je broj palindrom i prime
			if (Prime(number) && Palindromic(number)) {
				if (count % 10 == 0) {
					result += " " + number + "\n";
				} else {
					result += " " + number;
				}
				count++;
			}
			number++;

		}
		// Printamo prvih 100 palindrom prime brojeva
		System.out.print(result);

	}

}