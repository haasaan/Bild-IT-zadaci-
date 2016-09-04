package Zadaci_03_09_2016;

import Zadaci_02_09_2016.MyRectangle2D;
import javafx.scene.shape.Circle;

public class Zadatak1 {

	public static void main(String[] args) {
		// Pravimodva objekta circle implementirajuci ih iz klasa circle
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(10);
		// Objekat MyRectangle kojeg implementiramo iz klase MyRectangle
		MyRectangle2D r1 = new MyRectangle2D(0, 0, 5, 5);
		// Provjeravamo da li su jednaki
		System.out.println("c1 equals c2? " + c1.equals(c2));
		System.out.println("c1 equals r1? " + c1.equals(r1));

	}

}
