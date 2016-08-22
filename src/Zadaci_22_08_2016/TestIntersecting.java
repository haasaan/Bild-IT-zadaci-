package Zadaci_22_08_2016;

import java.util.Scanner;

public class TestIntersecting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese x-ove

		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double[][] points = new double[4][2];
		for (int i = 0; i < points.length; i++)
			for (int j = 0; j < points[i].length; j++)
				points[i][j] = input.nextDouble();
		// Pravimo novi bjekat te dodjeljujemo argument points
		LinearEquation linear = LinearEquation.getIntersectingPoint(points);
		// Ako je jednacina rjesiva program nam ispisuje gdje se nalazi
		// tackaizmedju x i y
		if (linear.isSolvable()) {
			System.out.println("The intersecting point is at (" + linear.getX() + ", " + linear.getY() + ")");
			// Ako nije onda su dvije linije paralelne
		} else {
			System.out.println("The two lines are parallel");
		}
		// Zatvaramo unos
		input.close();

	}

}
