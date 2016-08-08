package Zadaci_08_08_2016;

public class Zadatak4 {

	public static void main(String[] args) {
		System.out.println("Savrseni brojevi od 1 do 10000");
		// Petlja koja prolazi kroz brojeve od 1 do 10000
		for (int i = 1; i <= 10000; i++) {
			// Pozivamo nasu metodu za savrsene brojeve
			SavrseniBrojevi(i);
		}

	}

	// Pravimo metodu za pronalazenje savrsenih brojeva od 1 do 10000

	public static void SavrseniBrojevi(int number) {
		int sum = 0;
		// Postavljamo for petlju i postavljamo i kao 1 i i je manje od naseg
		// broja
		// Onda koristimo uslov ako je ostatak djeljenja jednak 0 na nasu sumu
		// dodajemo broj i
		for (int i = 1; i < number; i++) {
			if ((number % i) == 0) {
				sum = sum + i;
			}
		}
		// Ovdje postavljamo uslov ako je suma jednaka nasem broju onda
		// ispsujemo nas savrseni broj
		if (sum == number) {
			System.out.println(number + " je savrsen broj ");

		}

	}

}
