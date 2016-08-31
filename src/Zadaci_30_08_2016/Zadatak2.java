package Zadaci_30_08_2016;

public class Zadatak2 {

	public static void main(String[] args) {
		// Pravimo try and catch block u try bloku privremenu vrijednost mnozimo
		// sa milijardom te u ctach bloku hvatamo exception da smo ostali bez
		// memorije
		try {
			int[] temp = new int[1000000000];
			temp = new int[temp.length * 1000000000];
		} catch (OutOfMemoryError ex) {
			ex.printStackTrace();
		}

	}

}
