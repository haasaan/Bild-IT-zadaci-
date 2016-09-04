package Zadaci_03_09_2016;

import Zadaci_26_08_2016.GeometricObject;

public class Rectangle extends GeometricObject {
	// Dva privatnda data fielda
	private double width;
	private double height;

	// Nor arg konstruktor
	public Rectangle() {
	}

	// Konstruktor kome prosljedjujemo data fielodve
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// Konstruktor kome prosljedujemo datafieldove i color i fiiled
	public Rectangle(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}

	// Vracamosirinu
	public double getWidth() {
		return width;
	}

	// Postavljamo novi sirinu
	public void setWidth(double width) {
		this.width = width;
	}

	// Vracamo visinu
	public double getHeight() {
		return height;
	}

	// Postavljamo novu visinu
	public void setHeight(double height) {
		this.height = height;
	}

	// Racunamo povrsinu
	public double getArea() {
		return width * height;
	}

	// Racunamo perimetar
	public double getPerimeter() {
		return 2 * (width + height);
	}

	@Override
	public boolean equals(Object o) {
		return o instanceof Rectangle && getArea() == ((Rectangle) o).getArea();
	}
}
