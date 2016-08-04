package Zadaci_04_08_2016;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// Pravimo Scanner i trazimo od korisnika da nam unese neke cijele
		// brojeve
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijele brojeve: ");
		// Pravimo niz brojeva do 100 varijable prosjek za koju cemo izracunat
		// prosjek varijablu sum za koju cemo izracunat sumu jer bez nje ne
		// mozemo izracunat prosjek i varijable brojevi iznad prosjeka i brojevi
		// ispod prosjeka gdje cemo smjestat brojeve iznad prosjeka i brojeve
		// ispod prosjeka
		int[] array = new int[100];
		int prosjek = 0;
		int sum = 0;
		int brojeviIznadProsjeka = 0;
		int brojeviIspodProsjeka = 0;
		// Koristimo forpetlju da prodjemo kroz niz i da unesemo brojeve
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			// Zatim koristimo while petlju sve dok ne unesemo nulu program
			// trazi od nas da unosimo brojeve kad unesemo nulu program racuna
			// sumu prosjek brojeve iznad prosjeka te brojeve ispod prosjeka
			while (array[i] != 0) {
				sum += array[i];
				prosjek = sum / array[i];
				array[i] = input.nextInt();
				// Brojeve iznad prosjeka cemo dobiti tako sto im damo
				// vrijednost prosjeka i ako je nastavak brojeva veci od
				// prosjeka dodat cemo brojeve na brojeve iznad prosjeka
				brojeviIznadProsjeka = prosjek;
				if (prosjek <= brojeviIznadProsjeka) {
				}
				// Brojevi ispod prosjeka cemo dobiti tako sto u uslovstavimo
				// ako su brojevi manji od prosjeka sve te brojeve cemo dodati
				// na varijablu brojevi ispod prosjeka
				if (brojeviIspodProsjeka < prosjek) {
					brojeviIspodProsjeka++;
				}
			}
			// Printamo prosjek brojeve iznad prosjeka i brojeve ispod prosjeka
			System.out.println("Prosjek je: " + prosjek);
			System.out.println("Brojevi iznad prosjeka su: " + brojeviIznadProsjeka);
			System.out.println("Brojevi ispod prosjeka su: " + brojeviIspodProsjeka);

		}
		input.close();

	}

}
