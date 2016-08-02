package Zadaci_01_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int najveciBroj = 0;
		int brojac = 0;
		System.out.println("Unesite brojeve 0 prekida unos ");
		int brojevi = input.nextInt();
		// Ovdje unosimo broje sve dok ne unesemo 0 tada se prekida unos

		while (brojevi != 0) {
			list.add(brojevi);
			brojevi = input.nextInt();
		}
		// Pomocu for petlje prolazimo kroz niz i uporedjujemo najveci broj sa
		// elemntom u nizu
		// Ako je najveci broj manji on preuzima vrijednost indexa.
		// Ako brojevi imaju istu vrijednost povecavamo brojac za 1
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > najveciBroj) {
				najveciBroj = list.get(i);
				brojac = 1;
			} else if (list.get(i) == najveciBroj)
				brojac++;
		}
		if (brojac == 1) {
			System.out.println("Najveci broj je " + najveciBroj);
		} else {
			System.out.println("Najveci broj je " + najveciBroj + " i pojavljuje se " + brojac);
		}
		input.close();

	}

}
