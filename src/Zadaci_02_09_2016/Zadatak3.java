package Zadaci_02_09_2016;

import Zadaci_26_08_2016.GeometricObject;

public class Zadatak3 {

	public static void main(String[] args) {
		// Pravimo tri objketa te poredimo prva dva te na treci o
		ComparableCircle c1 = new ComparableCircle(0, 0, 5);
		ComparableCircle c2 = new ComparableCircle(0, 0, 10);
		ComparableCircle c3 = (ComparableCircle) (GeometricObject.max(c1, c2));
		System.out.println(c1);
		System.out.println(c2);

		System.out.println("Max circle = " + c3.getRadius());
		System.out.println(c3);

	}

}
