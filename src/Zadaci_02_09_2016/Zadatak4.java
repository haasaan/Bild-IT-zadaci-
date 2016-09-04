package Zadaci_02_09_2016;

import Zadaci_02_09_2016.MyRectangle2D;
import Zadaci_26_08_2016.Circle2D;
import Zadaci_26_08_2016.GeometricObject;

public class Zadatak4 {

	public static void main(String[] args) {
		// Pravimo jedan objekat
		GeometricObject[] geoShapes = new GeometricObject[5];
		// Index objekta 0 dodajemo rectangle na 1 dodjemo krug na 2 dodajemo
		// square na 3 ponovo rectangle i na 4 ponovo square
		geoShapes[0] = new MyRectangle2D();
		geoShapes[1] = new Circle2D();
		geoShapes[2] = new Square();
		geoShapes[3] = new MyRectangle2D(0, 0, 10, 5);
		geoShapes[4] = new Square(0, 0, 25);

		for (int i = 0; i < geoShapes.length; i++) {
			// Ispisujemo povrisnzi kako cemo obojiti objekte
			System.out.println("shape #" + (i + 1) + " area = " + geoShapes[i].getArea());
			if (geoShapes[i] instanceof Colorable) {
				System.out.println("How to color: " + ((Colorable) geoShapes[i]).howToColor());
			}
		}

	}

}
