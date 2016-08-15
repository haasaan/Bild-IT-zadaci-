package Zadaci_15_08_2016;

import java.util.Scanner;

public class Zadatak5 {
	// Pravimo metodu printMatrix koja generise nasumicno 0 i 1 te ispisuje
	// matricu
	public static void printMatrix(int n) {
		int[][] matrix = new int[n][n];
		// For petlja prvo prolazimo kroz redove matrice
		for (int row = 0; row < matrix.length; row++) {
			// Zatim kroz kolone matrice
			for (int column = 0; column < matrix[row].length; column++) {
				// Zatim postavljamo da je nasa matrica ima vrijednost 0 i 1
				// nasumicno odabrani
				matrix[row][column] = (int) (Math.random() * 2);
				// Printamo matricu
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korsnika da unese broj n tj da unese koliku matricu zeli
		// npr(ako unese 3 to ce bit 3x3 matrica itd)
		System.out.println("Unesite broj n ");
		int n = input.nextInt();
		// Pozivamo nasu metodu u kojoj print matrix koja printa nasumicno 0 i 1
		printMatrix(n);
		// Zatvaramo unos
		input.close();

	}

}
