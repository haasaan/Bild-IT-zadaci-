package Zadaci_29_08_2016;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// Pravimo niz sa 100 nasumicnih brojeva
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		// Trazimo od korisnika da unese index
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite index: ");
		// Koristimo try catch blok i u try bloku unosimo index te ispisujemo
		// index i broj na tom indexu
		try {
			int index = input.nextInt();
			System.out.println("array[" + index + "] = " + array[index]);
			// Catch blok hvata gresku ako unesemo index preko ogranicenog
			// ispisuje nam da je index out of bounds ili da je presao granicu
			// da tog indexa nema
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Index " + ex.getLocalizedMessage() + " je preko ogranicenog ");
			// Ponovo hvata gresku i ispisuje nam da je unos pogresan
		} catch (Exception ex) {
			System.out.println("Unos nije validan");
		}
		// Zatvaramo unos
		input.close();
	}

}
