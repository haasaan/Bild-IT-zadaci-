package Zadaci_29_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
	// Metoda koja racuna i provjerava savrseni broj sa kojem moze bit pomnozen
	private static int smallestSquare(ArrayList<Integer> factors) {

		int[][] occurrences = copy(factors);
		for (int i : factors) {
			search(occurrences, i);
		}

		// Brisemo dublikate i uzimamo razlicite faktore
		ArrayList<Integer> oddSequenceFactors = removeDuplicates(occurrences);

		// Uzimamo mali squar tako sto umnozajemo neparne faktore
		int smallestSquare = 1;
		for (int i : oddSequenceFactors) {
			smallestSquare *= i;
		}
		return smallestSquare;
	}

	// Metoda koja brise duplikate iz liste
	private static ArrayList<Integer> removeDuplicates(int[][] m) {
		ArrayList<Integer> temp = new ArrayList<>();

		for (int i = 0; i < m.length; i++) {
			if (m[i][1] % 2 != 0) {
				temp.add(m[i][0]);
			}
		}

		// Brisemo duplikate
		ArrayList<Integer> duplicateRemoved = new ArrayList<>();
		for (int i = 0; i < temp.size(); i++) {

			if (!duplicateRemoved.contains(temp.get(i))) {
				duplicateRemoved.add(temp.get(i));
			}
		}

		return duplicateRemoved;
	}

	// Pretrazujemo broj koji je savrsen
	private static void search(int[][] m, int number) {
		for (int i = 0; i < m.length; i++) {
			if (m[i][0] == number) {
				m[i][1]++;
			}
		}
	}

	// Metoda koja kopira arrajListu sa faktorima
	private static int[][] copy(ArrayList<Integer> factors) {

		int[][] temp = new int[factors.size()][2];

		for (int i = 0; i < temp.length; i++) {
			temp[i][0] = factors.get(i);
		}
		return temp;
	}

	// Metoda preko koje dobijamo faktore u arralisti
	private static void getFactors(int m, ArrayList<Integer> factors) {

		int count = 2;
		while (count <= m) {
			if (m % count == 0) {
				factors.add(count);
				m /= count;
			} else {
				count++;
			}
		}
	}

	public static void main(String[] args) {
		// Unosimo broj m
		System.out.print("Unesite integer m: ");
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		// Pravimo novu arrayListu
		ArrayList<Integer> factors = new ArrayList<>();
		// Pzivamo metodu koja nam pravi faktore
		getFactors(m, factors);
		// Pravimo varijablu smallestSquare koja ima vrijednost najmanjeg
		// savrsenog pozivajuci metodu koja ga racuna
		int smallestSquare = smallestSquare(factors);
		// Printamo najmanji savrseni
		System.out.println("Najmanji broj  n za m * n da bude savrsen je  " + smallestSquare);
		System.out.println("m * n = " + (m * smallestSquare));
		// Zatvaramo unos
		input.close();
	}

}
