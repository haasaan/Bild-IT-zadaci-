package Zadaci_09_08_2016;

public class Zadatak3 {

	public static void main(String[] args) {
		// Pravimo varijablu brojac koja ce nam brojati 10 brojeva po liniji
		System.out.println("Brojevi djeljivi i sa 5 i sa 6 su:");
		int brojac = 0;
		// Koristimo for petlju prolazimo kroz brojeve od 100 do 1000 te onda
		// korsitimo uslov if i ako nasi brojevi od 100 do 1000 djeljivi i sa 5
		// i sa 6 ispisujemo ih
		for (int i = 100; i < 1000; i++) {
			if ((i % 5 == 0) && (i % 6 == 0)) {
				System.out.print(i + " ");
				brojac++;
			}
			// Koristimo uslov if tako postavljamo da kada nas brojac dodje do
			// 10 brojeva ispisuje ih u jednoj liniji te prelazi u drugu
			if (brojac == 10) {
				System.out.println();
				brojac = 0;
			}

		}

	}

}
