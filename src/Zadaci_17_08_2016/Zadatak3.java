package Zadaci_17_08_2016;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese neki broj short tipa
		System.out.println("Unesite short broj");
		short num = input.nextShort();
		// Printamo nas 16bit broj u string formatu
		System.out.println(String.format("%016d", Integer.parseInt(Integer.toBinaryString(num))));
		// Zatvaramo unos
		input.close();

	}

}
