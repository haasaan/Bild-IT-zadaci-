package Zadaci_05_08_2016;

public class Zadatak2 {

	public static void main(String[] args) {
		int[] deck = new int[52];
		String[] znakovi = { "Srce", "Pik", "Djetelina", "Kocka" };
		String[] karte = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		// Inicijalizujemo karte koristeci for petlju
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}

		// Sada uz pomoc for petlje i metode Math.random mijesmo dek karata
		for (int i = 0; i < deck.length; i++) {
			int index = (int) (Math.random() * 2);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}

		// Ispisujemo karte
		for (int i = 0; i < 1; i++) {
			String znak = znakovi[deck[i] / 13];
			String karta = karte[deck[i] % 13];
			System.out.println(karta + " u " + znak);
		}
	}

}
