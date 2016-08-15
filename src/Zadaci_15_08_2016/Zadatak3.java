package Zadaci_15_08_2016;

public class Zadatak3 {

	public static void main(String[] args) {
		// Pravimo varijablu sum koja ima vrijednost 0
		double sum = 0;
		// For petlja prolazi od broja 1 do 100 te povecava nase i svaki put kad
		// petlja krene ponovo za 2
		for (double i = 1; i < 100; i += 2) {
			// Racunamo sumu tako sto saberemo broejev koje dobijemo od formule
			// i/(i+2)
			sum += i / (i + 2);
		}
		// Ispisujemo
		System.out.println("Zbir brojeva je " + sum);

	}

}
