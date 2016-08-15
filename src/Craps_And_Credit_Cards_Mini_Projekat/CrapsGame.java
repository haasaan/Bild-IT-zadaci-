package Craps_And_Credit_Cards_Mini_Projekat;

import java.util.Scanner;

public class CrapsGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da pritisne bilo koje dugme da pokrene kocke
		System.out.println("Enter any key to roll dice.");
		input.next();
		// Pravimo dvije kocke koje biraju nasumicne brojeve od 1 do 6
		int d1 = (int) (Math.random() * 6 + 1);
		int d2 = (int) (Math.random() * 6 + 1);
		int roll = d1 + d2;
		int roll2 = 0;
		boolean craps = false;
		System.out.println("You rolled " + d1 + " + " + d2 + " = " + roll);
		// Ako kocke izbace 7 ili 11 prvi krug automatski pobjedjujete
		if (roll == 7 || roll == 11) {
			System.out.println("You win!");
		}
		// Ako kocke izbace 2 3 i 12 prvi krug automatski gubite
		else if (roll == 2 || roll == 3 || roll == 12) {
			System.out.println("Sorry, you lose.");
		}
		// Ako kocke izbace sve ostale brojeve osim 7,11,12,2,3 dobijamo pojene
		else if (roll != roll2) {
			System.out.println("Your point is " + roll);
			// Second roll down here.
			do {
				d1 = (int) (Math.random() * 6 + 1);
				d2 = (int) (Math.random() * 6 + 1);
				roll2 = d1 + d2;
				// Ako smo dobili "ostale brojeve nastavljamo dalje i ako prva
				// dva kruga dobijamo isti broj pobjedjuemo "
				if (roll == roll2) {
					System.out.println("You win!");
					craps = true;
				}
				// Ako dobijemo 7 u ponovnom bacanju gubimo
				else if (roll2 == 7) {
					System.out.println("Sorry, you lose.");
					craps = true;
				}
				// Ako prva dva uslova nisu ispunjena ponovo dobijamo "ostale
				// brojeve "te ponovo vrtimo kocku
				else if (roll2 != roll) {
					System.out.println("You rolled " + d1 + " + " + d2 + " = " + roll2);
					craps = false;

				}

			} while (craps != true);

		}
		input.close();
	}

}
