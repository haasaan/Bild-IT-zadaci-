package Zadaci_26_08_2016;

import java.util.ArrayList;

public class Zadatak5 {

	public static void main(String[] args) {
		// Pravimo novu arrayListu
		ArrayList<Integer> list = new ArrayList<>();
		// For petlja od 0 do 100 te dodajemo te brojeve na listu
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		// Printamo listu
		System.out.println(list);
		// Pintamo nasu "izmjesanu listu"
		System.out.println("Shuffling list...");
		shuffle(list);
		System.out.println(list);
	}

	// Metoda koja "mjesa brojeve u listi"
	public static void shuffle(ArrayList<Integer> list) {

		// For petlja koja ide do kraja liste te koristimo math.radom metodu i
		// mnozimo je sa duzinom liste
		for (int i = 0; i < list.size(); i++) {
			int randomIndex = (int) (Math.random() * list.size());
			// Privremena vrijednost je jednaka nasumicnom indexu iz liste
			int temp = list.get(randomIndex);
			list.set(randomIndex, list.get(i));
			list.set(i, temp);
		}

	}

}
