package Zadaci_08_08_2016;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite prva tri slova mjeseca ");
		// Unosimo mjesec prva tri slova mjeseca
		String mjesec = input.nextLine();
		String jan = "jan";
		String feb = "feb";
		String mar = "mar";
		String apr = "apr";
		String maj = "maj";
		String jun = "jun";
		String jul = "jul";
		String avg = "avg";
		String sep = "sep";
		String okt = "okt";
		String nov = "nov";
		String dec = "dec";
		System.out.println("Unesite godinu ");
		// Unosimo godinu
		int godina = input.nextInt();
		// Postavljamo uslove ako je varijabla jan jednaka nasem unosu prva tri
		// slova ispisujemo je sa prvim velikim slovom godinom i brojem dana
		// Samo za februar so racunali ako je presupna godina onda mjesec febuar
		// ima 29 dana ostale uslove nastavljamo isto kao i sa januarom samo sto
		// koristimo nove varijable i tako do decembra
		if (jan.equals(mjesec)) {
			System.out.println(jan.substring(0, 1).toUpperCase() + jan.substring(1) + " " + godina + " ima 31 dan");
		} else if ((godina % 4 == 0) && (feb.equals(mjesec))) {
			System.out.println(feb.substring(0, 1).toUpperCase() + feb.substring(1) + " " + godina + " ima 29 dana");
		} else if (feb.equals(mjesec)) {
			System.out.println(feb.substring(0, 1).toUpperCase() + feb.substring(1) + " " + godina + " ima 28 dana");
		} else if (mar.equals(mjesec)) {
			System.out.println(mar.substring(0, 1).toUpperCase() + mar.substring(1) + " " + godina + " ima 31 dan");
		} else if (apr.equals(mjesec)) {
			System.out.println(apr.substring(0, 1).toUpperCase() + apr.substring(1) + " " + godina + " ima 30 dana");
		} else if (maj.equals(mjesec)) {
			System.out.println(maj.substring(0, 1).toUpperCase() + maj.substring(1) + " " + godina + " ima 31 dan");
		} else if (jun.equals(mjesec)) {
			System.out.println(jun.substring(0, 1).toUpperCase() + jun.substring(1) + " " + godina + " ima 30 dana");
		} else if (jul.equals(mjesec)) {
			System.out.println(jul.substring(0, 1).toUpperCase() + jul.substring(1) + " " + godina + " ima 31 dan");
		} else if (avg.equals(mjesec)) {
			System.out.println(avg.substring(0, 1).toUpperCase() + avg.substring(1) + " " + godina + " ima 31 dan");
		} else if (sep.equals(mjesec)) {
			System.out.println(sep.substring(0, 1).toUpperCase() + sep.substring(1) + " " + godina + " ima 30 dana");
		} else if (okt.equals(mjesec)) {
			System.out.println(okt.substring(0, 1).toUpperCase() + okt.substring(1) + " " + godina + " ima 31 dan");
		} else if (nov.equals(mjesec)) {
			System.out.println(nov.substring(0, 1).toUpperCase() + nov.substring(1) + " " + godina + " ima 30 dana");
		} else if (dec.equals(mjesec)) {
			System.out.println(dec.substring(0, 1).toUpperCase() + dec.substring(1) + " " + godina + " ima 31 dan");
		}
		input.close();
	}

}
