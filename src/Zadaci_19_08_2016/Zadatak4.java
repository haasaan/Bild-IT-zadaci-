package Zadaci_19_08_2016;

public class Zadatak4 {
	// Pravimo metodu koja sortira nasu matricu
	public static void sort(int[][] m) {
		// Pravimo novi niz
		int[] min = new int[2];
		// Prolazimo kroz redove matrice do duzina redova minus 1
		for (int row = 0; row < m.length - 1; row++) {
			// Prvi index na nasem nizi je jednak prvom indexu u redu matrice
			min[0] = m[row][0];
			// Drugi index je jednak drugom indexu
			min[1] = m[row][1];
			int index = row;
			// Prolazimo kroz redove matrice ponovo i svaki put kad se ponovi
			// petlja redovi se povecavaju za 1
			for (int i = row + 1; i < m.length; i++) {
				// Ako je kolona na prvom indexu manja od prvog indexa naseg
				// niza i manja od drugog indexa ili drugi iindexkolone manji od
				// prvog indexa niza ili drugi indexkolone manji od drugog
				// indexa niza
				if (m[i][0] <= min[0] && (m[i][0] < min[1] || m[i][1] < min[0] || m[i][1] < min[1])) {
					// Onda je prvi index niza jednak prvom indexu kolone te
					// redovaima na indexu i
					min[0] = m[i][0];
					// Te je drugi index u nizu jednak redovima na indexu i i
					// koloni na drugom indexu
					min[1] = m[i][1];
					// Te je nasa varijabal index jednaka i
					index = i;
				}
			}
			// Ako je index razlicit od redova
			if (index != row) {
				// Onda je index redovu jendak indexu row
				m[index][0] = m[row][0];
				m[index][1] = m[row][1];
				// Te je matrica sa indexom redovi i na prvom indexu kolone
				// jedak prvom indexu niza
				m[row][0] = min[0];
				// Isto tako i za drugi index
				m[row][1] = min[1];
			}
		}
	}

	public static void main(String[] args) {
		// Inicijalizujemo matricu
		int[][] array = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };

		// Pozivamo metodu za sortiranje matrice
		sort(array);

		// Ispisujemo nasu sortiranu matricu
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
		}

	}
}
