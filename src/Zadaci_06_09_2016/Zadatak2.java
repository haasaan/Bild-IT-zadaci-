package Zadaci_06_09_2016;

import java.util.Scanner;

public class Zadatak2 {
	// Metoda koja pronalazi najveci zajednicki djelilac za dva broja
	private static int gcd(int n1, int n2) {
		// Ako je n1 podjeljeno sa n2 jednako 0 vracamo n2
		if (n1 % n2 == 0)
			return n2;
		// Ako je drugacije najveci djelilac je n2 i n1 podjeljeno sa n2
		else
			return gcd(n2, n1 % n2);
	}

	public static void main(String[] args) {
		// Trazimo od korisnika da unese dva broja
		System.out.println("Unesite dva broja : ");
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		// Pozivamo metodu koja pronalazi najveci djelilac i ispisujemo ga za
		// unijeta dva broja
		System.out.println("Najveci zajednicki djelilac je " + gcd(n1, n2));
		input.close();

	}

}
