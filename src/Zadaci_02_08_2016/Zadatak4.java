package Zadaci_02_08_2016;

import java.util.Scanner;

public class Zadatak4 {
	public static void printMatrix(int n) {
		// U ovoj metodi printMatrix napravili smo dvodimenzionalni niz
		// Koristili smo for petlju da prodjemo kroz redove i kolone
		// Kotistili smo Math ranndom*2 da dobijemo nasuicno jedinice i nule.

		int[][] matrix = new int[n][n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Ovdje smo samo dodali Scanner da trazimo od korsnika da unesen
		// I takodjer pozvali smo petodu printMatrix
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj n ");
		int unos = input.nextInt();
		printMatrix(unos);
		input.close();

	}

}
