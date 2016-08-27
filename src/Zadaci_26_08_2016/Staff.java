package Zadaci_26_08_2016;

//Klasa staff koja nasljedjuje klasu emplyee
public class Staff extends Employee {
	protected String title;

	// Default konstruktor za ovu klasu kome prosledujemo ime
	public Staff(String name) {
		this(name, "none");

	}

	// Konstruktor koji nasljeduje fieldove od super klase
	public Staff(String name, String title) {
		super(name);
		this.title = title;
	}

	// Postavljamo title
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// Pertvaramo sve u string i ispusujemo
	@Override
	public String toString() {
		return "Name: " + getName() + " Class: " + this.getClass().getName();
	}
}
