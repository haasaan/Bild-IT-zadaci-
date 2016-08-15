package Zadaci_15_08_2016;

public class Zadatak1 {

	public static void main(String[] args) {
		//Pravimo nasumicno biranje brojeva od 1 do 12 
		int num = (int) (Math.random() * 12 + 1);
		//Ako je broj 1 ispisuje da je to mjesec januar
		//Tako radi za svih 12 mjeseci koji broj izabere ispise ime mjeseca za koji je broj izabrao tj za svih 12 mjeseci 
		if (num == 1) {
			System.out.println("Januar");
		} else if (num == 2) {
			System.out.println("Februar");
		} else if (num == 3) {
			System.out.println("Mart");

		} else if (num == 4) {
			System.out.println("April");

		} else if (num == 5) {
			System.out.println("Maj");

		} else if (num == 6) {
			System.out.println("Juni");

		} else if (num == 7) {
			System.out.println("Juli");

		} else if (num == 8) {
			System.out.println("August");

		} else if (num == 9) {
			System.out.println("Septembar");

		} else if (num == 10) {
			System.out.println("Oktobar");

		} else if (num == 11) {
			System.out.println("Novembar");

		} else if (num == 12) {
			System.out.println("Decembar");

		}

	}

}
