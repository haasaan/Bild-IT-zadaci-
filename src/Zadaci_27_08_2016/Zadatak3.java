package Zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
	// Pravimo metodu koja racuna sumusvih brojeva u listi
	public static double sum(ArrayList<Double> list) {
		// Pravim varijablu sum koja ce nam sadrzati vrijednost sume
		double sum = 0;
		// For each petlja prolazi kroz listu
		for (double i : list) {
			// Suma nam je jednaka zbiru svih indexa tj vrijednosti u listi
			sum += i;
		}
		// Metoda vraca sumu
		return sum;
	}

	public static void main(String[] args) {
		// Trazimo od korisnika da unese 5 brojeva
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite pet brojeva ");
		// Pravimo novu array listu te unosimo vrijednosti
		ArrayList<Double> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(input.nextDouble());
		}
		// Pozivamo metodu sum koja nam racauna sumu i printamo sumu nasih
		// brojeva
		System.out.println("Suma ovih pet brojeva je = " + sum(list));
		// Zatvaramo unos
		input.close();
	}

}
