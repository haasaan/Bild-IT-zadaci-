package Mini3_Connect4_and_TicTacToe;

import java.util.Scanner;

public class TicTacToe {
	// Pravimo tri staticne varijable jedna boolean tipa te dvije int tipa
	static public boolean isPlayer1Turn = true;
	static int mRow = 0;
	static int mColumn = 0;

	// Metoda koja trazi od igraca da unosi kolonu
	public static int askForColumn() {
		Scanner input = new Scanner(System.in);
		int column = 0;
		boolean isColumnValid = false;
		while (!isColumnValid) {
			// Uslov ako je igracov red ispisujemo da unese kolonu za igraca x
			if (isPlayer1Turn) {
				System.out.print("Enter a column (0, 1, or 2) for player X: ");
				// Ako nije ispisujemo da unese kolonu za igraca O
			} else {
				System.out.print("Enter a column (0, 1, or 2) for player O: ");
			}
			column = input.nextInt();

			// Metoda koja provjerava da li je unijet dozvoljeni range koloni
			isColumnValid = isValidRange(column);

		}

		return column;

	}

	// Metoda koja trazi odigraca da unese red
	public static int askForRow() {
		int row = 0;
		Scanner input = new Scanner(System.in);

		boolean isRowValid = false;
		while (!isRowValid) {
			// Ako je igracev red onda trazi od igraca da unese red za igraca X
			if (isPlayer1Turn) {
				System.out.print("Enter a row (0, 1, or 2) for player X: ");
				// Ako nije trazi da unese red za igraca O
			} else {
				System.out.print("Enter a row (0, 1, or 2) for player O: ");
			}
			row = input.nextInt();

			isRowValid = isValidRange(row);

		}

		return row;
	}

	// Metoda koja provjerava da li je unijeta dozvoljena granica
	public static boolean isValidRange(int section) {
		return (0 <= section && section <= 2);
	}

	// Metoda koja provjerava da li je polje kojeigrac unijeo cisto
	public static boolean isPositionClear(String[][] grid) {

		String position = grid[mRow][mColumn];

		return position.equals("|     |") || position.equals("      |");

	}

	// Metoda koja ispisuje tabelu za igranje
	public static void displayGrid(String[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			System.out.println("---------------------");
			for (int k = 0; k < grid[i].length; k++) {
				System.out.print(grid[i][k]);
			}
			System.out.println("");
		}
		System.out.println("---------------------");

	}

	// Metoda preko koje pravimo tabelu za igranje
	public static String[][] createGrid(int row, int column) {
		// Pravimo novu matricu string formata
		String[][] grid = new String[row][column];
		// Prolazimo kroz matricu forpetljom
		for (int i = 0; i < grid.length; i++) {
			for (int k = 0; k < grid[i].length; k++) {
				// Ako je nase k jednako 0 onda ispisujemo prvu kolonu
				if (k == 0)
					grid[i][k] = "|     |";
				// Ako je drugacije onda ispisujemo svaku kolonu poslije prve
				else
					grid[i][k] = "      |";
			}
		}
		return grid;
	}

	// Metoda koja prati igru i prosljedjuje nam koji je igrac trenutno na redu
	public static boolean updateTurn(String[][] grid) {

		// Ako mjesto nije prazno uslov vraca false
		if (!grid[mRow][mColumn].equals("|     |") && !grid[mRow][mColumn].equals("      |"))
			return false;

		String update;
		if (isPlayer1Turn)
			update = (mColumn == 0) ? "|  X  |" : "  X   |";
		else
			update = (mColumn == 0) ? "|  O  |" : "  O   |";

		grid[mRow][mColumn] = update;

		return true;
	}

	// Metoda koja provjerava koji je igrac pobjedio
	public static boolean hasWon(String[][] grid) {

		int player = (isPlayer1Turn) ? 0 : 1;
		String token = (player == 0) ? "X" : "O";

		return (checkColumn(grid, token) || checkColumn(grid, token) || checkDiagonal(grid, token));
	}

	// Metoda koja provjerava kolone
	public static boolean checkColumn(String[][] grid, String s) {

		int occurence = 0;
		// For petljaprolazi kroz matricu
		for (int k = 0; k < grid[0].length; k++) {
			for (int i = 0; i < grid.length; i++) {
				// Ako matrica sadrzi string s onda razlicte pvecavamo
				if (grid[i][k].contains(s))
					occurence++;
			}
			// Ako imamo 3 iste to znaci da uslovvraca true tj pobjeda
			if (occurence == 3)
				return true;
			// Ako nije uslov vraca false tj nastavljamosa igrom
			else
				occurence = 0;
		}

		return false;
	}

	// Metoda koja provejerava redove
	public static boolean checkRow(String[][] grid, String s) {

		int occurrence = 0;
		// For petlja prolazi kroz matricu
		for (int i = 0; i < grid.length; i++) {
			for (int k = 0; k < grid[i].length; k++) {
				// Ako matrica sadrzi string s povecavamo razlicte te
				// nastavljamo igur
				if (grid[i][k].contains(s))
					occurrence++;
			}
			// Ako u redu imaju 3 iste znaci da smo pobjedili te nam uslov vraca
			// true
			if (occurrence == 3)
				return true;
			// Ako nema nastavljamo sa igrom
			else
				occurrence = 0;
		}

		return false;
	}

	// Metoda koja provejrava dijagonalu matrice
	public static boolean checkDiagonal(String[][] grid, String s) {

		// Provejravamo od gornjeg lijevog ugla ka donjem desnom uglu
		int occurrence = 0;
		int x = 0;
		int y = 0;
		while (x < grid[0].length && y < grid.length) {
			// Ako matrica sadrzi s povecavamo razlicite
			if (grid[y][x].contains(s))
				occurrence++;
			// Ako imamo 3 iste u dijagonali znaci da smo pobjedili te vracamo
			// true
			if (occurrence == 3)
				return true;
			x++;
			y++;
		}

		// Provjeravamo od donjeg lijevog ka gornjem desnom uglu
		x = 0;
		y = grid.length - 1;
		while (x < grid[0].length && y >= 0) {
			// Ponovo ako matrica sadrzi string s povecavamo razlicite
			if (grid[y][x].contains(s))
				occurrence++;
			// Ako imamo 3 iste u dijagonali znaci pobjeda te nam slov vraca
			// true
			if (occurrence == 3)
				return true;
			y--;
			x++;
		}

		return false;
	}

	public static void main(String[] args) {
		boolean keepPlaying = true;
		boolean isClear;
		// Pravimo Scanner za unos te novu matricu 3x3
		Scanner input = new Scanner(System.in);
		String[][] grid = createGrid(3, 3);
		// Sve dok igra traje
		while (keepPlaying) {
			// Ispisujemo nasu tablicu za igru
			displayGrid(grid);

			do {
				// Trazimo da igraci unesu red i kolone
				mRow = askForRow();
				mColumn = askForColumn();
				// Provjeravamo slobodna mjesta
				isClear = isPositionClear(grid);
				// Ako je mjesto zauzeto ispisuje nam poruku da pokusamo ponovo
				// sa drugm mjestom
				if (!isClear) {
					System.out.println("row: " + mRow + " column: " + mRow + " is already been chosen. Try again.");
				}
			} while (!isClear);

			updateTurn(grid);
			// Ako smo pobjedili
			if (hasWon(grid)) {
				// Ispisujemo tablicu
				displayGrid(grid);
				String player = (isPlayer1Turn) ? "X" : "O";
				// Program nam ispisuje da je neki igrac pobjedio te nas pita da
				// li zelimo ponovo da igramo
				System.out.println("Player " + player + " has won.");
				System.out.print("Do you want to play again? y/n: ");
				String option = input.next();
				keepPlaying = (option.equalsIgnoreCase("y"));
				grid = createGrid(3, 3);
			}
			isPlayer1Turn = !isPlayer1Turn;

		}
		System.out.println("Game ended..");
		// Zatvarmao unos
		input.close();

	}
}
