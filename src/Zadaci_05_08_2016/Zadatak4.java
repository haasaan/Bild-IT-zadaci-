package Zadaci_05_08_2016;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// Napravili smo Scanner i trazimo od korisnika da unese niz od 10
		// cijelih brojeva.
		// Za unos niza brojeva koristimo for petlju koja prolazi kroz citav niz
		// i tada korisnik unosi svoje brojeve
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijele brojeve: ");
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		// Takodjer koristimo for petlju samo u bornutom smijeru i printamo
		// brojeve u obrnutom smijeru
		System.out.println("Brojevi u obrnutom smijeru: ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");

		}
		input.close();

	}

}
