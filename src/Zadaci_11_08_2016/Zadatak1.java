package Zadaci_11_08_2016;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Pravimo 3 varijable stringa i trazimo od korisnika da unese tri grada
		System.out.println("Unesite prvi grad");
		String str = input.nextLine();
		System.out.println("Unesite drugi grad");
		String str2 = input.nextLine();
		System.out.println("Unesite treci grad");
		String str3 = input.nextLine();
		// Poredimo string 2 sa stringom 1 i kazemo da su manji od 0 te pravimo
		// privremenu varijablu temo
		// koja uzima vrijednost stringa 2 zatim stringu dva dodjeljujemo
		// vrjednost stringa1 te srignu jedan dajemo vrijednost nase privremene
		if (str2.compareTo(str) < 0) {
			String temp = str2;
			str2 = str;
			str = temp;
		}
		// Isto kao iu prvom uslovu samo sto sad ovaj uslov koristimo za string
		// 2 i string 3
		if (str3.compareTo(str2) < 0) {
			String temp = str3;
			str3 = str2;
			str2 = temp;
		}
		// Te ponavljamo prvi uslov da dobijemo stringove poredane po abecednom
		// redu
		if (str2.compareTo(str) < 0) {
			String temp = str2;
			str2 = str;
			str = temp;
		}
		// Ispisujemo stringove u abecednom redu
		System.out.println("Ispis u abecednom redu:");
		System.out.print(str + " " + str2 + " " + str3);
		// Zatvaramo unos
		input.close();

	}
}