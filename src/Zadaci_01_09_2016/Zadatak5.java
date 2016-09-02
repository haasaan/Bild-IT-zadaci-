package Zadaci_01_09_2016;

import java.util.ArrayList;

public class Zadatak5 {
	// Metoda koja sortira listu
	public static void sort(ArrayList<Number> list) {

		for (int i = 0; i < list.size() - 1; i++) {
			Number currentMin = list.get(i);
			int currentIndex = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j).doubleValue() < currentMin.doubleValue()) {
					currentMin = list.get(j);
					currentIndex = j;
				}
			}

			if (currentIndex != i) {
				list.set(currentIndex, list.get(i));
				list.set(i, currentMin);
			}
		}
	}

	public static void main(String[] args) {
		// Nova lista
		ArrayList<Number> numbers = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			numbers.add(i);
		}
		// Pozivamo metodu i ispisujemo listu
		sort(numbers);
		System.out.println(numbers);
	}

}
