package Zadaci_01_09_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Unosimo godinu
		System.out.print("Enter year: ");
		String year = input.next();
		// Unosimo rod
		System.out.print("Enter gender: ");
		String gender = input.next();
		// Unosimo ime
		System.out.print("Enter name: ");
		String name = input.next();
		input.close();
		// Pravimo novi fajl
		File file = new File("babynamesranking" + year + ".txt");
		// Ako fajl ne postoji ispisujemo poruku
		if (!file.exists()) {
			System.out.println("Nista nije zabiljezeno za tu godinu " + year);
			System.exit(1);
		}

		int rank = 0;
		// Try blok pokusajemo ucitati fajl
		try {
			Scanner read = new Scanner(file);
			while (read.hasNext()) {
				// Splitujemo string
				String s = read.nextLine();
				String[] temp = s.split(" ");
				// Ako je rod jednak M i sadrzi ime dodajemo na rank
				if (gender.equalsIgnoreCase("M") && temp[1].contains(name))
					rank = new Integer(temp[0]);
				// Ako je rugacije dodajemo na drugi rank
				else if (temp[3].contains(name))
					rank = new Integer(temp[0]);
			}
			read.close();
			// Hvatamo exception
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Ako je rank jednak 0 ispsujemo da ime nije zabiljezeno za tu godinu
		// ako je drugacije onda ispisujemo da je ime zabiljezeno za tu godinu
		if (rank == 0) {
			System.out.println("Ime " + name + " nije zabiljezeno za tu godinu " + year);
		} else {

			System.out.println(name + " je rankovano #" + rank + " u godini " + year);
		}

	}

}
