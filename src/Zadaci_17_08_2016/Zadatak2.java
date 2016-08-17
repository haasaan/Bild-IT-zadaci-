package Zadaci_17_08_2016;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese karakter
		System.out.println("Unesite neki karakter");
		char c = input.next().charAt(0);
		// Pretvaramo karakter u broj
		int num = c;
		// Ispisujemo unicod unesenog karaktera
		System.out.println("Unicode unesenog karaktera je " + num);
		// Zatvaramo unos
		input.close();

	}

}
