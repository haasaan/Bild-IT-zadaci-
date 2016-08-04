package Zadaci_03_08_2016;

import java.util.Scanner;

public class Zadatak4 {

	public static int locateLargest(double[][] a) {
		// Napravili smo niz koji ce nam sadrat lokaciju najveceg elementa i
		// varijablu koja ce nam sadrat vrijednost
		int[] array = new int[2];
		int largest = (int) a[(int) 0][(int) 0];
		// Korsitimo for petlju da prodjemo kroz 2d niz
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				// Zatim postavljamo uslov ako su indexi u 2d nizu veci od
				// vrijednosti koju trenutno ima nasa varijabla ona dobija tu
				// vrijednost i tako se petlja vrti sve dok nasa varijabla ne
				// bude imala najvecu vrijednost
				if (a[row][column] > largest) {
					largest = (int) a[row][column];
					array[0] = row;
					array[1] = column;
				}
			}

		}
		return largest;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite dvodimenzionalni niz ");
		double[][] array = new double[3][3];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextInt();

			}
		}
		input.close();
		System.out.println("Najveci element dvodimenzionalnog niza je: " + locateLargest(array));

	}

}
