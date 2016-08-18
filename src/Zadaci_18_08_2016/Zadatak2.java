package Zadaci_18_08_2016;

import java.util.Scanner;

public class Zadatak2 {
	// Pravimo metodu koja generise nizu granicu i vecu granicu izmedju brojeva
	public static int intRandom(int lower, int upper) {
		return (int) (lower + Math.random() * (upper - lower + 1));
	}

	public static int getRandom(int... numbers) {
		int random = 0;
		boolean num = true;
		// Petlja while sve dok broj ne dodje do broja koji nije proslijedjen u
		// argumentu
		while (num) {
			random = intRandom(1, 54);
			// Ako nije u argumentu boolean vrijednost je false
			num = false;
			for (int i : numbers) {
				// Ako booean false prebacujemo na true i generisemo nasumicni
				// broj
				if (random == i) {
					num = true;
					break;
				}

			}
		}
		return random;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		// Unosimo 10 brojeva
		System.out.println("Unesite 10 brojeva");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		// Prinatmo listu od 100 nasumicnih brojeva
		System.out.println("Lista 100 nasumicnih brojeva");
		for (int i = 0; i < 100; i++) {
			System.out.println(getRandom(array));

		}
		// Zatvaramo unos
		input.close();
	}

}
