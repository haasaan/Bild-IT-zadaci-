package Zadaci_18_08_2016;

import java.util.Scanner;

public class Zadatak4 {
	// Pravimo metodu koja racuna sumu koloni
	public static double sumColumn(double[][] m, int columnIndex) {
		double total = 0.0;
		for (int row = 0; row < m.length; row++) {
			total += m[row][columnIndex];
		}
		return total;
	}

	// Pravimo metodu koja vraca dvodimenzionalni niz
	public static double[][] createArray() {
		Scanner input = new Scanner(System.in);
		double[][] arrayToReturn = new double[3][4];
		// Trazimo od korisnika da unese 3 puta 4 matricu red po red
		System.out.println(
				"Unesite " + arrayToReturn.length + " puta " + arrayToReturn[0].length + " matricu red po red: ");
		for (int i = 0; i < arrayToReturn.length; i++)
			for (int j = 0; j < arrayToReturn[0].length; j++)
				arrayToReturn[i][j] = input.nextDouble();
		// Zatvaramo unos
		input.close();
		// Metoda vraca unijeti niz
		return arrayToReturn;

	}

	public static void main(String[] args) {
		// Pozivamo metodu u kojoj smo napravili niz
		double[][] m = createArray();
		double sum = 0.0;
		// For petlja prolazi korz kolone i racuna sumu svake kolone koristeci
		// metodu sumColumn
		for (int column = 0; column < m[0].length; column++) {
			sum = sumColumn(m, column);
			// Printamo sumu kolona
			System.out.println("Suma elemenata kolonu po kolonu  " + (column + 1) + " je " + sum);

		}

	}

}
