package Zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
	// Pravimo metodu koja brise sve vrijednosti koje su se ponovile
	public static void removeDuplicate(ArrayList<Integer> list) {
		// Pravimo novu listu temp
		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			// Ako lista temp ne sadrzi index i iz liste list
			if (!temp.contains(list.get(i))) {
				// Onda taj index dodajemo na listu temp
				temp.add(list.get(i));
			}
		}
		// Cistimo list i dodajemo sve na listu temp
		list.clear();
		list.addAll(temp);

	}

	public static void main(String[] args) {
		System.out.print("Unesite deset brojeva ");
		Scanner input = new Scanner(System.in);
		// Pravmo novu listu
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			list.add(input.nextInt());

		// Pozivamo metodu koja brise sve duplikate iz liste
		removeDuplicate(list);
		// Printamo nasu listu bez duplikata
		System.out.println("Nasa lista bez duplikata: ");
		System.out.println(list);
		// Zatvaramo unos
		input.close();
	}

}
