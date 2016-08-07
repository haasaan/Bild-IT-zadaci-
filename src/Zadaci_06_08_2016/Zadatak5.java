package Zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Uneste brzinu");
		// Unosimo brzinu
		double brzina = input.nextDouble();
		System.out.println("Unesite ubrzanje");
		// Unosimo ubrzanje
		double ubrzanje = input.nextDouble();
		// Koristimo varijablu duzinaPiste kao duzinu i stavljamo njenu vrednost
		// na 0
		double duzinaPiste = 0;
		// Racunamo duzinu piste
		duzinaPiste = (brzina * brzina) / (2 * ubrzanje);
		// Ispisujemo duzinu piste koja nam treba za unijetu brzinu i ubrzanje
		System.out.println(duzinaPiste);
		input.close();

	}

}
