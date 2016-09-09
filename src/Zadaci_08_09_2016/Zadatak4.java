package Zadaci_08_09_2016;

public class Zadatak4 {
	// Metoda koja pronalazi najveci element u dvodimenzionalnom nizu
	public static <E extends Comparable<E>> E max(E[][] list) {
		// Najveca vrijedsnot je jednaka prvim indexima iz reda ikolone
		E max = list[0][0];
		// For each petlja prolazi kroz redove i kolone
		for (E[] elements : list) {
			for (E element : elements) {
				// Ako je element poredjen sa najvecom vrijednosti veci od 0
				// onda najveca vrijedsnot dobija vrijedsnot tog elementa
				if (element.compareTo(max) > 0) {
					max = element;
				}
			}
		}
		// Vracamo najvecu vrijednost
		return max;
	}

	public static void main(String[] args) {
		// Pravimo dvodimenzionalan niz
		Integer[][] list = new Integer[10][10];
		int value = 0;
		// Dvije for petlje prolaze kro redove i kolone
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				// Nas 2d niz sa indexima i j je jendak povecanju vrijednosti
				list[i][j] = value++;
			}
		}
		// Printamo najvecu vrijednot pozivajci metodu max
		System.out.println("Najveca vrijednost dvodimenzionalnog niza je = " + max(list));

	}

}
