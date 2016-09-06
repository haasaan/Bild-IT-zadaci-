package Zadaci_06_09_2016;

public class Zadatak4 {
	// Metoda koja sabira sljedecu seriju brojeva i / (2i + 1)
	public static double sumSeries(int n) {
		// Ako je n jednak jedinici vracamo 1/3
		if (n == 1)
			return 1.0 / 3;
		// Ako je drugacije vracamo da je metoda sumSerises (n-1) + n/(2.0*n+1)
		else
			return sumSeries(n - 1) + n / (2.0 * n + 1);
	}

	public static void main(String[] args) {
		// For petlja koja krece od jedan i zavrsava sa 10
		for (int i = 1; i < 10; i++) {
			// Pozivamo metodu sumSeries i printamo sumu brojeva u seriji
			// i/(2i+1)
			System.out.println(sumSeries(i));
		}
	}

}
