package Zadaci_29_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// Trazimo od korisnika da unese dva broja
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite dva broja: ");
		int num1 = 0;
		int num2 = 0;
		// Boolean varijablja isValid postavljamo kao false
		boolean isValid = false;
		// Ako je boolean true
		while (!isValid) {
			// Postavljamo try and catch blok i u try bloku pokusajemo da
			// unesemo dva broja
			try {
				num1 = input.nextInt();
				num2 = input.nextInt();
				isValid = true;
				// Catch blok nam hvata pogresku ako nismo unijeli broj ako smo
				// unijeli slovo ili neki drugi karatkter hvata gresku i ne
				// prekida program nego nam ispisuje da smo unijeli pogresno te
				// da pokusamo ponovo
			} catch (InputMismatchException ex) {

				input.nextLine();
				System.out.println("Pogresan unos. Pokusajte ponovo");
				System.out.print("Unesite dva broja: ");
			}
		}
		// Ispisujemo broj 1 i broj 2 te njihovu sumu
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		input.close();

	}

}
