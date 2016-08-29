package Hangman_and_Battleship;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		File file = new File("file.txt");
		try {
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				String line = input.nextLine();
				list.add(line);
			}
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Nasumicno biramo rijeci iz fajla
		Random rng = new Random();
		int word = rng.nextInt(list.size()); //
		Scanner scanner = new Scanner(System.in);
		int guessesLeft = 6;
		// Broj pokusaja koliko igrac ima tj koliko slova smije da iskoristi
		ArrayList<Character> alreadyGuess = new ArrayList<Character>();
		boolean wordFound = false; // Pratimo kada ce igra zavrsiti
		// i kada igrac ispuca slova

		// Pretvaramo int vrijednosti u nasumicno izabrane ridjeci u string
		String wordSelected = list.get(word);
		// Pervaramo rijeci u karatktere tj slova
		char[] letters = wordSelected.toCharArray();
		// Uzimamo duzinu skrivene rojeci
		char[] hideWord = new char[letters.length];

		// for petlja sakriva rjeci i slova zamjenjuje sa crtom
		for (int i = 0; i < letters.length; i++) {
			hideWord[i] = '_';
		}

		/*
		 * Igra krece i igra se sve dok se petlja vrti
		 */

		while (true) {

			System.out.print("\n" + "Rijec: ");
			for (int i = 0; i < letters.length; i++) {
				System.out.print(hideWord[i]);
			} // Ispisujemo rijec

			// Korisnik moze da pogadja i program mu ispisuje koliko mu je jos
			// sansi ostalo i da li je vecpogodio to slovo
			System.out.print("\n" + "Preostalo pokusaja: " + guessesLeft + "\nVec ste pogodili: " + alreadyGuess
					+ "\nPogodjeno: ");
			char userInput = scanner.nextLine().toUpperCase().charAt(0);

			// Prvovjeravamo da li je igrac vec pogodio slovo
			for (int i = 0; i < alreadyGuess.size(); i++) {
				if (userInput == alreadyGuess.get(i)) {
					System.out.println("\nVec ste pogodili to slovo pokusajte ponovo . ");
					break;
				}
			}

			// Checks if the user guesses the right letter in the word
			for (int i = 0; i < letters.length; i++) {
				if (userInput == letters[i]) {
					hideWord[i] = userInput;
					wordFound = true;

				}
				// Program pamti pogodjena slova
				if (!(alreadyGuess.contains(userInput))) {
					alreadyGuess.add(userInput);
				}

			}

			// Ako igrac unese slovo koje ne sadrzi skrivena rijec ispisuje mu
			// poruku i smanjuje mu broj sansi za 1
			if (!wordFound) {
				System.out.println("\nSlovo nije pronadjeno \n");
				guessesLeft -= 1;
			}

			wordFound = false; // Vracamo pronadjenu rijec na false

			// Ako igrac ostane pez pokusaja onda je izgubio
			if (guessesLeft <= 0) {
				System.out.println("\nIzgubili ste. Objesili ste se xD.");
				break;
			}

			// Ako igrac pogodi tacnu rijec onda je pobjedio. Koristimo array
			// klasu da uporedimo dva niza karaktera
			if (Arrays.equals(letters, hideWord)) {
				System.out.println("\nRijec je: " + wordSelected);
				System.out.println("\nCestitamo pobijedili ste. Spasili se se ");
				break;
			}

		}
		// Zatvaramo unos
		scanner.close();
	}
}
