package Zadaci_19_08_2016;

public class Zadatak3 {

	public static void main(String[] args) {
		// Pravimo 4x4 matricu
		int[][] matrix = new int[4][4];

		// generisemo nule i jedinice nasumicno koristecu se metodom math.random
		// puta 2

		int largest = 0;
		for (int i = 0; i < matrix.length; i++) {
			int rowCount = 0;
			for (int k = 0; k < matrix[i].length; k++) {
				matrix[i][k] = (int) (Math.random() * 2);
				rowCount += matrix[i][k];
				if (largest < rowCount) {
					largest = rowCount;
				}
				// Uslov if ako je brojac redova veci od najveceg broja onda
				// najveci
				// broj u redu dobija vrijednis++ost brojaca redova i tako
				// dobijamo
				// najveci u redu
			}
		}

		// Trazimo najveci index kolone

		largest = -1;
		for (int k = 0; k < matrix[0].length; k++) {
			int columnCount = 0;
			for (int i = 0; i < matrix.length; i++) {
				columnCount += matrix[i][k];
			}
			// Uslov if ako je brojac koloni veci od najveceg indexa kolone onda
			// najveci uzima vrijednost brojaca te tako dobijamo najveci index
			// kolone
			if (columnCount > largest) {
				largest = columnCount;

			}

		}

		// Printamo matricu
		for (int i = 0; i < matrix.length; i++) {
			for (int k = 0; k < matrix[i].length; k++) {
				System.out.printf("%d", matrix[i][k]);
			}
			System.out.printf("\n");
		}
		// Printamo najvece indexe redova i koloni
		System.out.println("The largest row index: " + largest);
		System.out.println("The larges column index: " + largest);
	}

}
