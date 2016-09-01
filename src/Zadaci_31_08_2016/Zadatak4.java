package Zadaci_31_08_2016;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
	// Metoda koja broji ukupan broj bodova
	private static int getTotal(ArrayList<Integer> scores) {

		int total = 0;
		for (int score : scores) {
			total += score;
		}

		return total;
	}

	// Metodakoja racuna prosjek
	private static double getAverage(ArrayList<Integer> scores) {
		double total = getTotal(scores);
		return total / scores.size();
	}

	public static void main(String[] args) {
		// Nova lista scores
		ArrayList<Integer> scores = new ArrayList<>();
		// Try blok postavljamo novi url i dodajemo bodove na listz
		try {
			URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
			Scanner input = new Scanner(url.openStream());
			while (input.hasNextInt()) {

				scores.add(input.nextInt());
			}
			input.close();
			// Hvatamo exception
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		// Ipsiujemo bodove ukupno i prosjek
		System.out.println("Bodovi = " + scores);
		System.out.println("Ukupno bodova = " + getTotal(scores));
		System.out.println("Prosjek = " + getAverage(scores));

	}

}
