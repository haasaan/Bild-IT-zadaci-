package Zadaci_08_08_2016;

import java.util.Scanner;

public class Zadatak5 {
	public static String Password(String password) {
		String result = "Password je validan";
		int lentgh = 0;
		int brojac = 0;
		for (int i = 0; i < password.length(); i++) {
			// Provjerajemo da li password sadrzi samo slova i brojeve
			if ((password.charAt(i) >= 47 && password.charAt(i) <= 58)
					|| (password.charAt(i) >= 64 && password.charAt(i) <= 91)
					|| (password.charAt(i) >= 97 && password.charAt(i) <= 122)) {
			} else {
				result = "Password sadrzi specijalne karaktere";
			}
			// Brojimo broj brojeva u nasem passwordu
			if ((password.charAt(i) > 47 && password.charAt(i) < 58)) {
				brojac++;
			}
			lentgh = (i + 1);
		}
		if (brojac < 2) {
			// Provjeravamo da li imaju 2 broja u passwordu
			result = "Nema dovoljno brojeva u passwordu";
		}
		// Provjeravamo da li je validna duzina passworda
		if (lentgh < 8) {
			result = "Password je kratak";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite password ");
		String pass = input.nextLine();
		System.out.println(Password(pass));
		input.close();

	}

}
