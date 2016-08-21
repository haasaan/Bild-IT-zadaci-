package Zadaci_20_08_2016;

import java.util.Scanner;

public class LocationTest {

	public static void main(String[] args) {
		// Tramo od korisnika da unese broj redova ikoloni
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] m = new double[row][column];
		// Zatim trazimo da unese niz
		System.out.println("Enter the array:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		// Pozivamo metodu koja pronalazi lokaciju najvece vrijednosti
		Location location = Location.locateLargest(m);
		// Printamo najvecu vrijednost i njenu lokaciju
		System.out.println("The location of the largest element is " + location.maxValue + " at (" + location.row + ", "
				+ location.column + ")");
		input.close();
	}

}
