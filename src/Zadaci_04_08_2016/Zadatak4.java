package Zadaci_04_08_2016;

public class Zadatak4 {
	public static void Random() {
		int brojac = 0;
		// Prolazimo petlju od 0 do 100
		for (int i = 0; i < 100; i++) {
			// Uzimamo random vrijednosti i pretvaramo ih u slova i dodajemo na
			// math random + 1 tako da cemo uvijek dobiti prostor za naredno
			// slovo
			char c = (char) ('A' + (Math.random()) * ('Z' - 'A' + 1));
			brojac++;
			// printamo slovo, ako je brojac djeljiv sa 10 prelazimo u novi red
			if (brojac % 10 == 0) {
				System.out.println(c + " ");
			} else {
				System.out.print(c + " ");
			}
		}
		System.out.println();
		for (int i = 0; i < 100; i++) {
			// uzimamo random vrijednost od 0 do 100
			int num = (int) (Math.random() * 100);
			brojac++;
			/// Printamo brojeve i brojac dijelo sa 10 tako da prelazimo u novi
			/// red
			if (brojac % 10 == 0) {
				System.out.println(num + " ");
			} else {
				System.out.print(num + " ");
			}

		}
	}

	public static void main(String[] args) {

		// U mainu cemo samo pozvati mtedu za printanje brojeva
		Random();

	}
}
