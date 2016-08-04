package Zadaci_04_08_2016;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// Pravimo Scanner i niz od 9 brojeva koje cemo unijeti
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite prvih devet brojeva: ");
		int[] array = new int[9];
		int desetiBroj = 0;
		// Korsitmo forpetlju za prolaz kroz niz da bi mogli unijeti 9 bojeva
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		// U ovoj for petlji smo prosli ponovo kroz niz i uzeli deseti broj ako
		// sumu cijelog niza pomonozenog sa varijablom i +1
		for (int i = 0; i < array.length; i++) {
			desetiBroj += (array[i] * (i + 1));
		}
		// Dijelimo deseti broj sa 11
		desetiBroj %= 11;

		// Ovdje pravimo varijablu temo koja ce nam preuzeti privremenu
		// vrijednost broja 10
		for (int temp : array) {
			System.out.print(temp);

		}
		// Postavljamo uslov ako je desti broj jednak 10 printamo X ako nije
		// ispisujemo vrijednost desetog broja
		if (desetiBroj == 10) {
			System.out.print("X");
		} else {
			System.out.print(desetiBroj);
			input.close();
		}

	}

}
