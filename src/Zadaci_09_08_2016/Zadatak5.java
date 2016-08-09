package Zadaci_09_08_2016;

import java.util.Scanner;

public class Zadatak5 {
	// Pravimo metodu koja nam pretvara mili sekunde u sate minute i sekudne te
	// nam sve to vraca u string formatu
	public static String convertMillis(long millis) {
		// Racunamo sekunde
		long second = (millis / 1000) % 60;
		// Racunamo minute
		long minute = (millis / (1000 * 60)) % 60;
		// Racunamo sate
		long hour = (millis / (1000 * 60 * 60)) % 24;
		// Vracamo izracunate sekunde minute i sate u string formatu
		return String.format("%02d:%02d:%02d:", hour, minute, second);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese koliko mili sekundi zeli da pretvori u
		// sate minute i sekunde
		System.out.println("Unesite mili sekunde ");
		long millis = input.nextLong();
		// Pozivamo metodu u kojoj smo pretvorili mili sekunde u sate minute i
		// sekudne i printamo
		System.out.println(millis + " mili sekundi je: ");
		System.out.println(convertMillis(millis) + " sati " + " minuta " + " sekundi");
		input.close();

	}

}
