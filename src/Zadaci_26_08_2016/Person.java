package Zadaci_26_08_2016;

public class Person {
	// Pravimo 4 nova zasticena data fielda
	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String email;

	// Konstruktor kome prosljedujemo samo ime
	public Person(String name) {
		this.name = name;
	}

	// Vracamo ime
	public String getName() {
		return name;
	}

	// Postavljamo novo ime
	public void setName(String name) {
		this.name = name;
	}

	// Vracamo adressu
	public String getAddress() {
		return address;
	}

	// Postavljamo novu adresu
	public void setAddress(String address) {
		this.address = address;
	}

	// Vracamo broj telefona
	public String getPhoneNumber() {
		return phoneNumber;
	}

	// Postavljamonobi broj telefona
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// Vracamo e mail
	public String getEmail() {
		return email;
	}

	// Postavljamo novi e mail
	public void setEmail(String email) {
		this.email = email;
	}

	// Sve to ispisujemo kao string
	@Override
	public String toString() {
		return "Name: " + getName() + " Class: " + this.getClass().getName();
	}
}
