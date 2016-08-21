package Zadaci_20_08_2016;

import java.util.Scanner;

public class Zadatak1 {
	// Pravimo metodu koja sortira redove u matrici
	public static double[][] sortRows(double[][] m) {

		double[][] sortedRows = new double[m.length][m[0].length];
		// Fro petlja prolazi kroz matricute dodaje na novu matricu
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				sortedRows[i][j] = m[i][j];

		// Sada sortiramo samo redove
		for (int i = 0; i < sortedRows.length; i++) {

			for (int j = 0; j < sortedRows[0].length - 1; j++) {

				double currentMin = sortedRows[i][j];
				int minIndex = j;
				for (int column = j + 1; column < sortedRows[0].length; column++) {
					// Ako je varijabla current min veca od sortiranigo reda
					// onda dobija njegovu vrijednost
					if (currentMin > sortedRows[i][column]) {
						currentMin = sortedRows[i][column];
						minIndex = column;
					}
				}
				// Ako je najmanji index razlicit od indexa j onda on dobija
				// vijednost sortiranog niza
				if (minIndex != j) {
					sortedRows[i][minIndex] = sortedRows[i][j];
					sortedRows[i][j] = currentMin;
				}
			}
		}
		// Vracamo sortirani niz
		return sortedRows;
	}

	// Metoda koja nam ispisuje matricu
	public static void displayMatrix(double[][] m) {
		// Petlja preko koje ispisujemo matricu
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%2.3f ", m[i][j]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// Pravimo novu matricu
		double[][] m = new double[3][3];
		// Trazimo od korisnika da unese matricu
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		// Pozivamo metodu koja sortira redove i ispisujemo sortirane redove
		double[][] sorted = sortRows(m);
		displayMatrix(sorted);
		input.close();

	}
}
