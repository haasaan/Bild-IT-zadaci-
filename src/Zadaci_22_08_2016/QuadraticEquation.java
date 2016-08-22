package Zadaci_22_08_2016;

public class QuadraticEquation {
	// Pravimo 3 private date fielda a b i c
	private double a;
	private double b;
	private double c;

	// Pravimo konstruktor kome prosljedjujemo a b c kao argumente
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Zatim pravimo sve gettere i settere kako bi napravili da nasi
	// datafiledovi vise nisu privatni te preko njih cemo ih implementirati u
	// test klasi i dati im odredjenu vrijednosti
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	// Racunamo nasu diskriminantu preko ove metode
	public double getDiscriminant() {
		return b * b - 4.0 * a * c;
	}

	// Pravimo metodu root koja racuna korijen
	public double getRoot1() {
		return (-b + Math.pow(getDiscriminant(), 0.5)) / (2.0 * a);
	}

	// Metoda racuna drugi korijen
	public double getRoot2() {
		return (-b - Math.pow(getDiscriminant(), 0.5)) / (2.0 * a);
	}

}
