package Zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// Trazimo od korisnika da unese neki string
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki string: ");
		String str = input.nextLine();
		// Koristimo for petlju prokazimo kroz string zatim stavljamo da nase i
		// preskace svaki 2 karatker i onda printamo karaktere na indexu i
		for (int i = 0; i < str.length(); i = i + 2) {
			System.out.print(str.charAt(i));

		}
		input.close();

	}

}
