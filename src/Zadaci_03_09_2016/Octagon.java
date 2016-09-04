package Zadaci_03_09_2016;

import Zadaci_26_08_2016.GeometricObject;

public class Octagon extends GeometricObject implements Cloneable {
	// Pravimo jednu stranu oktagona jer svaka tj svih 8 stranica su jednake
	double side;

	// No args konstruktor
	public Octagon() {
		this(5);
	}

	// Konstruktor kome prosljedjuemo stranicu
	public Octagon(double side) {
		this.side = side;
	}

	// Racunamo povrsinu
	@Override
	public double getArea() {
		return (2.0 + 4.0 / Math.sqrt(2) * side * side);
	}

	// Racunamo perimetar
	@Override
	public double getPerimeter() {
		return side * 8;
	}

	// Pokusajemo klonirati objekat
	public Object clone() {
		Object o = null;
		// Try bloku pokusaemo napraviti drugi objekat kao ovaj ako ne uspije
		// catch blok hvata exception
		try {
			o = super.clone();
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		return o;
	}

	// Poredimo dva objekta
	@Override
	public boolean equals(Object o) {
		return o instanceof Octagon && getArea() == ((Octagon) o).getArea();
	}
}
