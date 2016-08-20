package Zadaci_19_08_2016;

public class Zadatak5 {
	// Metoda koja provjerava da li svaki red ima isti broj jedinica
	public static boolean isAllRowsEven1s(int[][] m) {
		// Pravimo brojac
		int count = 0;
		// Prolazimo kroz matricu koristeci for petlju
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				// Ako je matrica jednaka jedinici povecavamo nas brojac
				if (m[i][j] == 1)
					count++;
			}
			// Ako nas broja podjeljen sa 2 je razlicit od0 vracamo false
			if (count % 2 != 0)
				return false;
		}
		// Metoda vraca true
		return true;
	}

	// Pravimo metodu koja provjerava da li svaka kolona ma jednak broj jedinica
	public static boolean isAllColumnsEven1s(int[][] m) {
		// Pravimo brojac
		int count = 0;
		// Prolazimo kroz matricu ponovo koristeci for petlju
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				// Ako je matrica jednaka jedinic povecavamo brojac
				if (m[j][i] == 1)
					count++;
			}
			// Ponovo ako je djlejenje razlicito odnule metoda vraca false
			if (count % 2 != 0)
				return false;
		}
		// Vracamo true ako ima jednak broj
		return true;
	}

	public static void main(String[] args) {
		// Generisemo 6x6 matricu i ispisujemo je
		int[][] matrix = new int[6][6];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// Ispisujemo da li svaki red ima ili nema jednak broj jedinica
		// implementirajuci metodu isAllRowsEven
		System.out.println("Svaki red" + (isAllRowsEven1s(matrix) ? " " : " nema " + "ima jednak broj jedinica"));
		// Ispisujemo da li svaka kolona ima jednak broj jedinica
		// implementirajuci metodu isAllColumnsEven
		System.out.println("Svaka kolona" + (isAllColumnsEven1s(matrix) ? " " : " nema " + "ima jednak broj jedinica"));
	}

}
