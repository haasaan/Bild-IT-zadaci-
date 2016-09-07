package Zadaci_07_09_2016;

import java.util.Scanner;

public class Zadatak1 {
	// Metoda koja ispisuje broj naopako
	public static void reverseDisplay(int value) {
		// Ako je broj manji od nule
		if (value <= 0)
			return;
		// Pamtimo zadnji broj naseg broga te onda dijelmo sa 10
		System.out.print(value % 10);
		reverseDisplay(value / 10);
	}

	public static void main(String[] args) {
		// Unosimo broj
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite broj: ");
		int value = input.nextInt();
		// Ispisujemo broj naopako
		reverseDisplay(value);
		// Zatvaramo unos
		input.close();

	}
}
