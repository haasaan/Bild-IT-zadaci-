package Zadaci_08_09_2016;

import java.util.ArrayList;

public class Zadatak1 {
	// Metoda kojoj prosljedujemo arrayListu i koja provjetrava da li ima
	// ponovljnih karaktera u koliko ima brise duplikate
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		// Nova lista
		ArrayList<E> newList = new ArrayList<>(list.size());
		// fro each petlha
		for (E aList : list) {
			// Ako lista ne sadrzi ono sto druga lista sadrzi dodajemo na drugu
			// listu
			if (!newList.contains(aList)) {
				newList.add(aList);
			}
		}
		// Vracamo newList
		return newList;
	}

	public static void main(String[] args) {
		// Nova lista
		ArrayList<String> strings = new ArrayList<>();
		// Forperlja ide od 0 do 10 i dodajemo na listu string hello
		for (int i = 0; i < 10; i++) {
			strings.add("Hello");
		}
		// Pozivamo metodu koja brise duplikate i ispisujemo
		strings = removeDuplicates(strings);
		for (String s : strings) {
			System.out.println(s);

		}
	}
}
