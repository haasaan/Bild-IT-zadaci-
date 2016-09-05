package Zadaci_05_09_2016;

import java.text.DecimalFormat;

public class Complex {
	// Pravimo dva privatna data fielda a i b
	private double a;
	private double b;

	// Konstrukor kome prosljedujemo oba data fielda kao argumente
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	// Konstruktor koji prima samo data field a kao argument
	public Complex(double a) {
		this(a, 0);
	}

	// No args konstruktor
	public Complex() {
		this(0);
	}

	// Metoda koja dodaje komplekse na brojeve tj spaja brojeve
	public Complex add(Complex complex) {
		// a + bi + c + di = (a + c) + (b + d)i
		return new Complex((a + complex.a), (b + complex.b));
	}

	// Metoda koja oduzima komplexe
	public Complex subtract(Complex complex) {
		// a + bi - (c + di) = (a - c) + (b - d)i

		return new Complex((a - complex.a), (b - complex.b));

	}

	// Mnozenje komplexnih brojeva
	public Complex multiply(Complex complex) {
		// (a + bi)*(c + di) = (ac - bd) + (bc + ad)i

		return new Complex((a * complex.a - b * complex.b), (b * complex.a + a * complex.b));

	}

	// Dijeljenje kompleksnijh brojeva
	public Complex divide(Complex complex) {
		// (a+bi)/(c+di)=(ac+bd)/(c^2 +d^2)+(bc-ad)i/(c^2 +d^2)

		return new Complex((a * complex.a + b * complex.b) / ((Math.pow(complex.a, 2) + Math.pow(complex.b, 2))),
				(b * complex.a - a * complex.b) / ((Math.pow(complex.a, 2) + Math.pow(complex.b, 2))));
	}

	// Korijen kompleksnih brojeva
	public double abs() {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

	// Vracamo broj a
	public double getRealPart() {
		return a;
	}

	// Vracamo broj b
	public double getImaginaryPart() {
		return b;
	}

	// Overjadamo sve u string
	@Override
	public String toString() {

		if (b == 0)
			return a + "";

		DecimalFormat decimal = new DecimalFormat("#.###");
		return "(" + decimal.format(a) + " + " + decimal.format(b) + "i)";

	}

}
