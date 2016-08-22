package Zadaci_22_08_2016;

import java.util.Scanner;

public class TestQuadratic {

	public static void main(String[] args) {
		// Pravimo scanner za unos sa tastature
		Scanner input = new Scanner(System.in);
		// Unosimo nase a b c
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		// Pravimo novi objekt zvani equation te prosljedujemo mu argumente a b
		// c
		QuadraticEquation equation = new QuadraticEquation(a, b, c);
		double discriminant = equation.getDiscriminant();
		// Ako je nasa diskriminanta veca od 0 printamo oba korijena
		if (discriminant > 0) {
			System.out.println("The roots are " + equation.getRoot1() + " and " + equation.getRoot2());
			// Ako nije printamo samo prvi korijen
		} else if (discriminant == 0) {
			System.out.println("The root is " + equation.getRoot1());
			// Ako nista od prva dva uslova nije zadovoljeno onda nasa kvadratna
			// jednacina nema korijena
		} else {
			System.out.println("The equation has no roots");

		}
		input.close();
	}

}
