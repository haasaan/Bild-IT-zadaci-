package Zadaci_10_08_2016;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Unosimo prvi string
		System.out.println("Unesite prvi string: ");
		String s1 = input.nextLine();
		// Unosimo drugi string
		System.out.println("Unesite drugi string: ");
		String s2 = input.nextLine();
		// Postavljamo uslov ako string jedan sadrzi string dva program ispisuje
		// da je string dva substring stringa jedan ako je drugacije program nam
		// ispisuje poruku da string koji smo unijeli nije substring prvog
		// stringa
		if (s1.contains(s2)) {
			System.out.println(s2 + " je substring stringa " + s1);
		} else {
			System.out.println("String koji ste unijeli nije substring stringa " + s1);
		}
		input.close();
	}
}
