package Zadaci_20_08_2016;

public class Location {
	// Pravimo privatne fieldove row column i maxValue
	public int row;
	public int column;
	public double maxValue;

	// Novi konstruktor kojem prosljedjujemo argumenete
	public Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

	// Metoda koja pronalazi najvecu vrijednost i njegovu lokaciju u 2d nizu
	public static Location locateLargest(double[][] a) {

		int row = 0;
		int column = 0;
		double maxValue = a[row][column];
		// For petljaprokazi kroz matricu
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				// Ako je najveca vrijendost manja od indexa u matrici onda
				// dobija tu vrijednost
				if (maxValue < a[i][j]) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
		// Vracamo novu lokaciju za red kolonu i maximalnu vrojednost
		return new Location(row, column, maxValue);
	}

}
