package Zadaci_06_09_2016;

import java.util.Scanner;

public class Zadatak1 {
	// Metoda koja pronalazi fibonacijevu vrijednost preko unijetog indexa
	public static long fibonacci(int index) {
		// Ako je index jednak0 vracamo 0 ako je index jednak jedinici vracamo 1
		if (index == 0)
			return 0;
		if (index == 1)
			return 1;
		// Pravimo varijable f0 ima vrijednost 0 f1 ima vrijednost 1 i varjablu
		// fib
		int f0 = 0;
		int f1 = 1;
		int fib;
		// For petlja krece od 2 i ide do unijetog indexa
		for (int i = 2; i <= index; i++) {
			// Fib je jednako 0 + 1
			fib = f0 + f1;
			// Sada nula ima vrijednost jedinicce
			f0 = f1;
			// Jedinica ima vrijednost zbira 0 i jedan
			f1 = fib;
		}
		// Vracamo f1
		return f1;
	}

	public static void main(String[] args) {
		// Trazimo od korisnika da unese index
		System.out.print("Unesite fibonacijev index: ");
		Scanner input = new Scanner(System.in);
		int index = input.nextInt();
		// Ispisujemo fibonaci vrijednost pozivajuci metodu fibonacci
		System.out.println("Fibonaci vrijednost je " + fibonacci(index));
		//Zatvaramo unos
		input.close();

	}

}
