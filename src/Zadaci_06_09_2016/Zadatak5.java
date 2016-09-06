package Zadaci_06_09_2016;

public class Zadatak5 {
	// Rekurzivna metoda koja sabira i ispisuje brojeve u seriji i/(i+1)
	private static double m(int i) {
		// Ako je i jednako 1 vracamo da je to kolicnik djeljenja 1/2
		if (i == 1)
			return 1 / 2.0;
		// Akon je drugacije vracamo da je nasa metoda jednaka vrijednosti koju
		// dobijemo iz izraza (i-1)+i/(i + 1.0)
		else
			return m(i - 1) + i / (i + 1.0);
	}

	public static void main(String[] args) {
		// For petlja koja krece od jedan i ide do 10
		for (int i = 1; i < 10; i++) {
			// Pozivamo metodu m koja sabira brojeve po prikazanom izrazu i
			// ispisujemo ih
			System.out.println(m(i));
		}

	}

}
