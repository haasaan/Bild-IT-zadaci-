package Zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite iznos investicije: ");
		// Unosimo iznos ivesticije
		double iznosInvesticije = input.nextDouble();
		System.out.println("Unesite godisnju interesnu stopu: ");
		// Unosimo godisnju stopu
		double godisnjaInteresnaStopa = input.nextDouble();
		System.out.println("Unesite broj godina: ");
		// Unosimo broj godina
		double brojGodina = input.nextInt();
		// Postavljamo buducu vrijednost investicije na 0 tj default
		double buducaVrijednostInvesticije = 0;
		// racunamo mjesecnz stopu preko forumule:
		double mjesecnaInteresnaStopa = godisnjaInteresnaStopa / 100 / 12;
		// Racunamo buducu vrijednost investicije
		buducaVrijednostInvesticije = iznosInvesticije * Math.pow(1 + mjesecnaInteresnaStopa, brojGodina * 12);
		// Ispisujemo buducu vrijednost investicije za unijeti iznos unijetu
		// godinju stopu i za unijeti broj godina
		System.out.println("Buduca vrijednost investicije " + buducaVrijednostInvesticije);
		input.close();

	}

}
