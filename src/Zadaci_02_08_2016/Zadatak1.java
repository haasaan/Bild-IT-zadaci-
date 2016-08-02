package Zadaci_02_08_2016;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// Ovdje trazimo od korisnika da unese pocetnu godinu ikrajnju godinu.
		// To jest moramo da znamo odakle da krenemo racunat odkoje do koje
		// godine.
		Scanner input = new Scanner(System.in);
		System.out.println("Unesi pocetnu godinu: ");
		int pocetnaGodina = input.nextInt();
		System.out.println("Unesi krajnju godinu: ");
		int krajnjaGodina = input.nextInt();
		// Pomocu for petlje prolazimo kroz unijete godine tj nasa petlja ide od
		// godine koje smo unijeliod kranje godine.
		// Koristilo smo + 1 na krajnju godinu tako da nam racuna ii unesenu
		// godinu.
		System.out.println("Prestupne godine su: ");
		for (int i = pocetnaGodina; i < krajnjaGodina + 1; i++) {
			if (i % 4 == 0)
				System.out.print(i + " ");
			if (i % 10 == 0) {
				System.out.println();
			}

		}
		input.close();
	}

}
