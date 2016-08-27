package Zadaci_26_08_2016;

// pravimoabstraktnu klasu geometricObject koja implementira gometrik object kao tip
public abstract class GeometricObject implements Comparable<GeometricObject> {
	// Tri privatna data fielda
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Defaultni konstruktor */
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/** Kostruktor kojim prosljedjjemo boju i da li je popunjen */
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Vracamo boju */
	public String getColor() {
		return color;
	}

	/** Postavljamo novu boju */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Vracamo da li je pounjen metodom koja je boolean tipa
	 */
	public boolean isFilled() {
		return filled;
	}

	/** Postavljamo kako cemo popuniti geometrik object */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Novi datum */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	/** Vracamo string ovog objekta */
	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	// Overridana metoda koja poredi dvije povrsine
	@Override
	public int compareTo(GeometricObject o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	// Metoda koja provjerava najveci geometric object
	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
		return (o1.compareTo(o2) >= 0) ? o1 : o2;
	}

	// Metoda koja racuna sumu povrsina
	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		for (GeometricObject o : a) {
			sum += o.getArea();
		}
		return sum;
	}

	/** Abstraktna metoda getArea */
	public abstract double getArea();

	/** Abstraknta metoda getPerimeter */
	public abstract double getPerimeter();
}
