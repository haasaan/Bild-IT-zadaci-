package Zadaci_06_09_2016;

public class Zadatak3 {
	// Rekurzivna metoda koja sabira brojeve tipa 1 +1/2 + 1/3 +...1/i
	public static double m(int i) {
		// Ako je i manje ili jednako nuli vracamo nulu
		if (i <= 0)
			return 0;
		// Ako je i jednako jedan vracamo jedan
		if (i == 1)
			return 1;
		// Ako je drugacije onda vracamo da je nase m (i-1) sabrano sa 1/index i
		else
			return m(i - 1) + 1.0 / i;
	}

	public static void main(String[] args) {
		// For petlja koja ide od jedan do 10
		for (int i = 1; i < 10; i++) {
			// Ispisujemo rekurzivnu metodu koja sabira brojeve
			System.out.println(m(i));
		}
	}

}
