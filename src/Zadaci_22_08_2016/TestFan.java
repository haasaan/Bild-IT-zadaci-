package Zadaci_22_08_2016;

public class TestFan {

	public static void main(String[] args) {
		// Pravimo novi objekat fan1
		Fan fan1 = new Fan();
		// Implementiramo sve one metode tj gettere i settere koje smo napravili
		// u fan klasi
		fan1.setSpeed(Fan.FAST);
		fan1.setOn(true);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		// Pravimo drugi objekat fan2
		Fan fan2 = new Fan();
		// Ponovo implementiramo sve one metode iz fan klase
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		// Ispisujemo fan 1 i fan 2 pomocu metode to string
		System.out.println("Fan #1: " + fan1.toString());
		System.out.println("Fan #2: " + fan2.toString());

	}

}
