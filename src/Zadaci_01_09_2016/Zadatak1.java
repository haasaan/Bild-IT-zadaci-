package Zadaci_01_09_2016;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
	private static final int ASSI = 0; // ASSISTANT
	private static final int ASSO = 1; // ASSOCIATE
	private static final int FULL = 2;

	// Metoda koja racuna ukupnu svotu
	private static double getTotal(Object[] objects) {
		double total = 0;
		for (Object o : objects) {
			total += (double) o;
		}
		return total;
	}

	// Metoda koja racuna internu velicinu
	private static int getInternalSize(ArrayList<ArrayList<Double>> lists) {

		int size = 0;
		for (ArrayList<Double> list : lists) {
			size += list.size();
		}

		return size;
	}

	// Metoda koja racuna prosjek
	private static double getAverage(long total, int size) {

		return (double) total / size;
	}

	public static void main(String[] args) throws Exception {
		// Pravimo 3 liste u koje smijestamo rangove
		ArrayList<ArrayList<Double>> allRanks = new ArrayList<>(3);
		allRanks.add(ASSI, new ArrayList<>());
		allRanks.add(ASSO, new ArrayList<>());
		allRanks.add(FULL, new ArrayList<>());
		// Postavljamo novu url
		URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
		Scanner input = new Scanner(url.openStream());
		// Dok unosimo
		while (input.hasNext()) {
			String firstName = input.next();
			String lastName = input.next();
			String rank = input.next();
			// AKo ranf sadrzi rijec assistant sve rankove sa tom rijeci
			// dodajemo na jednu listu
			if (rank.contains("assistant")) {
				allRanks.get(ASSI).add(input.nextDouble());
				// Tako za ostale dviije liste sa associate i full
			} else if (rank.contains("associate")) {
				allRanks.get(ASSO).add(input.nextDouble());
			} else {
				allRanks.get(FULL).add(input.nextDouble());
			}
		}
		// Pretavramo sve u niz
		long assiTotal = (long) getTotal(allRanks.get(ASSI).toArray());
		long assoTotal = (long) getTotal(allRanks.get(ASSO).toArray());
		long fullTotal = (long) getTotal(allRanks.get(FULL).toArray());
		long total = assiTotal + assoTotal + fullTotal;
		// Ipsisujemo ukupe svote za assistent i associate te ukupnu svotu za
		// sve te pojedinacan prosjek i prosjek za sve ukupno
		System.out.println("Assistant total = " + assiTotal);
		System.out.println("Associate total = " + assoTotal);
		System.out.println("Full total = " + fullTotal);
		System.out.println("All Total = " + total);
		System.out.printf("Assistant average = %.2f \n", getAverage(assiTotal, allRanks.get(ASSI).size()));
		System.out.printf("Associate average = %.2f \n", getAverage(assoTotal, allRanks.get(ASSO).size()));
		System.out.printf("Full average = %.2f \n", getAverage(fullTotal, allRanks.get(FULL).size()));
		System.out.printf("All average = %.2f \n", getAverage(total, getInternalSize(allRanks)));
		// Zatvaramo unos
		input.close();
	}

}
