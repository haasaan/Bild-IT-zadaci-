package Zadaci_16_08_2016;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki broj");
		int num = input.nextInt();
		// Koristimo for petlju prolazimo od broja 1 do broja koji unese
		// korisnik ;
		for (int i = 1; i <= num; i++) {
			// Druga for petlja od jedan do manje ili jednako nas broj oduzet sa
			// 1 i
			for (int j = 1; j <= num - i; j++) {
				System.out.print("  ");
			}
			// For petlja postavljamo da je nase k sada jednako i te da je vece
			// ili jednako od 1 i svaki put kad se petlja vrti smanjuje broj za
			// 1
			for (int k = i; k >= 1; k--) {
				// Printamo lijevu stranu piramide tj gdje se brojevi smanjuju
				// idu od veceg tj od broja koji je korisnik unijeo prema manjeg
				// pa sve do 1
				System.out.print((k >= 10) ? +k : " " + k);
			}
			// For petlja nase k sada je jednako 2 te je ono manje ili jednako
			// od i i povecavamo ga svaki put kad ponavljamo petlju
			for (int k = 2; k <= i; k++) {
				// Printamo desnu stranu nase piramide tj gdje brojevi idu od
				// manjeg prema vecem tj od jedan pa do broja koji je korisnik
				// unijeo
				System.out.print((k >= 10) ? +k : " " + k);
			}
			// Printamo razmak izmedju brojeva
			System.out.println(" ");
			// zatvaramo unos
			input.close();
		}
	}

}
