package Zadaci_20_08_2016;

import java.util.Scanner;

public class Zadatak2 {
	// Metoda koja provjerava da li su dvije matrice striktno jednake
	public static boolean equals(int[][] m1, int[][] m2) {
		// Akoje matrica1 razlicta od matrice 2 ili matrica1 na indexu0 razlicta
		// od matrice 2 na indexu0 vracamo false
		if (m1.length != m2.length || m1[0].length != m2[0].length)
			return false;

		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				// Ako su dvije matrice potpuno razlicite vracamo true
				if (m1[i][j] != m2[i][j])
					return false;
			}
		}
		// Ako je obrnuto metoda vraca true
		return true;
	}

	public static void main(String[] args) {
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];
		// Unosimo prvu matricu
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list1: ");
		for (int i = 0; i < m1.length; i++)
			for (int j = 0; j < m1[i].length; j++)
				m1[i][j] = input.nextInt();
		// Unosimo drugu matricu
		System.out.print("Enter list2: ");
		for (int i = 0; i < m2.length; i++)
			for (int j = 0; j < m2[i].length; j++)
				m2[i][j] = input.nextInt();
		// Pozivamo metodu equals koja provjerava da li su striktno jednaki ili
		// nisu te ispisujemo
		if (equals(m1, m2)) {
			System.out.println("The two arrays are strictly identical.");
		} else {
			System.out.println("The two arrays are not strictly identical");
		}
		input.close();
	}
}
