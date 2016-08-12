package Zadaci_12_08_2016;

import java.util.Scanner;

public class Zadatak4 {
	// Pravimo metodu rastuciRedoslijed koja prima 3 cijela broja kao argument
	// te nam vraca brojeve u rastucem redoslijedu
	public static void rastuciRedoslijed(int num1, int num2, int num3) {
		// Pravimo varijablu temp
		int temp;
		// Uslov if ako je broj1 veci od broja2 varibala temp dobija vrijednost
		// broja1 te su nam onda vridjenosti broja1 i broja2 jednake a onda
		// zatim broju2 dodajemo vrijednost varijable temp
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		// Isto tako radimo sa brojem2 i broj3 dajemo varibali vrijednost broja2
		// te nam onda broj2 ima vrijednost broja3 a zatim broj 3 ima vrijednost
		// varijable
		if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		// Ponavaljamo prvi uslov te tako dobijamo brojeve u rastucem
		// redoslijedu
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;

		}
		// Printamo brojeve u rastucem redoslijedu
		System.out.println("Brojevi u rastucem redoslijedu: " + num1 + " " + num2 + " " + num3);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese tri broja
		System.out.println("Unesite tri broja: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		// Pozivamo metodu koja je provjerila brojeve u rastucem redoslijedi i
		// printa ih
		rastuciRedoslijed(num1, num2, num3);
		// Zatvaramo unos
		input.close();

	}

}
