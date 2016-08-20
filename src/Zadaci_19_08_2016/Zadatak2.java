package Zadaci_19_08_2016;

import java.util.Scanner;

public class Zadatak2 {
	// Pravimo metodu koja mnozi dvije matrice i stvara trecu kao proizvod prve
	// dvije matrice
	public static double[][] multiply(double[][] a, double[][] b) {
		double rowsInA = a.length;
		double columnsInA = a[0].length; // isto kao i redovi u matrici b
		double columnsInB = b[0].length;
		double[][] c = new double[(int) rowsInA][(int) columnsInB];
		// For petlju prolazi kroz matricu te je nasa matrica jednaka proizvodu
		// prve dvije matrice
		for (int i = 0; i < rowsInA; i++) {
			for (int j = 0; j < columnsInB; j++) {
				for (int k = 0; k < columnsInA; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		// Vracamo nas proivod prve dvije matrice tj trecu matricu
		return c;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo da se unese broj redova matrice a
		System.out.print("Enter number of rows in A: ");
		double rowsInA = input.nextInt();
		// Trazimo da se unese broj kolona u matrici a tj broj redova u matrici
		// b
		System.out.print("Enter number of columns in A / rows in B: ");
		double columnsInA = input.nextInt();
		// Trazimo da se unese broj kolona u matrici b
		System.out.print("Enter number of columns in B: ");
		double columnsInB = input.nextInt();
		double[][] a = new double[(int) rowsInA][(int) columnsInA];
		double[][] b = new double[(int) columnsInA][(int) columnsInB];
		// Unosimo matricu a
		System.out.println("Enter matrix A");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = input.nextInt();
			}
		}
		// Unosimo matricu b
		System.out.println("Enter matrix B");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				b[i][j] = input.nextInt();
			}
		}
		// Pozivamo metodu koja mnozi dvije unesene matrice
		double[][] c = multiply(a, b);
		// Ispisujemo trecu matricu tj proizvod prve dvije matrice
		System.out.println("Product of A and B is");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		// Zatvaramo unos
		input.close();
	}
}