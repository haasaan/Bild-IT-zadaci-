package Zadaci_30_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak4 {
	public static void main(String[] args) {
		// Novi filete provjeravamo da li postoji
		File file = new File("file.txt");
		if (!file.exists()) {
			System.out.println(file + " does not exist.");
			System.exit(2);
		}

		int characters = 0;
		int words = 0;
		int lines = 0;
		// Pokusajemou try bloku preko varijabli da brojimo karaktere rijeci i
		// linije
		try {
			Scanner input = new Scanner(file);
			while (input.hasNext()) {
				String s = input.nextLine();
				lines++;
				characters += s.length();
				String[] split = s.split(" ");
				for (String word : split) {
					words++;
				}
			}
			// Ako ne uspije try block u catch blocku hvatamo exception da file
			// nije pronadjen te ispisujemo to
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}

		System.out.println("Characters: " + characters);
		System.out.println("Words: " + words);
		System.out.println("Lines: " + lines);

	}
}
