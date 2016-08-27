package Zadaci_26_08_2016;

import java.util.Date;

//Klasa radnik koja nasljeduje klasu person
public class Employee extends Person {
	// Novi data fieldovi
	protected double salary;
	protected String office;
	protected Date dateHired;

	// Konstruktor koji prima ime kao argument
	public Employee(String name) {
		this(name, 0, "none", new Date());
	}

	// Konstruktor koji nasljujedjuje data fieldove iz super klase i dodaje na
	// to fieldove iz ove klase
	public Employee(String name, double salary, String office, Date dateHired) {
		super(name);
		this.salary = salary;
		this.office = office;
		this.dateHired = dateHired;
	}

	// Vracamo salary
	public double getSalary() {
		return salary;
	}

	// Postavljamo salary
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Vracamo office
	public String getOffice() {
		return office;
	}

	// Postavljamo office
	public void setOffice(String office) {
		this.office = office;
	}

	// Vracamo datum kada je zaposlen
	public Date getDateHired() {
		return dateHired;
	}

	// Postavljamo datum zaposljenja
	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	// Pretvaramo sve u string
	@Override
	public String toString() {
		return "Name: " + getName() + " Class: " + this.getClass().getName();
	}
}
