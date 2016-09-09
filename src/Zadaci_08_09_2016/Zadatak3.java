package Zadaci_08_09_2016;

public class Zadatak3 {
	// Metoda koja nasljedjuje klasu Comparable i koja pronalazi najvecu
	// vrijednost u nizu brojeva
	public static <E extends Comparable<E>> E max(E[] list) {
		// Najveca vrijednoszt je jednaka prvom indexu iz niza
		E max = list[0];
		// Prolazimo kroz niz
		for (int i = 1; i < list.length; i++) {
			E element = list[i];
			// Ako element poredjen sa najvecom vrijednosti je veci od 0 na
			// najvecu vrijednost dodajemo vrijedsnot tog elementa
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		// Vracamo najvecu vrijednosti
		return max;
	}

	public static void main(String[] args) {
		// Niz od deset brojeva
		Integer[] list = new Integer[10];
		for (int i = 0; i < list.length; i++) {
			list[i] = i;
		}
		// Pozivamo metodu koja pronalazi najvecu vrijednost u nizu i ispisujemo
		System.out.println("Najveci broj je " + max(list));

	}

}
