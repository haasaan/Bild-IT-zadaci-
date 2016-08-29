package Hangman_and_Battleship;

import java.util.Random;
import java.util.Scanner;

public class Battleship {
	// Metoda initBoard pravi nam tablu za igranje igra koristevi matricu te for
	// petljom prolazimo kroz nju
	public static void initBoard(int[][] board) {
		for (int row = 0; row < 5; row++)
			for (int column = 0; column < 5; column++)
				board[row][column] = -1;
	}

	// Metoda koja nam sluzi da ispisemo nasu tablu za igru takodjer koristimo
	// matricu
	public static void showBoard(int[][] board) {
		System.out.println("\t1 \t2 \t3 \t4 \t5");
		System.out.println();
		// Postavljamo da for petlja id do 5
		for (int row = 0; row < 5; row++) {
			System.out.print((row + 1) + "");
			for (int column = 0; column < 5; column++) {
				// Ako su indexi jednaki minus jedan ispsiujemo zafradicu i crtu
				// tako
				// za 0 i jedinicu
				if (board[row][column] == -1) {
					System.out.print("\t" + "~");
				} else if (board[row][column] == 0) {
					System.out.print("\t" + "*");
				} else if (board[row][column] == 1) {
					System.out.print("\t" + "X");
				}

			}
			System.out.println();
		}

	}

	// Metoda koja nam pravi brodice
	public static void initShips(int[][] ships) {
		Random random = new Random();

		for (int ship = 0; ship < 3; ship++) {
			ships[ship][0] = random.nextInt(5);
			ships[ship][1] = random.nextInt(5);

			// Provjeravmo da li smo vec pucali
			// ako jest zavrsavamo dok se ne uzmu dva ara nasumicno izabrana

			for (int last = 0; last < ship; last++) {
				if ((ships[ship][0] == ships[last][0]) && (ships[ship][1] == ships[last][1]))
					do {
						ships[ship][0] = random.nextInt(5);
						ships[ship][1] = random.nextInt(5);
					} while ((ships[ship][0] == ships[last][0]) && (ships[ship][1] == ships[last][1]));
			}

		}
	}

	// Metoda koja nas pita na koji red i kolonu zelimo da odaberemo da pucamo
	public static void shoot(int[] shoot) {
		Scanner input = new Scanner(System.in);

		System.out.print("Row: ");
		shoot[0] = input.nextInt();
		shoot[0]--;

		System.out.print("Column: ");
		shoot[1] = input.nextInt();
		shoot[1]--;

	}

	// Metoda koja porvjerava da li smo pogodili brod ako jesmo pokazuje nam na
	// kojem mjestu
	public static boolean hit(int[] shoot, int[][] ships) {

		for (int ship = 0; ship < ships.length; ship++) {
			if (shoot[0] == ships[ship][0] && shoot[1] == ships[ship][1]) {
				System.out.printf("Pogodili ste brod na mjestu (%d,%d)\n", shoot[0] + 1, shoot[1] + 1);
				return true;
			}
		}
		return false;
	}

	// Metoda koja nambroji pokusaje tj koliko puta imamo jos da pucamo
	public static void hint(int[] shoot, int[][] ships, int attempt) {
		int row = 0, column = 0;

		for (int line = 0; line < ships.length; line++) {
			if (ships[line][0] == shoot[0])
				row++;
			if (ships[line][1] == shoot[1])
				column++;
		}

		System.out.printf("\nPokusaji %d: \nRed %d -> %d brodovi\n" + "Kolona %d -> %d brodova\n", attempt,
				shoot[0] + 1, row, shoot[1] + 1, column);
	}

	// Metoda koja mjenja tablu posle svakog pokusaja
	public static void changeboard(int[] shoot, int[][] ships, int[][] board) {
		if (hit(shoot, ships))
			board[shoot[0]][shoot[1]] = 1;
		else
			board[shoot[0]][shoot[1]] = 0;
	}

	// Main metoda
	public static void main(String[] args) {
		int[][] board = new int[5][5];
		int[][] ships = new int[3][2];
		int[] shoot = new int[2];
		int attempts = 0, shotHit = 0;
		// Implementuemo dvije metode koje prave tablu i brodove
		initBoard(board);
		initShips(ships);

		System.out.println();
		// Prikazuuemo tablu ii suteve i brojimo pokusaje
		do {
			showBoard(board);
			shoot(shoot);
			attempts++;
			// Ako pogodimo neki broj povecavamo brojac
			if (hit(shoot, ships)) {
				hint(shoot, ships, attempts);
				shotHit++;
				// Ako je drugacije samo povecavamo broj pokusaja
			} else
				hint(shoot, ships, attempts);

			changeboard(shoot, ships, board);

		} while (shotHit != 3);

		System.out.println("\n\n\nBattleship Java igra je zavrsena! You hit 3 ships in " + attempts + " attempts");
		showBoard(board);

	}

}
