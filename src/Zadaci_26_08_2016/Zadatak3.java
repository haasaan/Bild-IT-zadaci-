package Zadaci_26_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Pravimo novu arraylistu
		ArrayList<Integer> list = new ArrayList<>();
		// Unosimo brojeve sve dok ne unesemo 0 ona prekida unos
		System.out.print("Enter input end with zero to stop: ");
		int temp;
		// Unosimo brojeve
		do {
			temp = input.nextInt();
			// Ako je unos razlicit od0 dodajemo na arraylistu
			if (temp != 0) {
				list.add(temp);
			}
			// Sve dok je unos razlicit od nule unosimo brojeve kada unesemo 0
			// svi brojevi su dodani na listu
		} while (temp != 0);
		// Te zatim printamo najeci broj iz liste
		System.out.println("Max number is " + max(list));
		input.close();
	}

	public static Integer max(ArrayList<Integer> list) {

		if (list == null || list.isEmpty())
			return null;

		int max = list.get(0);
		for (int i : list) {
			if (i > max) {
				max = i;
			}
		}

		return max;

	}

}
