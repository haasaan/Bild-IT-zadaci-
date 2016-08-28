package Zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
	// Metoda koja pronalazi red sa najvise jedinica koristimo se ArrayListama
	public static void getHighestRow(int[][] m, ArrayList<Integer> row) {

		int highest = 0;
		// For etlja prolazimo kroz matricu
		for (int i = 0; i < m.length; i++) {
			int count = 0;
			for (int j = 0; j < m[i].length; j++) {
				// Uslov if ako je matrica jednaka jedinici tj ako u redovima i
				// kolonama sadrzi se jedinica povecavamo brojac
				if (m[i][j] == 1) {
					count++;
				}
			}
			// Ako je najveci broj manji od brojaca onda on uzima njegovu
			// vrijednost te cistimo red i postavljamo u lstu tu najvecu
			// vrijednost
			if (highest < count) {
				highest = count;
				row.clear();
				row.add(i);
				// Ako je najveci jednak s abrojacem onda samo dodajemo ga na
				// listu
			} else if (highest == count) {
				row.add(i);
			}
		}

	}

	// Metoda koja prelazi kolone i pronalazi kolonu sa najvise jedinica
	public static void getHighestColumn(int[][] m, ArrayList<Integer> column) {

		int highest = 0;
		// For petljakpka prolazi kroz kolone matrice
		for (int j = 0; j < m[0].length; j++) {
			int count = 0;
			for (int i = 0; i < m.length; i++) {
				// Ako su kolone jednake jedinic tj vrijednosti u koloni jednake
				// jedinic povecavamo brojac
				if (m[i][j] == 1) {
					count++;
				}
			}
			// Ako je najveci broj manji od brojaca onda on uzima njegovu
			// vrijedsnot brisemo sve manje vrijednosti iz kolone i dodajemo
			// najvecu vrijednost na listu
			if (highest < count) {
				highest = count;
				column.clear();
				column.add(j);
				// Ako je najveci broj jednak brojac tada samo dodajemo tu
				// vrijednost na listu
			} else if (highest == count) {
				column.add(j);
			}
		}
	}

	public static void main(String[] args) {
		// Trazimo od korisnika da nam unese neki broj n koji ce nam dati kojeg
		// omjera je nasa matrica
		System.out.print("Unesite broj n ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[][] m = new int[n][n];
		// For petljom prolazimo kroz matricu i koristimo metodu Math random
		// mnozimo vrijednosti sa 2 tj ispisivat ce nam matricu samo sa 0 i 2
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 2);
			}
		}
		// Ponovo prolazimo kroz matricu kako bi je ispisali
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		// Zatim pravimo nove array liste i iz matrice m na array listu dodajemo
		// red i kolone tj redove sa najvise jedinica i kolone sa najvise
		// jedinica
		ArrayList<Integer> row = new ArrayList<>();
		ArrayList<Integer> column = new ArrayList<>();
		getHighestRow(m, row);
		getHighestColumn(m, column);
		// Ispisujemo
		System.out.println("Red sa najvise jedinica (Brojac pocinje od 0) " + row);
		System.out.println("Kolona sa najvise jedinica(Brojac pocinje od 0) " + column);
		// Zatvaramo unos
		input.close();
	}

}
