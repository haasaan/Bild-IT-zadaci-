package Zadaci_11_08_2016;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese neodredjeni broj cijelih brojeva
		System.out.println("Unesite cijele brojeve: ");
		int broj = input.nextInt();
		// Pravimo varijable brojac,suma,prosjek,pozBrojevi,negBrojevi
		int brojac = 0;
		double suma = 0;
		double prosjek = 0;
		int pozBrojevi = 0;
		int negBrojevi = 0;
		// Koristimo while petlju dokle god je broj koji unosimmo razlicit od
		// nule unos se nastavlja kada unesemo 0 unos se prekida
		while (broj != 0) {
			// Onda racunamo sumu
			suma += broj;
			broj = input.nextInt();
			// Postavljamo uslov ako su brojevi koje unosimo manji od nule
			// dodajemo na varijablu negBrojevi jer nam ona sluzio kao brojac
			// negativnih brojeva
			if (broj < 0) {
				negBrojevi++;
				// Ako brojevi nisu manji od 0 dodajemo ih na varijablu
				// pozBrojevi koja nam sluzi kaobrojac pozitivnih brojeva
			} else {
				pozBrojevi++;
			}
			// Varijabla brojac nam sluzio da nam broji brojeve koje smo unijeli
			brojac++;

		}
		// Prosjek racunamo tako sto podjelimo sumu brojeva sa brojem brojeva
		// koji smo unijeli
		prosjek = suma / brojac;
		// Ispisujemo pozitivne i negativne brojeve, sumu i prosjek
		System.out.println("Pozitivnih brojeva je: " + pozBrojevi);
		System.out.println("Negativnih brojeva je: " + negBrojevi);
		System.out.println("Suma je " + suma);
		System.out.println("Prosjek je " + prosjek);
		// Zatvaramo unos
		input.close();

	}

}
