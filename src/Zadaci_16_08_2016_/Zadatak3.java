package Zadaci_16_08_2016_;

import java.util.Scanner;

public class Zadatak3 {
	// Pravimo metodu koja provjerava da li je format SSN broja tacan
	public static boolean SSN(String s) {
		// For petlja prolazi kroz duzinu stringa
		for (int i = 0; i < s.length(); i++) {
			// Ako je i jednako 3 i nas ch razlicit od crtice vraca false
			char ch = s.charAt(i);
			if (i == 3 && ch != '-')
				return false;
			// Isto to radimo i za broj 6
			if (i == 6 && ch != '-')
				return false;
			// Ako je i razlicito od 6 i i razlicito od 3 i razlicito od metoda
			// da je karatket broj vraca nam false
			if (i != 6 && i != 3 && !Character.isDigit(ch))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da nam unese SSN broj u formatu DDD-DD-DDDD
		System.out.println("Unesite SSN u formatu: DDD-DD-DDDD");
		String s = input.nextLine();
		// Sve dok korisnik unosi SSN broj u drugacijem formatu od zadanog
		// program mu vraca da je unije pogresan format te da pokusa ponovo
		while (SSN(s) != true) {
			System.out.println("Unijeli ste pogresan format SSN-a, pokusajte ponovo ");
			s = input.nextLine();
			// Kada korisnik unese tacan format SSN-a program ispisuje da je
			// unijo tacan SSN i zavrsava sa radom
			if (SSN(s)) {
				System.out.println("Unijeli ste tacan SSN");
			}
		}
		// Zatvaramo unos
		input.close();

	}

}
