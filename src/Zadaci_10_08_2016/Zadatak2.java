package Zadaci_10_08_2016;

public class Zadatak2 {

	public static void main(String[] args) {
		// Pravimo dvije barijable prime i dodjeljujemo mu vrijednost 1 a
		// brojac ostavljamo na default
		int prime = 1;
		int counter = 0;
		// Koristimo ugnjezdeno for petlju prolzaimo korz projeve te koristimo
		// uslov ako je ostatak djeljenja od i i j jednak nuli prekidamo petlju
		for (int i = 1; i < 10001; i++) {
			for (int j = 2; j < 10001; j++) {
				if (i % j == 0) {
					break;
				}
				// Ponovo uslov ako je nase i oduzeto od prime koji ima vrednost
				// 1 jednako 2 nas variabla prime dobija vrjednost od i te tako
				// dobijamo nase twin prime brojeve
				if (i - prime == 2) {
					prime = i;
					System.out.print(("(" + (i - 2) + "," + i + ")"));
					counter++;
				}
				// Ovo je uslov koji koristio da printamo 10 parova po liniji
				if (counter == 10) {
					System.out.println();
					counter = 0;
				}

			}
		}

	}

}
