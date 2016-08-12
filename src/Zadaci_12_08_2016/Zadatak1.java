package Zadaci_12_08_2016;

public class Zadatak1 {

	public static void main(String[] args) {
		// Pravimo cetiri verijable za cetiri nasumicna broja koja dodjeljujemo
		// tim variblama
		int digit1 = (int) (Math.random() * 10);
		int digit2 = (int) (Math.random() * 10);
		int digit3 = (int) (Math.random() * 10);
		int digit4 = (int) (Math.random() * 10);
		// Pravimo pinovo tri varijable tipa char za tri nasumicna upercase
		// karaktera
		char ch1 = (char) (Math.random() * 26 + 'A');
		char ch2 = (char) (Math.random() * 26 + 'A');
		char ch3 = (char) (Math.random() * 26 + 'A');
		// Ispisujemo nasumicne brojeve i karaktere tako da dobijamo
		// automobilsku tablicu
		System.out.println("Nasumicno generisana automobilska tablica: " + ch1 + ch2 + ch3 + "-" + digit1 + digit2
				+ digit3 + digit4);
	}
}
