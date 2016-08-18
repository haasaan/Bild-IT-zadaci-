package Zadaci_18_08_2016;

import java.util.Scanner;

public class Zadatak3 {
	// Pravimo metodu koja provjerava da li u nizu imaju 4 brojakoja imaju istu
	// vrijednost
	public static boolean isConsecutiveFour(int[] values) {
		int num = 0;
		int last = values[0];
		// For petlja prolazi od broha 1 do duzine niza
		for (int i = 1; i < values.length; i++) {
			// Uslov if ako je broj na indexu i jednak broju na indexu 0 tj
			// varijabli last
			if (values[i] == last) {
				// Povecavamo nas brojac
				num++;
				// Ako nije postavljamo brojac na vrijednost 1 i indexprvog
				// elementa postavljamo nako index i
			} else {
				num = 1;
				last = values[i];
			}
			// Ako je brojac jednak 4 metoda vraca true tj u nizu imaju 4 broja
			// sa istom vrojednosti
			if (num == 4)
				return true;

		}
		// Ako nema metoda vraca false
		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese duzinu niza
		System.out.print("Unesite duzinu niza brojeva: ");
		int size = input.nextInt();
		int[] values = new int[size];
		// Trazimo od korisnika da unese brojeve tj vrijednosti
		System.out.print("Unesite vrijednosti : ");
		for (int i = 0; i < size; i++)
			values[i] = input.nextInt();
		// Uslov if ako je metoda ConsecutiveFour vraca true ispisujemo da lista
		// sadrzi 4 ista broja
		if (isConsecutiveFour(values)) {
			System.out.println("Lista sadrzi cetiri broja sa istom vrijednosti");
		} else {
			// Ako ne sadrzi ispisujemo da ne sadrzi 4ista broja
			System.out.println("Lista ne sadrzi cetiri broja sa istom vrijednosti");
		}
		input.close();
	}

}
