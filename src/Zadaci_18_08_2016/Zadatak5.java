package Zadaci_18_08_2016;

import java.util.Scanner;

public class Zadatak5 {
	// Koristimo metodu da izracunamo sumu dvije matrice
	public static double[][] addMatrix(double[][] a, double[][] b) {

		double[][] addedMatrix = new double[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[0].length; k++) {
				addedMatrix[i][k] = a[i][k] + b[i][k];
			}
		}

		return addedMatrix;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese prvu mmatricu
		System.out.print("Unesite 3x3 matricu 1: ");
		double[][] matrix1 = new double[3][3];
		for (int i = 0; i < matrix1.length; i++)
			for (int k = 0; k < matrix1[i].length; k++)
				matrix1[i][k] = input.nextDouble();
		// Trazimo od korisnika da unese drugu matricu
		System.out.print("Unesite 3x3 matricu 2: ");
		double[][] matrix2 = new double[3][3];
		for (int i = 0; i < matrix2.length; i++)
			for (int k = 0; k < matrix2[i].length; k++)
				matrix2[i][k] = input.nextDouble();
		// Dodajemo dvije matrice koje smo unijeli tj njihove vrijejednosti na
		// jednu matricu tj sabiramo ih koristeci metodu addMatric
		double[][] addedMatrix = addMatrix(matrix1, matrix2);

		for (int i = 0; i < matrix1.length; i++) {
			// Printamo prvu matricu ponovo
			for (int k = 0; k < matrix1[i].length; k++) {
				System.out.printf("%2.1f ", matrix1[i][k]);
				// Uslov if ako je i jednako 1 i i jednako 2 prinatmo rojeve i
				// plus izmedjunjih
				if (i == 1 && k == 2)
					System.out.printf("%2s ", " + ");
				// Ako nije printamo razmak
				else
					System.out.printf("%3s ", " ");
			}
			// POnovo printamo drugu matricu
			for (int k = 0; k < matrix2[i].length; k++) {
				System.out.printf("%2.1f ", matrix2[i][k]);
				// Sada uslov dodajemo jednako izmedj matrica
				if (i == 1 && k == 2)
					System.out.printf("%2s ", " = ");
				// Ako nista dodajemo opet razmak
				else
					System.out.printf("%3s ", " ");

			}
			// Printamo nasu novu matricu tj matrivu koja je zbir prve dvije
			for (int k = 0; k < addedMatrix[i].length; k++) {
				System.out.printf("%4.1f ", addedMatrix[i][k]);
			}
			System.out.println("");

		}
		input.close();
	}
}
