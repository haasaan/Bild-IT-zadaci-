package Zadaci_23_08_2016;

public class MyPoint {
	// Dva private data fielda
	public double x;
	public double y;

	// Konstruktorkome sprosljedjuemo nase data fieldove kao argumente
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// No arg konstruktor
	public MyPoint() {
		this(0, 0);
	}

	// Metoda preko koje dobijamo x
	public double x() {
		return x;
	}

	// Setter za data field x
	public void setX(double x) {
		this.x = x;
	}

	// Metoda preko koje dobijamo y
	public double y() {
		return y;
	}

	// Setter za data field y
	public void setY(double y) {
		this.y = y;
	}

	// Metoda preko koje racunamo distancu izmedju x i y
	public double distance(double x, double y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}

	public double distance(MyPoint point) {

		return distance(point.x, point.y);
	}

	// Metoda preko koje racunamo centar tj sredisnju tacku izmedju x i y
	public MyPoint getCenterPoint(MyPoint p) {

		return new MyPoint((p.x + this.x) / 2, (p.y + this.y) / 2);
	}

	public static MyPoint getCenterPoint(double x1, double y1, double x2, double y2) {
		return new MyPoint((x1 + x2) / 2, (y1 + y2) / 2);
	}

	/**
	 * Vracamo true ako je tacka na lijevoj strani diretke linije p0 i p1
	 * 
	 */
	public boolean leftOfTheLine(MyPoint p0, MyPoint p1) {

		return leftOfTheLine(p0.x, p0.y, p1.x, p1.y, x, y);
	}

	/**
	 * Vracamo true ako je tacka na istoj liniji izmedju p0 to p1
	 */
	public boolean onTheSameLine(MyPoint p0, MyPoint p1) {

		return onTheSameLine(p0.x, p0.y, p1.x, p1.y, x, y);

	}

	/**
	 * Vracamo true ako je tacka na desnoj strani direktne linije izedju p0 i p1
	 */
	public boolean rightOfTheLine(MyPoint p0, MyPoint p1) {

		return rightOfTheLine(p0.x, p0.y, p1.x, p1.y, x, y);

	}

	/**
	 * Vracamo true ako je tacka na istom segmentu izmedju p0 i p1
	 */
	public boolean onTheLineSegment(MyPoint p0, MyPoint p1) {

		return onTheLineSegment(p0.x, p0.y, p1.x, p1.y, x, y);

	}

	/**
	 * Vracamo true ako su tacke (x2, y2) na lijevoj strani direktne linije
	 * izmedju (x0, y0) to (x1, y1)
	 */
	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {

		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0;
	}

	/**
	 * Vracamo true ako su tacke (x2, y2)na istoj liniji izmedju (x0, y0) to
	 * (x1, y1)
	 */
	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {

		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
	}

	/**
	 * Vracamo true ako su tacke (x2, y2) na istom segmentu od (x0, y0) do (x1,
	 * y1)
	 */
	public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {

		double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

		return position <= 0.0000000001 && ((x0 <= x2 && x2 <= x1) || (x0 >= x2 && x2 >= x1));
	}

	/**
	 * Vracamo true ako su tacke (x2, y2) na desnoj strani direknte linije
	 * izmedju (x0, y0) to (x1, y1)
	 */
	public static boolean rightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {

		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) < 0;
	}

	// Printamo sve kao string
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
