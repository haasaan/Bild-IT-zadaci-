package Zadaci_03_08_2016;

import java.util.Scanner;

public class Zadatak3 {

	public static boolean equals(int[] array1, int[] array2) {
		// Postavljamo uslov ako su elemnti oba niza jednaki boolean ce nam
		// vratiti true
		if (array1 == array2) {
			return true;
		}
		// Postavljamo uslov ako su oba niza jednaka nuli da nam vrati false
		if (array1 == null || array2 == null) {
			return false;
		}
		// Postavljamo uslov ako je duzina niza razlicita vratice nam false
		int length = array1.length;
		if (array2.length != length) {
			return false;
		}
		// Koristimo for petlju i prolazimo kroz duzinu niza
		for (int i = 0; i < length; i++) {
			// Pravimo dva objekta i dodajemo elemente iz niza 1 i niza 2 u njih
			// da ih mozemo porediti u uslovu
			Object o1 = array1[i];
			Object o2 = array2[i];
			if (!(o1 == null ? o2 == null : o1.equals(o2)))
				return false;
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite dva niza ");
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = input.nextInt();
		}
		for (int i = 0; i < array2.length; i++) {
			array2[i] = input.nextInt();
		}
		input.close();
		System.out.println(equals(array1, array2));

	}

}
