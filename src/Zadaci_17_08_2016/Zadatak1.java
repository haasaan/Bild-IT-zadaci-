package Zadaci_17_08_2016;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese cijeli broj
		System.out.println("Unesite cijeli broj");
		int num = input.nextInt();
		// Pretvaramo broj u karakter
		char c = (char) num;
		// Ispisujemo karakter za uneseni broj
		System.out.println("Karakter unesenog ASCII broja je  " + c);
		// Zatvaramo unos
		input.close();

	}

}
