package Zadaci_26_08_2016;

public class Triangle extends GeometricObject {
	// Triprivate data fielda
	private double side1;
	private double side2;
	private double side3;

	// Kostruktor kome prosljedjujemo nasa privatna data fielda te bacamo
	// exception illegal triangle
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		isValidTriangle();
	}

	// No args konstruktor u kome nasim fieldovima dodjeljujemo vredosniti
	public Triangle() {
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}

	// Overridana metda getArea preko koje racunamo povrsinu
	@Override
	public double getArea() {

		double s = (side1 + side2 + side3) / 2.0;
		return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
	}

	// Metoda preko koje racunamo perimetar trokuta
	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	// Pretvaramosve u string i ispisujemo preko metode toStrinf
	@Override
	public String toString() {
		return "Triangle{" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + '}';
	}

	// Boolean metoda koja provjerava da li je trokout
	public static boolean isTriangle(double side1, double side2, double side3) {

		return ((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1));

	}

	// Getter za stranicu 1
	public double getSide1() {
		return side1;
	}

	// Getter sa exceptionom i metodom is valid triangle
	public void setSide1(double side1) throws IllegalTriangleException {
		this.side1 = side1;
		isValidTriangle();
	}

	// Dva gettera za stranicu 2 drugi ima exception i provjerava da li je
	// validan trokut
	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) throws IllegalTriangleException {
		this.side2 = side2;
		isValidTriangle();
	}

	// I dva gettera za stranicu 3 te drugi baca exception i provjerava da li je
	// trokut validan
	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) throws IllegalTriangleException {
		this.side3 = side3;
		isValidTriangle();
	}

	// Metoda koja provjerava da li je trokut validan koja baca exception i
	// porsljedjuje exception na side1 2 i 3
	private void isValidTriangle() throws IllegalTriangleException {
		if (!isTriangle(side1, side2, side3)) {
			throw new IllegalTriangleException(side1, side2, side3);
		}
	}

	// Preko klase koja baca exception za nas trokut prosljedjujemo exception na
	// nase stranice
	public class IllegalTriangleException extends IllegalArgumentException {

		private double s1;
		private double s2;
		private double s3;

		public IllegalTriangleException(double s1, double s2, double s3) {
			super("Not a real triangle:" + " side1 = " + s1 + " side2 = " + s2 + " side3 = " + s3);
			this.s1 = s1;
			this.s2 = s2;
			this.s3 = s3;
		}

		// Getteri za stranice
		public double getS1() {
			return s1;
		}

		public double getS2() {
			return s2;
		}

		public double getS3() {
			return s3;
		}

	}
}
