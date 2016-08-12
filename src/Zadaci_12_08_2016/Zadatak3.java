package Zadaci_12_08_2016;

public class Zadatak3 {
	// Pravimo metodu koja provjeava da li su brojevi prosti
	public static boolean isPrime(int n) {
		// Koristimo for petlju i prolazimo od broja do nekog n broja
		// podjeljenog sa 2 te povecavamo broj
		for (int i = 2; i <= n/2 ; i++) {
			// U uslovu kazemo ako je nas kolicnik jednak 0 vracamoo da je
			// boolean false ako nije vracamo da je to true
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		// Pravimo varijablu brojac koja ce nam sluziti da brojimo 10 brojeva po
		// liniji
		int brojac = 0;
		// Opet koristimo for petlju iprolazimo kroz brojeve od 0 do 100000 te
		// pozivamo metodu isPrime u kojoj smo provjerili nase proste brojeve te
		// ih ispisujemo
		System.out.println("Prosti brojevi su:");
		for (int i = 0; i <= 100000; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				brojac++;

			}
			// Preko ovog uslova postavkjamo brojac da je jednak 10 i da ispisuje
			// brojeve kada dodje do 8 prlazi u nobu liniu te opet ispisuje
			// broje
			if (brojac == 10) {
				System.out.println();
				brojac = 0;
			}

		}

	}

}
