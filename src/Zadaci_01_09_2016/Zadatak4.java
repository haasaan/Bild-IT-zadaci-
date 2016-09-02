package Zadaci_01_09_2016;

import java.util.ArrayList;

public class Zadatak4 {
	// Metoda koja "razbacuje" brojeve ili mijesa brojeve u lisit
	public static void shuffle(ArrayList<Number> list) {
		// For petlja prolazi kroz duzinu liste
		for (int i = 0; i < list.size(); i++) {
			// Varijabla random te koristimo random metodu koja uzima nasumicne
			// brojeve i mnozimo sa duzinom liste tj sa brojem brojeva u listi
			int randomIndex = (int) (Math.random() * list.size());
			// Dodjemo broj na listu postavljamo listu
			Number temp = list.get(randomIndex);
			list.set(randomIndex, list.get(i));
			list.set(i, temp);
		}
	}

	public static void main(String[] args) {
		// Pravimo novu listu
		ArrayList<Number> list = new ArrayList<>();
		// Uzimamo brojeve od 0 do 100 i dodajemo na listu
		for (int i = 0; i < 100; i++)
			list.add(i);
		// Ispisujemo listu u normalnom rasporedu
		System.out.println(list);
		// Ispisujemo nasumicno razbacane brojeve u listi pozivajuci metodu
		// shuffle
		System.out.println("Nasumicni brojevi u listi");
		shuffle(list);
		System.out.println(list);

	}

}
