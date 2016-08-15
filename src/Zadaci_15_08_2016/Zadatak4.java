package Zadaci_15_08_2016;

public class Zadatak4 {
	// Pravimo metodu koja nam sabira brojeve
	public static int sumDigits(long n) {
		// Pravimo varijablu sum koja ima vrijednost 0
		int sum = 0;
		// While petlja sve dok je broj veci od nule
		while (n > 0) {
			// Suma je jednaka zbiru zadnjih brojeva naseg broja npr ako imam
			// 234 odbijamo 4
			sum += n % 10;
			// Dijelimo nas broj koji je preostao tj 23 sa 10 i tako se petlja
			// vrti sve dok ne dodje broj do 0 te tako dobijamo od 234 dobijamo
			// 2 3 4 te ih sve saberemo
			n = n / 10;

		}
		// Vracano nase sabrane brojeve
		return sum;
	}

	public static void main(String[] args) {
		// Pozivamo metodu sumDigits koja sabira brojeve i ispisujemo nasu sumu
		System.out.println(sumDigits(234));

	}

}
