package Zadaci_01_08_2016;

import java.util.Scanner;

public class Zadatak2 {
	public static void main(String[] args) {
		// Ovdje unosimo nas string

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite string ");

		String str = input.nextLine().toUpperCase();
		input.close();

		// Sada cemo napraviti samoglasnik i suglasnik da ih mozemo brojati

		int samoglasnik = 0;
		int suglasnik = 0;

		// Sada cemo da provjerimo da li je slovo samoglasnik ili suglasnik

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				if ((str.charAt(i) == 'A') || (str.charAt(i) == 'E') || (str.charAt(i) == 'I') || (str.charAt(i) == 'O')
						|| (str.charAt(i) == 'U')) {
					samoglasnik++;

				} else {
					suglasnik++;
				}
			}

		}
		System.out.println(
				"U vasem stringu imate " + samoglasnik + " samoglasnika " + " i " + suglasnik + " suglasnika ");
	}

}
