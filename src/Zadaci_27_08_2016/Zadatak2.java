package Zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
	// Metoda koja sortira vrijednosti u listi od najmanje od najvece
	// vrijednosti
	public static void sort(ArrayList<Integer> list) {
		// For petljokprolazimo kroz listu i postavljamo da je trenutna najmanja
		// vrijednost jednaka nasem i
		for (int i = 0; i < list.size() - 1; i++) {
			int currentMin = list.get(i);
			int currentIndex = i;
			// Ako je namjanja vrijenodst veca od vijednosti na indexu j onda
			// nasanajmanja vrijednost dobija vrijednost od indexa j
			for (int j = i + 1; j < list.size(); j++) {
				if (currentMin > list.get(j)) {
					currentMin = list.get(j);
					currentIndex = j;
				}
			}
			// Ako je trenutni index razlicit od indexa i postavljamo u listu
			// trenutni idex index na i i najmanju vrijednosz
			if (currentIndex != i) {
				list.set(currentIndex, list.get(i));
				list.set(i, currentMin);
			}
		}

	}

	public static void main(String[] args) {
		// Trazmo od korisnika da unese nekih pet brojeva
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite pet brojeva ");
		// Pravimo novu listu i for petljom postavljamo da vrijednosti idu od0
		// do 5
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++)
			list.add(input.nextInt());
		// Pozivamo metodu koja sortira nasu listu
		sort(list);
		// Prinramo nasu sortiranu listu
		System.out.println("Sortirana lista: ");
		System.out.println(list);
		// Zatvaramo unos
		input.close();
	}

}
