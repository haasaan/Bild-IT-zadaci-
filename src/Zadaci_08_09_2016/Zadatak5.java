package Zadaci_08_09_2016;

public class Zadatak5 {
	// Metoda koja nasljedjuje klasu Comparable te pretrazuje vrijednosti u nizu
	public static <E extends Comparable<E>> int binarySearch(E[] list, E value) {
		// Dvije varijable najveca vrijedsnot i najmanja vrijednost
		int low = 0;
		int high = list.length - 1;
		// Sve dok je najveca vrijednost veca ili jednaka najmanjoj
		while (high >= low) {
			// Srednja vrijednost ce biti najveca vrijednost - najmanja te
			// djeljena sa 2 i onda sabrana sa najmanjom
			int mid = (high - low) / 2 + low;
			// Ako listu sa indexom srednje vrijednosti poredimo sa nekom
			// vrijednosti i ako se jednake nuli onda vracamo srednju vrijednost
			if (list[mid].compareTo(value) == 0)
				return mid;
			// Ako su manje od nule te dvije vrijednosti onda najmanja
			// vrijednost je jednaka srednjoj vrijednosti plus 1
			if (list[mid].compareTo(value) < 0)
				low = mid + 1;
			// Ako je drugacije najveca vrijednost je jednaka srednjoj
			// vrijedsnoti minus 1
			else
				high = mid - 1;
		}
		// Vracamo -1
		return -1;
	}

	public static void main(String[] args) {
		// Pravimo niz od 10 brojeva
		Integer[] list = new Integer[10];
		// Prolazimo kroz niz pomocu for petlje
		for (int i = 0; i < list.length; i++) {
			list[i] = i;
		}

		// Testiramo nasu metodu binarySearch i ispisujemo
		for (int i = 0; i < list.length + 4; i++) {
			System.out.println("Search = " + binarySearch(list, i));

		}

	}
}