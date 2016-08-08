package Zadaci_08_08_2016;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite mjesec");
		// Unosimo mjesec
		int mjesec = input.nextInt();
		System.out.println("Unesite godinu ");
		// Unosimo godinu
		int godina = input.nextInt();
		// Postavljamo uslov ako je mjesec jednak unosu 1 program ispisuje
		// Januar i godinu i koliko ima dana
		if (mjesec == 1) {
			System.out.println("Januar " + godina + " ima 31 dan");
			// Ovdje smo postavili uslov prvo ako je prestpuna godina onda
			// februar ima 29 dana ako nije prestupna godina program prelazi u
			// drugi uslov i ispisuje nam da februar ima 28 dana jer nije
			// prestupna godina
		} else if ((godina % 4 == 0) && (mjesec == 2)) {
			System.out.println("Februar " + godina + " ima 29 dana");
		} else if (mjesec == 2) {
			System.out.println("Februar " + godina + " ima 28 dana ");
		}
		// Ako je unos jednak 3 program ispusuje Mart i godinu te dane
		if (mjesec == 3) {
			System.out.println("Mart " + godina + " ima 31 dan");
			// Ako je unos 4 program ispusje April godinz i dane
		} else if (mjesec == 4) {
			System.out.println("April " + godina + " ima 30 dana");
			// Ako je unos 5 program ispusuje Maj godinu i dane
		} else if (mjesec == 5) {
			System.out.println("Maj " + godina + " ima 31 dan");
			// Ako je unos 6 program ispisuje Juni godinu i dane
		} else if (mjesec == 6) {
			System.out.println("Juni " + godina + " ima 30 dana");
			// Ako je unos 7 program ispisuje Juli godinu i dane
		} else if (mjesec == 7) {
			System.out.println("Juli " + godina + " ima 31 dan");
			// Ako je unos 8 program ispisuje Avgust godinu i dane
		} else if (mjesec == 8) {
			System.out.println("Avgust " + godina + " ima 31 dan");
			// Ako je unos 9 program ispisuje Septembar godinu i dane
		} else if (mjesec == 9) {
			System.out.println("Septembar " + godina + " ima 30 dana");
			// Ako je unos 10 program ispisuje Oktobar godinu i dane
		} else if (mjesec == 10) {
			System.out.println("Oktobar " + godina + " ima 31 dan");
			// Ako je unos 11 program ispisuje Novembar godinu i dane
		} else if (mjesec == 11) {
			System.out.println("Novembar " + godina + " ima 30 dana");
			// Ako je unos 12 program ispisuje Decembar godinu i dane
		} else if (mjesec == 12) {
			System.out.println("Decembar " + godina + " ima 31 dan");
		}
		input.close();
	}

}
