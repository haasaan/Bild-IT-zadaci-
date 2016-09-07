package Zadaci_07_09_2016;

import java.util.Scanner;

public class Zadatak2 {
	// Rekurzivna metoda koja vraca string u obrnutom redoslijedu
	private static void reverseDisplay(String value) {
		// Akoje duzina stringa jednaka nuli ispisujemo substring duzine strina
		// minus jedan
		if (value.length() == 0)
			return;
		System.out.print(value.substring(value.length() - 1));
		reverseDisplay(value.substring(0, value.length() - 1));
	}

	public static void main(String[] args) {
		// Trazimo od korisnika da unese string
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite string: ");
		String value = input.nextLine();
		// Pozivamo metodu koja ispisuje string u obrnutom redoslijedu
		reverseDisplay(value);
		input.close();
	}

}
