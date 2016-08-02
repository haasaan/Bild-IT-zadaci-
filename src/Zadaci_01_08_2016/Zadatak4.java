package Zadaci_01_08_2016;

public class Zadatak4 {
	public static void main(String[] args) {
		// Ovdje postavljamo duzinu niza
		int[] array = new int[100];

		// 0vjde prolazimo petlljom kroz niz dodjeljujemo mu 100 nasumicnih
		// brojeva
		// od 0 do 9 pomocu Math.random

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);

		}
		int[] ponavljanje = new int[10];
		for (int i : array) {
			ponavljanje[i]++;
		}

		for (int j = 0; j < ponavljanje.length; j++) {
			if (ponavljanje[j] != 0) {
				System.out.println("Brojevi " + j + "ponovili su se " + ponavljanje[j] + " puta");
			}

		}

	}

}
