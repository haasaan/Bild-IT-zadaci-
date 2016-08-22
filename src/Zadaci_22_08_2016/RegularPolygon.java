package Zadaci_22_08_2016;

public class RegularPolygon {
	// Pravimo cetiri privatne date fieldove
	private int mNumberOfSides;
	private double mSideLength;
	private double mCenterX;
	private double mCenterY;

	// Zatim pravimo noArg konstruktor
	public RegularPolygon() {
		// Postavljamo da je broj stranica jendak 3 duzina stranica 1 te centar
		// x i y jednaki0
		mNumberOfSides = 3;
		mSideLength = 1;
		mCenterX = 0;
		mCenterY = 0;

	}

	// Pravimo konstruktor kojem prolsjedjujemo 2 argumenta
	public RegularPolygon(int numberOfSides, double sideLength) {
		this();
		mSideLength = sideLength;
		mNumberOfSides = numberOfSides;

	}

	// Sada konstruktor kome prosljedjujemo cetiri argumenta
	public RegularPolygon(int numberOfSides, double sideLength, double x, double y) {
		this(numberOfSides, sideLength);
		mCenterX = x;
		mCenterY = y;
	}

	// Dalje u klasi pravi metodetj gettere i settere za sve nase privatne date
	// fieldove i preko tih gettere i settera postavljamo default vrijednosti te
	// cemo kasne u test klasi moci da implementiramo i postavljamo nove
	// vrijednosti
	public int getNumberOfSides() {
		return mNumberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		mNumberOfSides = numberOfSides;
	}

	public double getSideLength() {
		return mSideLength;
	}

	public void setSideLength(double sideLength) {
		mSideLength = sideLength;
	}

	public double getCenterY() {
		return mCenterY;
	}

	public void setCenterY(double centerY) {
		mCenterY = centerY;
	}

	public double getCenterX() {
		return mCenterX;
	}

	public void setCenterX(double centerX) {
		mCenterX = centerX;
	}

	public double getPerimeter() {

		return mNumberOfSides * mSideLength;
	}

	public double getArea() {

		return (mNumberOfSides * mSideLength * mSideLength) / (4.0 * Math.tan(Math.PI / mNumberOfSides));
	}

}
