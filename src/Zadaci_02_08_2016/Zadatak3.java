package Zadaci_02_08_2016;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) throws IOException {
		// Uzimamo fajl koji vec postoji tzv file
		File file = new File("file.txt");
		Scanner input = new Scanner(file);
		// Pravimo tri varijable koje cemo kosristit da brojimo linije slova i
		// karaktere
		int numberOfChars = 0;
		int numberOfLines = 0;
		int numberOfWords = 0;
		while (input.hasNext()) {
			// Ovdje uzimamo liniju fajla
			String str = input.nextLine();
			// Brojimo karaktere

			numberOfChars += str.length();

			numberOfLines++;
			// Razdvajamo liniju da dpbijemom broj rijeci

			String[] array = str.split(" ");
			numberOfWords = array.length;
		}
		input.close();

		System.out.println("Broj karaktera " + numberOfChars);
		System.out.println("Broj linija " + numberOfLines);
		System.out.println("Broj rijeci " + numberOfWords);
	}

}
