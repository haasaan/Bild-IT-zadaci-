package Zadaci_12_08_2016;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Pravimo varijable n1 n2 x y temp najveci najmanji
		int n1;
		int n2;
		int x;
		int y;
		int najmanji;
		int najveci;
		int temp;
		// Unosimo prvi broj
		System.out.println("Unesite prvi broj");
		n1 = input.nextInt();
		// Unosimo drugi broj
		System.out.println("Unesite drugi broj");
		n2 = input.nextInt();
		// Dodjeljujemo varijabli x vrijednost broja 1
		x = n1;
		// Dodjeljujemo varijabli y vrijednost broja 2
		y = n2;
		// Koristomo while petlju ako je broj 2 razlicit od 0 dodjeljujemo na
		// nasu varijablu temp vrijednost broja 2 zatim na broj dva dodjeljujemo
		// vrijednost kolicnika broja 1 i 2 te na kraju broju jedan dodjeljujemo
		// vrijednost varijable temp koja ima vrijednost broja2
		while (n2 != 0) {
			temp = n2;
			n2 = n1 % n2;
			n1 = temp;
		}
		// Tada nas najveci zajednicki djelila dobija vrijednost broja 1 a
		// najmanji zajednicki djeliac ima vrijednost kada pomnozimo nasa dva
		// broja te ih podjelimo sa najmanjim
		najveci = n1;
		najmanji = (x * y) / najveci;
		// Ispisujemo najveci i najmanji zajednicki djelilac
		System.out.println("Najveci zajednicki djelilac je: " + najveci);
		System.out.println("Najmanji zajednicki djeliac je: " + najmanji);
		// Zatvaramo unos
		input.close();
	}

}
