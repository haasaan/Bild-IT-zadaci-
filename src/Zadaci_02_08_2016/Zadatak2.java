package Zadaci_02_08_2016;

import java.util.Scanner;

public class Zadatak2 {
	public static void Pitanja(int num) {
		// Ovdje smo napravili dva brojaca koji ce nam brojati tacne i netacne
		// odgovore.
		Scanner input = new Scanner(System.in);
		int counter1 = 0;
		int counter2 = 0;
		// Koristimo for petlju i metodu Math randomzbog toga sto nam trebaju
		// nasumicni brojavi od0 do 10 u ovom slucaju
		// Tako for petljom prolazimo kroz te brojeve.
		for (int i = 0; i < num; i++) {
			int num1 = (int) (Math.random() * 10);
			int num2 = (int) (Math.random() * 10);
			// Kada smo to zavrsili racunamo broj1 i broj 2
			// Trazimo od korisnika da nam unese svoj odgovor
			// Ako korisnik unese tacan odgovor na pitanje brojac 1 ce se
			// povecati i on ce racunati koliko ima tacnih odgovora
			// Ako odgovorimo netacno brojac 2 se povecava i racuna koliko ima
			// netacnih odgovora

			System.out.println("Koliko je " + num1 + " - " + num2 + " ?");
			int answer = input.nextInt();
			if (answer == num1 - num2) {
				counter1++;
			} else {
				counter2++;
			}
		}
		input.close();
		System.out.println("Broj tacnih odgovora je " + counter1);
		System.out.println("Broj netacnih odgovora je " + counter2);
	}

	public static void main(String[] args) {
		// U mainu samo trazimo od korisnika da unese na koliko pitanja zeli da
		// odgovori
		// Te takodjer pozivamo metodu Pitanja.
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj pitanja ");
		int pitanja = input.nextInt();
		Pitanja(pitanja);
		input.close();

	}

}
