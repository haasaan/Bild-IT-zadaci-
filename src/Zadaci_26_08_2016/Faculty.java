package Zadaci_26_08_2016;

//Klasa faculty koja nasljedjuje klasu employee
public class Faculty extends Employee {
	public static String LECTURER = "Lecturer";
	public static String ASSISTANT_PROFESSOR = "Assistant Professor";
	public static String ASSOCIATE_PROFESSOR = "Associate Professor";
	public static String PROFESSOR = "Professor";

	protected String officeHours;
	protected String rank;

	// Konstruktor kome prosljedjujemo ime
	public Faculty(String name) {
		this(name, "9-5PM", "Employee");
	}

	// Konstruktor koji nasljuedjuje data fieldove od super klase
	public Faculty(String name, String officeHours, String rank) {
		super(name);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	// Vracamo sate
	public String getOfficeHours() {
		return officeHours;
	}

	// Postavljamo sate
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	// Vracamo rank
	public String getRank() {
		return rank;
	}

	// Postavljamo rank
	public void setRank(String rank) {
		this.rank = rank;
	}

	// Pretvaramo sve u string i ispisujemo
	@Override
	public String toString() {
		return "Name: " + getName() + " Class: " + this.getClass().getName();
	}

}
