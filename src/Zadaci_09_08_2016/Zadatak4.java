package Zadaci_09_08_2016;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese neke cijele brojeve
		System.out.println("Unesite cijele brojeve ");
		int broj = input.nextInt();
		// Pravimo varijablu najveciBroj i postavljamo je na 0 tj default
		int najveciBroj = 0;
		// Takodje pravimo varijablu brojac i postavljamo na default
		int brojac = 0;
		// Koristimo while petlju sve dok su nasi brojevi razlicti od nule
		// program nam dozvoljava da unosimo brojeve kada unesemo 0 program
		// broji sve projeve pronalazi najaveci i koliko se puta ponovio
		while (broj != 0) {
			broj = input.nextInt();
			// Koristimo uslov ako je nas najveci broj manji od brojakoji
			// unesemo dodjeljujemo nasem najvecem broju njegovu vrojednost a
			// brojac ostavljamo i dalje default
			if (najveciBroj < broj) {
				najveciBroj = broj;
				brojac = 0;
			}
			// Koristimo uslov ako je nas najveci broj jednak broju koji unesemo
			// povecavamo brojac i tako dobijamo koliko puta se ponovio nas
			// najveci broj
			if (najveciBroj == broj) {
				brojac++;
			}
		}
		// Ispisujemo nas najveci broj i koliko se puta ponovio
		System.out.println("Najveci broj je " + najveciBroj + " i ponavlja se " + brojac);
		input.close();

	}

}
