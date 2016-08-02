package Zadaci_02_08_2016;

import java.util.Scanner;

public class Zadatak5 {
	public static void BacanjeNovcica(int n) {
		// Napravili smo dvije varijable pismo i glava i njih cemo koristiti da
		// nam broje
		// koliko puta je novcic spao na pismo koliko na glavu
		int pismo = 0;
		int glava = 0;
		// Korsitimo for petlju da prolazimo kroz brojeve
		// Takodjer korsitimo math random*2 jer nam trebaju ili pismo ili glava
		// zbog toga idemo puta 2
		for (int i = 0; i < n; i++) {
			int BacanjeNovcica = (int) (Math.random() * 2);
			// Postavili smo uslov ako je u ovom slucaju bacanje novcica jednako
			// 0 dodajemo na pismo
			// Ako je obrnuto dodajemo na glavu tako cemo da znamo koliko je
			// puta nasumicno novcic pao na pismo a kolko na glavu
			if (BacanjeNovcica == 0) {
				pismo++;
			} else {
				glava++;
			}
		}
		System.out.println("Novcic je " + pismo + " puta pao na pismo " + " i " + glava + " puta pao na glavu");
	}

	public static void main(String[] args) {
		// Ovdje koristimo Scanner da unesemo koliko puta zelimo da se novcic
		// baci
		// Takodjer pozivamo metodu u kojoj smo napravili koliko puta ce otic na
		// pismo koliko na glavu.
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite koliko puta zelite da se novcic baci ");
		int broj = input.nextInt();
		BacanjeNovcica(broj);
		input.close();

	}

}
