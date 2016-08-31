package Zadaci_30_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// Ako je duzina razlicita od 2 ispisujemo da nisu validni argumenti
		if (args.length != 2) {
			System.out.println("Argumenti nius validni.");
			System.exit(1);
		}

		// Provjeravamo da li filename postoji
		File filename = new File("file.txt");
		if (!filename.exists()) {
			System.out.println(args[1] + " ne postoji.");
			System.out.println(2);
		}

		// Kreiramo intpu i output argumenata
		String s = "";
		try {
			Scanner input = new Scanner(filename);
			while (input.hasNext()) {
				s += input.nextLine();
			}
			// Hvatamo da li je file pronadjen
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		s = s.replaceAll(args[0], "");
		// Pokusajemo ispisati file
		try {
			PrintWriter output = new PrintWriter(filename);
			System.out.println(s);
			output.write(s);
			output.close();
			// Ponovo hvatamo exception ako fajl nije pronadjen
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Zavrseno");

	}

}
