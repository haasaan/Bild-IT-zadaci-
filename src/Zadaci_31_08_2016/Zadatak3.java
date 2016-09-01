package Zadaci_31_08_2016;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
	// Metoda koja brise praznine u stringu
	private static String[] removeEmptyStrings(String[] words) {
		// Nova array lista
		ArrayList<String> modifiedWords = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			// Ako je duzina rijeci razlicita od 0 dodajemo ih na listu
			if (words[i].length() != 0) {
				modifiedWords.add(words[i]);
			}
		}
		// Vracamo listu u string formatu
		return modifiedWords.toArray(new String[modifiedWords.size()]);
	}

	public static void main(String[] args) {
		// Ipisujemo url
		System.out.println("Connecting to http://cs.armstrong.edu/liang/data/Lincoln.txt");
		URL url = null;
		// Postavljamo u try bloku novi url
		try {
			url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
			// Ako se desi exception u catch bloku hvatamo i ispisujemo poruku
			// da url nije validan
		} catch (MalformedURLException ex) {
			System.out.println("URL nije validan: " + ex.getMessage());
			ex.printStackTrace();
			System.exit(1);
		}

		// Novi prazni sting s
		String s = "";
		// Try blok unosimo url
		try (Scanner input = new Scanner(url.openStream())) {

			while (input.hasNext()) {
				s += input.nextLine();
			}
			// Ako se dogodigreska hvatamo
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		// String rijeci te pozivamo metodu koja broji samo rijeci i ispisujemo
		// ukupan broj
		String[] words = s.split("[ ,.]", 0);
		words = removeEmptyStrings(words);
		System.out.println("Total word count = " + words.length);

	}

}
