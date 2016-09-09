package Zadaci_08_09_2016;

public class Zadatak2 {
	// Metoda koja nasljeduje klasu Comparable i koja pretrazuje vrijednosti
	public static <E extends Comparable<E>> int linearSearch(E[] list, E value) {
		// For petlja prolazi kroz listu
		for (int i = 0; i < list.length; i++) {
			// Ako je lista poredjena sa vrijednoscu nekom jednaka nuli onda
			// vracamo index i
			if (list[i].compareTo(value) == 0) {
				return i;
			}
		}
		// Vracamo -1
		return -1;
	}

	public static void main(String[] args) {
		// Niz od 20 brojeva
		Integer[] list = new Integer[20];
		// For petlja prolazi kroz niz i vrijednost niza na idnexu i je jednak i
		for (int i = 0; i < list.length; i++) {
			list[i] = i;
		}
		// Ipsisujemo da nam pretari broj 1 10 i 30 posto nas niz ima 20 brojeva
		// za br 30 ce vratiti -1
		System.out.println(linearSearch(list, 1));
		System.out.println(linearSearch(list, 10));
		System.out.println(linearSearch(list, 30));
	}

}
