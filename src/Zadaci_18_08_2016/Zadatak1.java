package Zadaci_18_08_2016;

public class Zadatak1 {
	// Pravimometodu koja printa niz
	public static void printArray(int[] array) {
		// for petlja prolazimo kroz brojeve te ispisujemo niz
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + " " + array[i]);

		}
	}

	public static void main(String[] args) {
		// Pravimo novi niz od 10 brojeva for petlja od 0 do 100 i koristimo
		// random metodu za dobijanje random brojeva
		int[] arrays = new int[10];
		for (int i = 0; i < 100; i++) {
			int random = (int) (Math.random() * 10);
			// Povecavamo brojac svaki put
			arrays[random]++;

		}
		// Prinatmo niz
		printArray(arrays);

	}

}
