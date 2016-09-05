package Zadaci_05_09_2016;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// Trazimo od korisnika da unese decimalni broj
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite decimalni broj: ");
		String s = input.next();
		// Ispisujemo razlomak tog broja pozivajuci klasu BigRational
		System.out.println("Razlomak unijetog broja je  " + new BigRational(s));
		// Zatvaramo unos
		input.close();
	}

}
