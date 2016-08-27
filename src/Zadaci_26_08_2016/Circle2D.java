package Zadaci_26_08_2016;

import Zadaci_23_08_2016.MyPoint;
import javafx.scene.shape.Circle;

//Klasa Circle nasljeduje klasu geometricobjects
public class Circle2D extends GeometricObject {
	private double x;
	private double y;
	private double radius;

	// Konstruktor za klasu Circe koji kao argument ima klasu Circle
	public Circle2D(Circle c) {
		this(c.getCenterX(), c.getCenterY(), c.getRadius());
	}

	// Konstruktor kome prosljedujemo kao arguemnte data fieldove
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	// Defaultni konstruktor u kojem dodjeljujemo vridjenosti nasim fieldovima
	public Circle2D() {
		this(0, 0, 1);
	}

	// Vracamo X
	public double getX() {
		return x;
	}

	// Postavljamo X
	public void setX(double x) {
		this.x = x;
	}

	// Vracamo Y
	public double getY() {
		return y;
	}

	// Postavljamo novi Y
	public void setY(double y) {
		this.y = y;
	}

	// Vracamo radius
	public double getRadius() {
		return radius;
	}

	// Postavljamo novi radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Racunamo povrsinu
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// Racunamo perimetar
	@Override
	public double getPerimeter() {

		return 2 * radius * Math.PI;

	}

	// Boolean metoda koja provjerava sta sadrzi nas krug
	public boolean contains(Circle2D circle2D) {
		double distance = getPoint().distance(circle2D.x, circle2D.y);

		if (distance <= Math.abs(this.radius - circle2D.radius)) {
			return true;
		} else {
			return false;
		}
	}

	// Boolean metoda koja provjerava da li krug jedna sadrzi krug 2
	public static boolean c1ContainsC2(Circle c1, Circle c2) {
		Circle2D cir1 = new Circle2D(c1);
		Circle2D cir2 = new Circle2D(c2);

		return cir1.contains(cir2);
	}

	// Boolean metoda koja provjerava da li je c1 veci od c2
	public static boolean c1OverlapsC2(Circle c1, Circle c2) {
		Circle2D cir1 = new Circle2D(c1);
		Circle2D cir2 = new Circle2D(c2);

		if (cir1.contains(cir2) || cir2.contains(cir1))
			return false;

		return cir1.overlaps(cir2);
	}

	public boolean overlaps(Circle2D circle2D) {
		double distance = getPoint().distance(circle2D.x, circle2D.y);

		if (distance <= this.radius + circle2D.radius)
			return true;
		else
			return false;

	}

	// Vracamo noe tacke
	private MyPoint getPoint() {
		return new MyPoint(this.x, this.y);
	}

	// Pretvaramo sve u string i ipsusujemo
	@Override
	public String toString() {
		return "Circle2D{" + "x=" + x + ", y=" + y + ", radius=" + radius + '}';
	}

	public boolean contains(double x, double y) {

		double distance = getPoint().distance(x, y);

		if (distance <= radius)
			return true;
		else
			return false;
	}
}
