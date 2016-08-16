package Zadaci_16_08_2016_;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese neki string
		System.out.println("Unesite string");
		String str = input.nextLine();
		// Ispisujemo duzinu stringa koristeci metodu .length
		System.out.println("Duzina stringa je " + str.length());
		// Ispisujemo prvo slovo stringa koristeci metodu charAt i odaberemo
		// koji cemo index stavimo da je to prvi index stringa te nam program
		// ispise prvo slovo naseg stringa
		System.out.println("Prvo slovo strina je " + str.charAt(0));
		// Zatvaramo unos
		input.close();

	}

}
