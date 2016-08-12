package Zadaci_12_08_2016;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Pravimo niz od 100 brojeva
		int[] array = new int[100];
		int brojac = -1;
		// Unosimo brojeve sve dok ne unesemo 0
		System.out.println("Unesite brojeve: ");
		while (brojac != 0) {
			brojac = input.nextInt();
			// Kada unesemo 0 unos se prekida te brojimo brojeve koji su se
			// ponovili
			if (brojac > 0) {
				array[brojac - 1]++;
			}
		}
		// Ispisujemo brojeve i koliko puta su se ponovili
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				System.out.printf("Broj %d se ponovio %d put\n", i + 1, array[i], array[i]);
			}

		}
		// Zatvaramo unos
		input.close();

	}

}
