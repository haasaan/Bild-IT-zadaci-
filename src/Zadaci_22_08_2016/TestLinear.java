package Zadaci_22_08_2016;

import java.util.Scanner;

public class TestLinear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese a b c d e f
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		// Pravimo novi objekat kojem prosljedujemo argumene a b c d e f
		LinearEquation linear = new LinearEquation(a, b, c, d, e, f);
		// Ako je jednacina rijesiva ispisujemo vrijednost x pozivajuci metodu
		// getX i vrijednost Y preko metode getY
		if (linear.isSolvable()) {
			System.out.println("x is " + linear.getX() + " and y is " + linear.getY());
			// Ako jednacina nije rijesiva ispisujemo da jednacina nije rijesiva
		} else {
			System.out.println("The equation has no solution.");
		}
		// Zatvaramo unos
		input.close();
	}

}
