package Zadaci_07_09_2016;

import java.util.Scanner;

public class Zadatak5 {
	private static int getLargest(int[] array) {
		// Vracamo metodu najveci
		return getLargest(array, 0, array[0]);
	}

	// Metoda koja pronalazi najveci broj u nizu
	private static int getLargest(int[] array, int i, int high) {
		// Ako je i jednako duzini niza
		if (i == array.length)
			// Vracamo da je i najveci index
			return high;
		// Ako je najveci index manji od indexa i onda najveci dobija njegu
		// vrijednost
		if (high < array[i])
			high = array[i];
		// Vracamo najveci
		return getLargest(array, i + 1, high);
	}

	public static void main(String[] args) {
		// Trazimo od korisnika da unese niz od osam brojeva
		int[] array = new int[8];
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite 8 brojeva: ");
		// For petlja prolazi kroz niz
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			// Pozivamo meotdu najveci i ispisujemo najveci broj u nizu
		}
		System.out.println("Najveci broj u nizu je " + getLargest(array));
		// Zatvaramo unos
		input.close();

	}

}
