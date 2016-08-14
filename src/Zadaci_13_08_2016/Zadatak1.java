package Zadaci_13_08_2016;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Unosimo racun
		System.out.println("Unesite  racun");
		double racun = input.nextDouble();
		// Unosimo napojnicu u procentima
		System.out.println("Unesite procenat za napojnicu");
		double procenatNapojnice = input.nextDouble();
		// Racunamo ukupnu najpojnicu talko sto mnozmo racun i procenat te onda
		// podjelimo sa 100
		double napojnica = (racun * procenatNapojnice) / 100;
		// Racunamo ukupan racun tako sto saberemo racun i ukupnu napojnicu
		double ukupanRacun = racun + napojnica;
		// Printamo ukupan racun i napojnicu
		System.out.println("Ukupan racun je bio " + ukupanRacun + " a napojnica " + napojnica);
		// Zatvaramo unos
		input.close();

	}

}
