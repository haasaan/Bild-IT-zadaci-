package Zadaci_04_08_2016;

import java.util.Scanner;

public class Zadatak3 {
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		// Pravimo privremenu varijablu temp
		double temp;
		// Koristimo uslov ako je broj1 veci od broja2 onda ce varijabla temp
		// preuzeti vrijednost broja1 vrijednost broja1 ce bit jednaka broju2 te
		// ce vrijednost na varijabli temp postati vrijednost broja2
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		// Isto tako ako je broj2 veci od broja3 varijabla uzima njegovu
		// vrijednost takodjer vrijendosti broja2 i broja4 ce biti jendkae te ce
		// varijabla preuzeti vrijednost broja3
		if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		// U ovom uslovu samo ponavljamo stvar iz prvog uslova i tako dobijamo
		// sortirane brojeve od najmanjeg do najveceg
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println(num1 + " " + num2 + " " + num3);

	}

	public static void main(String[] args) {
		// Pravimo skener te 3 varijable broj1 broj2 i broj3 i kazemo korisniku
		// da unese neka tri broja
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite tri broja: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		input.close();
		// Pozivamo metodu koja sortira brojeve
		displaySortedNumbers(num1, num2, num3);

	}

}
