package Zadaci_23_08_2016;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// Trazimo od korisnika da unese pozitivan integer
		System.out.print("Enter a positive integer: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		// Pravimo objekat stak i oma vrijednost 20
		StackOfIntegers stack = new StackOfIntegers(20);

		int factor = 2;
		// Racunamo proste faktore preko while
		while (factor <= num) {
			// Ako je ostatak djeljenja jednak 0
			if (num % factor == 0) {
				// Dodajemo na stak faktor
				stack.push(factor);
				num /= factor;
				// Ako nije povecavamo faktor
			} else {
				factor++;
			}
		}
		// Ako je stak prazan program nam ispisuje da je prazan
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		input.close();
	}

}
