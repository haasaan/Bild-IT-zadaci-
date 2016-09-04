package Zadaci_02_09_2016;

import Zadaci_26_08_2016.Circle2D;
import Zadaci_26_08_2016.GeometricObject;

public class Zadatak2 {

	public static void main(String[] args) {
		// Pravimo nove objekte circe i rectangle prolsjedjujemo im atgumenete
		// te pozivamo metode iz njihovih klasai ispisujemo
		Circle2D c1 = new Circle2D(0, 0, 5);
		Circle2D c2 = new Circle2D(0, 0, 2);
		Circle2D maxCircle = (Circle2D) GeometricObject.max(c1, c2);
		System.out.println("Circle 1: " + c1);
		System.out.println("Circle 2: " + c2);
		System.out.println("Max circle is: " + maxCircle);

		MyRectangle2D r1 = new MyRectangle2D(0, 0, 10, 5);
		MyRectangle2D r2 = new MyRectangle2D(0, 0, 10, 10);
		MyRectangle2D maxRectangle = (MyRectangle2D) GeometricObject.max(r1, r2);
		System.out.println("MyRec2 1: " + r1);
		System.out.println("MyRec2 2: " + r2);
		System.out.println("Max MyRec2 is: " + maxRectangle);

	}

}
