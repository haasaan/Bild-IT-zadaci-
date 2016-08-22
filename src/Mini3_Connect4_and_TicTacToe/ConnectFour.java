package Mini3_Connect4_and_TicTacToe;

import java.util.Scanner;

public class ConnectFour {
	// Dvije staticne metode boolean tipa
	static boolean isPlayer1Turn = true;
	static boolean hasWon = false;

	// Metoda koja printa matricu
	public static void displayMatrix(String[][] m) {
		// For petlja prolazi kroz matricu i printa je
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println("");
		}

	}

	// Metoda prekokoje pravimo tablu za igru
	public static String[][] createGrid(int row, int column) {
		// Matricu tipa string
		String[][] m = new String[row][column];
		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m[i].length; j++) {
				// Ako je j jednako 0 onda nasam matrica jednaka | |
				if (j == 0)
					m[i][j] = "| |";
				// Ako nije onda je jednaka |
				else
					m[i][j] = " |";

			}
		}
		// Vracamo nasu matricu
		return m;
	}

	// Metoda koja provjerava da li imaju 4 iste
	public static boolean isConsecutiveFour(String[][] m) {
		// Novi string te pozivamo metodu da li je igracev red
		String s = (isPlayer1Turn) ? "R" : "Y";

		int occurrence = 0;
		// (m[0].length - 3) --> samo provjerava one kojih nema 4 jednake
		for (int j = 0; j < m[0].length - 3; j++) {
			int y = m.length - 1; // Svaki re dpocinje sakrajem zadnjeg reda
			int x = j;
			while (x < m[0].length && y >= 0) {
				// Ako matrica sadrzi string s povecavamo one kojih nema
				// 4jednake
				if (m[y][x].contains(s)) {
					occurrence++;
					// Ako su nasih nejednakih ima 4 onda uslov vraca true ako
					// nije postavljamo na 0
					if (occurrence == 4)
						return true;
				} else {
					occurrence = 0;
				}
				x++;
				y--;
			}
		}
		// (m.length - 2) --> Samo provjerava ako nema istih 4
		// Zadnji red smo vec provjerili
		for (int i = m.length - 2; i > 2; i--) {
			int x = 0; // Kolone uvijek krecu sa lijeve strane
			int y = i;
			occurrence = 0;
			while (x < m[0].length && y >= 0) {
				if (m[y][x].contains(s)) {
					occurrence++;
					if (occurrence == 4)
						return true;
				} else {
					occurrence = 0;
				}

				x++;
				y--;
			}
		}

		// j >= 3 --> Ponovo provjeravamo da li ima isth 4
		for (int j = m[0].length - 1; j >= 3; j--) {
			int y = m.length - 1; // Novi red uvijek krece na zadnjem redu
			int x = j;
			occurrence = 0;

			while (x >= 0 && y >= 0) {
				// Uslov if ako matrica sadrzi string s povecavamo razlicte
				if (m[y][x].contains(s)) {
					occurrence++;
					// Ako su jednake 4 onda uslov vraca true ako nisi vracamo
					// na default
					if (occurrence == 4)
						return true;
				} else {
					occurrence = 0;
				}
				x--;
				y--;
			}

		}

		// i > 2 --> reason: Provjeravamo razlicite 4
		for (int i = m.length - 2; i > 2; i--) {
			int x = m[0].length - 1;
			int y = i;
			occurrence = 0;
			while (x >= 0 && y >= 0) {
				if (m[y][x].contains(s)) {
					occurrence++;
					if (occurrence == 4)
						return true;
				} else {
					occurrence = 0;
				}
				x--;
				y--;
			}

		}

		return false;
	}

	// Metoda koja provjerava gdje stavljamo nase boje ili sl
	public static boolean dropDisk(String[][] m, int column) {

		// Postavljamo gdje staviti nas disk
		String s;
		if (isPlayer1Turn) {
			s = (column > 0) ? "R|" : "|R|";
		} else {
			s = (column > 0) ? "Y|" : "|Y|";
		}
		boolean didRowUpdate = false;
		int row = 0;

		// Provjeravamo da li vec ima disk u toj koloni
		// Ako ima dobijamo koretan index reda
		for (int i = 0; i < m.length; i++) {

			if (isClear(m[i][column])) {
				didRowUpdate = true;
				row = i;
			}
		}

		if (!didRowUpdate)
			return false;

		m[row][column] = s;

		return true;
	}

	// Metoda provjerava da li je polje cisto
	public static boolean isClear(String s) {
		// Metoda vraca ako string sadrzi nase zagradice prazne
		return s.contains("| |") || s.contains(" |");
	}

	public static void main(String[] args) {
		// Pozivamo metodu koja pravi tabelu
		String[][] m = createGrid(6, 7);
		Scanner input = new Scanner(System.in);
		int column;

		while (!hasWon) {
			// Igracov red bira crvenu ili zutu
			String diskColor = (isPlayer1Turn) ? "red" : "yellow";
			// Ispisujemo matricu
			displayMatrix(m);
			boolean isFirstInput = true;
			do {
				// Ako je kolona puna ispisuje nam upozrenje da je kolona puna
				if (!isFirstInput) {
					System.out.println("COLUMN IS FULL. Try again...");
				}
				// Trazimo od igraca da unese boju
				System.out.print("Drop a " + diskColor + " at column (0–6): ");
				column = input.nextInt();
				isFirstInput = false;
			} while (!dropDisk(m, column));
			// Uslov provjeravamo da li imaju 4 iste
			if (isConsecutiveFour(m)) {
				// Printamo matricu
				displayMatrix(m);
				// Ako igrac pobjedi sa odabranom bojom pogram mu to ispisuje te
				// pita igraca da li zeli ponoov da igra
				System.out.print("The " + diskColor + " player won! Do you want to play again? (y/n)");
				char s = input.next().charAt(0);
				if (s == 'y' || s == 'Y') {
					m = createGrid(6, 7);
					isPlayer1Turn = false;
				} else {
					System.exit(0);
				}
			}

			isPlayer1Turn = !isPlayer1Turn;
		}
		// Zatvaramo unos
		input.close();

	}

}
