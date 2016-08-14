package Zadaci_13_08_2016;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese tezinu i cijenu prvog proizvoda
		System.out.println("Unesite tezinu i cijenu prvog pakovanja");
		double tezina = input.nextDouble();
		double cijena = input.nextDouble();
		// Trazimo odkorisnika daunese tezinu i cijenu drugog proizvoda
		System.out.println("Unesite tezinu i cijenu drugog proizvoda");
		double tezina2 = input.nextDouble();
		double cijena2 = input.nextDouble();
		// Pravimo varijablu najboljaCijena1 i preko nje racunamo povoljnost
		// prvog proizvoda
		double najboljCijena1 = tezina / cijena;
		// Pravimo varijablu najboljaCijena2 i preko nje racunamo povoljnost
		// drugog
		// prozvoda
		double najboljaCijena2 = tezina2 / cijena2;
		// Uslov if ako je prvi proizvod povoljniji odd drugog program ispisuje
		// da je cijena prvog proizvoda povoljnija
		if (najboljCijena1 > najboljaCijena2) {
			System.out.println("Prvi proizvod ima bolju cijenu");
			// Ako nije program ispisuje da je cijena drugog proizvoda
			// povoljnija
		} else {
			System.out.println("Drugi proizvod ima bolju cijenu");
		}
		// Zatvaramo unos
		input.close();

	}

}
