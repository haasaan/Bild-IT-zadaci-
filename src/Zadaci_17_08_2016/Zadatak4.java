package Zadaci_17_08_2016;

public class Zadatak4 {
	// Pravimo metodu koja vraca broj nula kao prefix
	public static String format(int number, int width) {
		// Pretvaramo int u string
		String n = number + "";
		// Pravimo string
		String s = "";
		// Koristimo for petlju prolazimo od 0 do velicine stringa oduzete sa
		// duzinom broja i povecavamo svaki put za 1 te onda dodjamo nule svaki
		// put kad metoda krene iznova
		for (int i = 0; i < (width - n.length()); i++) {
			s = s + "0";

		}

		return s + number;
	}

	public static void main(String[] args) {
		// Printamo nasu metodu
		System.out.println(format(34, 4));

	}

}
