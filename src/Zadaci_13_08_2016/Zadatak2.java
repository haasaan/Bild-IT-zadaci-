package Zadaci_13_08_2016;

import java.util.Scanner;

public class Zadatak2 {
	// Pravimo metodu koja prima jedan argumet i ona ce nam provjeravati uneseni
	// broj te ga ispisati
	// unazad
	public static void reverse(int number) {
		// Pravimo varijablu num
		int num;
		// Koristimo while petlju
		while (number != 0) {
			// varijabla num je jednaka zadnjem broju naseg unesenog broja
			num = number % 10;
			// Printamo taj zadnji broj
			System.out.print(num);
			// Dijelimo broj koji je ostao od kako smo odbili zadnji broj naseg
			// broja i dodjelili ga varijabli numi tako se petlja vrti sve dok
			// ne dodje do 0 kada dodje do 0 ispise nam nas broj unazad
			number = number / 10;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese neki cijeli broj
		System.out.println("Unesite cijeli broj");
		int number = input.nextInt();
		// Pozivamo nasu metodu reverse i printamo nas broj unazad
		System.out.println("Unijetu broj unazad:");
		reverse(number);
		// Zatvaramo unos
		input.close();

	}

}
