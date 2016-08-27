package Zadaci_26_08_2016;

//Klasa student koja nasljeduje klasu person
public class Student extends Person {
	public static final String FRESHMAN = "Freshman";
	public static final String SOPHOMORE = "Sophomore";
	public static final String JUNIOR = "Junior";
	public static final String SENIOR = "Senior";

	protected String status;

	// Konstruktor koji nasljedjuje data fieldove iz klase person
	public Student(String name) {
		super(name);
	}

	public Student(String name, String status) {
		super(name);
		this.status = status;
	}

	// Pretvaramo sve u string i ispisujemo
	@Override
	public String toString() {
		return "Name: " + getName() + " Class: " + this.getClass().getName();
	}
}
