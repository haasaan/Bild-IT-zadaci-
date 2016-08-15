package Craps_And_Credit_Cards_Mini_Projekat;

import java.util.Scanner;

public class CreditCardNumberValidation {
	// Pravimo metodu isValid koja provjerava da li je broj kartice validan
	public static boolean isValid(long number) {
		// Pravimo varijablu total i implementiramo metodu sumEvenPlace i
		// sumOddPlace
		int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
		// Ako je ostatak djeljanja jednak 0 i metodaprefixMatched jednaka
		// boolean true i metoda getSize veca ili jednaka od 1 i metoda getSize
		// manja ili jednaka od 16
		if ((total % 10 == 0) && (prefixMatched(number, 1) == true) && (getSize(number) >= 13)
				&& (getSize(number) <= 16)) {
			return true;// Vracamo true ako rezultat metode
		} else {
			return false;// Ako nije vracamo false
		}
	}

	// Pravimo metodu getDigit koja sluzi da provjeravamo brojeve
	public static int getDigit(int number) {
		// Ako je broj manji ili jednako od 9
		if (number <= 9) {
			// Vracamo taj broj
			return number;
			// Ako nije ako je broj dvocifren prvu brojku dobijamo tako sto
			// Odbijamo prvi broj dvocifrenog broja ostaje nam sama zadnja cifra
			// Drugi broj dobijamo tako sto podjelimo tako sto podjelimo broj sa
			// 10
		} else {
			int firstDigit = number % 10;
			int secondDigit = (int) (number / 10);
			// Metoda nam vraca zbir prvog i drugog broja
			return firstDigit + secondDigit;
		}
	}

	// Pravimo metodu koja sabira sva neparna mjesta
	public static int sumOfOddPlace(long number) {
		int result = 0;
		// Sve dok je bro veci do 0 rezultat ce biti suma ostatka brojeva i broj
		// koji cemo dobiti cemo podjeliti sa 100
		while (number > 0) {
			result += (int) (number % 10);
			number = number / 100;
		}

		return result;
	}

	// Pravimo metodu koja racuna sva parna mjesta
	public static int sumOfDoubleEvenPlace(long number) {

		int result = 0;
		long temp = 0;
		// Sve dok je broj veci od 0
		while (number > 0) {
			// Prvivremena vrijednost ce biti zadnji broj broja number
			temp = number % 100;
			// Rezultat ce biti zbir broja i privremene vrijednosti podjeljene
			// sa 10 sve to pomnozeno sa 2
			result += getDigit((int) (temp / 10) * 2);
			// A broj ce biti jednak broj podjeljeno sa 100
			number = number / 100;
		}

		return result;
	}

	// Metoda koja nam provjerava da li se prefixi podudaraju u brojevima
	// kartica
	public static boolean prefixMatched(long number, int d) {
		// U ovomuslovu poredimo prefixe
		if ((getPrefix(number, d) == 4) || (getPrefix(number, d) == 5) || (getPrefix(number, d) == 37)
				|| (getPrefix(number, d) == 6)) {
			// Ako je prefix jednak 4 ispisujemo da je to Visa
			if (getPrefix(number, d) == 4) {
				System.out.println("\nVisa Card ");
				// Ako je 5 to je Master Card
			} else if (getPrefix(number, d) == 5) {
				System.out.println("\nMaster Card ");
				// Ako je 37 to je American Express
			} else if (getPrefix(number, d) == 37) {
				System.out.println("\nAmerican Express Card ");
				// Ako je refix 6 onda je to Discover Card
			} else if (getPrefix(number, d) == 6) {
				System.out.println("\nDiscover Card");
			}
			// Ako su uslovi ispusnjeni vracamo true
			return true;
			// Ako nisu metoda vraca false
		} else {

			return false;

		}
	}

	// Metoda koja broji brojeve u broju d
	public static int getSize(long d) {
		// Pravimo brojac
		int count = 0;
		// Sve dok je broj d veci od nule dijelimo ga sa 10
		while (d > 0) {
			d = d / 10;
			// Povecavamo brojac nakon svakog dijeljenja te tako dobijamo
			// izbrijane brojeve
			count++;
		}
		// Metoda nam vraca izbrojane brojeve
		return count;

	}

	// Metoda s kojom dobijamo prefix
	public static long getPrefix(long number, int k) {
		// Ako je metoda getSize tj broj manji od broja k vracamo nas broj
		// number
		if (getSize(number) < k) {
			return number;
			// Ako nije pravimo novu varjablu size i na nju dodjeljujemo
			// vrijednost tog broja
		} else {

			int size = (int) getSize(number);
			// Zatim pravimo petlju prolazimo od 0 do dvocifrenog broja - nas
			// broj k i dijelimo sa 10
			for (int i = 0; i < (size - k); i++) {
				number = number / 10;
			}
			// Vracamo nas dobijeni prefix
			return number;

		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese broj kreditne kartice
		System.out.print("Unesite broj kreditne kartice(long) ");
		long num = input.nextLong();
		// Koristimo uslov if te implementiramo metodu isValid ako je ona true
		// tj ako smo unijeli tacan broj kreditne kartice program nam vraca da
		// je broj validan
		if (isValid(num) == true) {
			System.out.println("\n" + input + " is Valid. ");
			// Ako broj nije validan program nam vraca da broj nije validan
		} else {
			System.out.println("\n" + input + " is Invalid. ");
		}
		// Zatvaramo unos
		input.close();

	}

}
