package Zadaci_02_09_2016;

import Zadaci_26_08_2016.GeometricObject;

public class Square extends GeometricObject implements Colorable {
	private double x;
	private double y;
	private double side;

	Square() {
		this(0, 0, 10);
	}

	// Konstruktor sa argumentima
	Square(double x, double y, double side) {
		this.x = x;
		this.y = y;
		this.side = side;
	}

	// Racunamo povrsinu
	@Override
	public double getArea() {
		return side * side;
	}

	// Racunamo perimatar
	@Override
	public double getPerimeter() {
		return side * 4;
	}

	// Kako cemo obojiti
	@Override
	public String howToColor() {
		return "Color all four sides.";
	}

	// Vracamo x
	public double getX() {
		return x;
	}

	// Postavljamo x
	public void setX(double x) {
		this.x = x;
	}

	// Vracamo y
	public double getY() {
		return y;
	}

	// Postavljamo y
	public void setY(double y) {
		this.y = y;
	}

	// Vracamo stranu
	public double getSide() {
		return side;
	}

	// Postavljamo stranu
	public void setSide(double side) {
		this.side = side;
	}
}

interface Colorable {

	String howToColor();
}
