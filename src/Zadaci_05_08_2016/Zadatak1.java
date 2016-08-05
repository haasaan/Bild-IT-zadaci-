package Zadaci_05_08_2016;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese mjesecni iznos stednje
		System.out.println("Unesite mjesecni iznos stednje: ");
		int MjsecniIznosStednje = input.nextInt();
		// Zatim trazimo da unesebroj mjeseci za koje zeli da zna stednju
		System.out.println("Unesite broj mjeseci ");
		double brojMjeseci = input.nextInt();
		double stanjeRacuna = 0;
		// Koristimo for petlju i postavljamo je da prolazi od prvog mjseca do
		// onog koji korisnik unese i zatim po formuli dobijamo stanje racuna za
		// unijeti iznos stednje i unijeti broj mjeseci
		for (int i = 0; i < brojMjeseci; i++) {
			stanjeRacuna = (brojMjeseci * MjsecniIznosStednje * (+1 + 0.00417));

		}
		input.close();
		System.out.println(stanjeRacuna);

	}

}
