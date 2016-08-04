package Zadaci_03_08_2016;

import java.util.Scanner;

public class Zadatak2 {

	public static double min(double[] array) {
		double min = array[0];
		// Petljom prolazimo kroz niz
		for (int i = 0; i < array.length; i++) {
			// Onda postavljamo uslov ako je broj na indexu i manji od min onda
			// min uzima njegovu vrijednost i tako dobijamo najmanji elememnt u
			// nizu
			if (array[i] < min) {
				min = array[i];

			}
		}
		return min;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite deset brojeva ");
		// Napravili smo niz od 10 brojeva i kroz petlju prolazimo i trazimo od
		// korisnika da unese svojih 10 brojeva nakon stoje unijeo pozvali smo
		// metodu i dobili najmanji element u nizu
		double[] array = new double[10];
		for (double i = 0; i < array.length; i++) {
			array[(int) i] = input.nextDouble();
		}
		input.close();
		System.out.println(min(array));

	}

}
