package Zadaci_10_08_2016;

public class Zadatak3 {

	public static void main(String[] args) {
		// Napravili smo niz od 7 brojeva
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		// Koristimo ugnijezdenu for petlju prolazimo kroz brojeve u prvoh for
		// petlji prolazimo kroz brojeve do zadnjeg indexa u nizu
		// U drugoj for petlji svaki put kad prodje jednu kombinaciju sa jendim
		// projem prvi broj se povecava za jedan
		// Na kraju printamo nase nizove i dobijamo kombinacije brojeva od 1 do
		// 7
		System.out.println("Kombinacije brojeva su:");
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				System.out.println(array[i] + " " + array[j]);
			}

		}

	}

}
