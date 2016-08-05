package Zadaci_05_08_2016;

import java.util.Scanner;

public class Zadatak5 {
	public static int countLetters(String s) {
		// U ovoj metodu samo vracamo duzimu stringa
		return s.length();
	}

	public static void main(String[] args) {
		// Trazimo od korisnika da unese svoj string te printamo string uz
		// metodu koja broji slova
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string ");
		String s = input.nextLine();
		System.out.println("Ovaj string ima " + countLetters(s) + " slova");

		input.close();
	}

}
