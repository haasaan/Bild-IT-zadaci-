package Zadaci_15_08_2016;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese 0 za kamen 1 za papir i 2 za makaze
		System.out.println("Input 0 for rock,1 for paper or 2 for scissors");
		int player = input.nextInt();
		// Komp. nasumicno bira izmedju 0,1 i 2
		int num = (int) (Math.random() * 3);
		// Ako su i komp i igrac izabrali 0 1 ili 2 onda je nerijeseno
		if ((player == 0) && (num == 0) || (player == 1) && (num == 1) || (player == 2) && (num == 2)) {
			System.out.println("It is a draw");
			// Uslov ako je igrac izabrao 0 a komp 1 ili igrac izabrao 1 a komp
			// 2 ili igrac izabrao 2 a komp 0 igrac gubi
		} else if ((player == 0) && (num == 1) || (player == 1) && (num == 2) || (player == 2) && (num == 0)) {
			System.out.println("You lose. Computer wins");
			// Ako je igrac izabrao 2 a komp 1 ili igrac 1 a komp 0 ili igrac 0
			// a komp 2 onda igrac pobjedjuje
		} else if ((player == 2) && (num == 1) || (player == 1) && (num == 0) || (player == 0) && (num == 2)) {
			System.out.println("You win!!");
		}
		// Zatvaramo unos
		input.close();
	}

}
