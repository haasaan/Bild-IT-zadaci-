package Zadaci_03_09_2016;

import Zadaci_02_09_2016.MyRectangle2D;
import Zadaci_26_08_2016.Circle2D;
import Zadaci_26_08_2016.GeometricObject;

public class Zadatak4 {

	public static void main(String[] args) {
		// Pravimo niz geometriskih objekata
		GeometricObject[] shapes = new GeometricObject[4];
		// For petlja prolati kroz niz kome je granica 4
		for (int i = 0; i < 4; i++) {
			// Ako je i manje od 2 index i je jendak circe ako je drugacije onda
			// je jendak Rectangle
			if (i < 2) {
				shapes[i] = new Circle2D();
			} else {
				shapes[i] = new MyRectangle2D();
			}
			// Ispisujemo povrsinu objekata i sumu
			System.out.println("Povrsina objekta #" + (i + 1) + " = " + shapes[i].getArea());
		}

		System.out.println("Suma geometriskih objekata = " + GeometricObject.sumArea(shapes));

	}

}
