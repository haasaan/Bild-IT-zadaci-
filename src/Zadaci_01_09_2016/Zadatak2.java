package Zadaci_01_09_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak2 {
	// Metoda koja provjerava da li je slovo
	private static boolean isLetter(char ch) {

		return (ch >= 'A' && ch <= 'Z');
	}

	public static void main(String[] args) {

		System.out.print("Unesite ime fajla: ");
		// trazimo od korisnika da unese ime fajla
		File file = new File(new Scanner(System.in).next());
		// Ako fajl ne postoji ispisujemo poruku
		if (!file.exists()) {
			System.out.println(file + " ne postoji");
			System.exit(1);
		}
		// Pravimo novi prazan string
		String buffer = "";
		int[] letterCount = new int[26];
		// Try blok pokusajemo uniet ime fajla
		try (Scanner input = new Scanner(file)) {

			while (input.hasNext()) {
				buffer = input.nextLine();
				// For each petlja pretvaramo sve u velika slova
				for (char ch : buffer.toCharArray()) {
					ch = Character.toUpperCase(ch);
					// Ako je slovo povecavamo brojac
					if (isLetter(ch)) {
						letterCount[ch - 'A']++;
					}
				}

			}
			// Hvatamo exception i catch bloku
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		// For petlja prolazimo kroz brojac te ispisujemo koliko se puta
		// ponovoila slova
		for (int i = 0; i < letterCount.length; i++) {
			System.out.println((char) (i + 'A') + " ponavlja se = " + letterCount[i]);
		}

	}

}
