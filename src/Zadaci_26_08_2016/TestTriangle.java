package Zadaci_26_08_2016;

import java.util.Scanner;

import Zadaci_26_08_2016.Triangle.IllegalTriangleException;

public class TestTriangle {

	public static void main(String[] args) {
		// Novi scaner
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese 3 stranice
		System.out.print("Enter three sides of a triangle: ");
		double[] sides = new double[3];
		for (int i = 0; i < sides.length; i++)
			sides[i] = input.nextDouble();
		// Trazimo da unese boju trokita
		System.out.print("Enter a triangle color: ");
		String color = input.next();
		// Provjerava da li je trokut popunjen
		System.out.print("Is the triangle filled? true/false: ");
		String isFilledString = input.next();
		boolean isFilled = (isFilledString.equals("true"));
		// Novi objekat trokut
		Triangle t1 = null;
		// U try boloku pokusajemo ispisati boju povrsinu perimetar i da li je
		// popunjen trokut
		try {
			t1 = new Triangle(sides[0], sides[1], sides[2]);
			t1.setColor(color);
			t1.setFilled(isFilled);
			System.out.println("Triangle 1:");
			System.out.println("Area = " + t1.getArea());
			System.out.println("Perimeter = " + t1.getPerimeter());
			System.out.println("Color = " + t1.getColor());
			System.out.println("Is filled? " + t1.isFilled());
			// Ako ne moze hvatamo exception i printamo stak
		} catch (IllegalTriangleException e) {
			e.printStackTrace();
		}
		// Zatvaramo unos
		input.close();
	}

}
