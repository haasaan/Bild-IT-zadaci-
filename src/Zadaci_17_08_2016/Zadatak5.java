package Zadaci_17_08_2016;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Pravimo niz od 10 brojeva
		int[] numbers = new int[10];
		// Boolean vrijednost kao niz od deset brojeva
		boolean[] jedinstveni = new boolean[10];
		// For petlja prolazi od prvog do 10og broja te ispisujemo brojeve koje
		// smo unijeli
		for (int i = 0; i < 10; i++) {
			System.out.println("Unesite broj " + (i + 1));
			numbers[i] = input.nextInt();
			// Postavljamo boolean vrijednost kao true
			jedinstveni[i] = true;
			// Ponovo for petlja prolazi od prvog dp zadnjeg broja te if uslov
			// ako su brojevi na indexu i i indexu j jednaki i ako je i
			// razlicito od j postavljamo jedinstvene brojeve tj boolean
			// vrijednost kao false
			for (int j = 0; j < 10; j++) {
				if (numbers[i] == numbers[j] && i != j) {
					jedinstveni[i] = false;
				}
			}

		}
		// Printamo brojeve koje smo unijeli
		System.out.println("Brojevi koje ste unijelu su: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		// Printamo jedinstvene brojeve iz naseg unosa tj ako su se brojevi
		// ponovili program ce da ispise samo jedan broj bez obzira koliko puta
		// se on ponovio
		System.out.println("Jedinstveni brojevi od brojeva koje ste unijeli su: ");
		for (int i = 0; i < jedinstveni.length; i++) {
			if (jedinstveni[i]) {
				System.out.print(numbers[i] + " ");
			}
		}
		// Zatvaramo unos
		input.close();

	}

}
