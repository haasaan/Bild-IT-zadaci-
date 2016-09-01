package Zadaci_31_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
	// Staticna metoda updateFile kojoj prosljedujemo file i name
	private static void updateFilePackage(File file, String name) {
		// metoda koja razdvaja linije stringa
		String lineSeparator = System.getProperty("line.separator");
		String packageString = "package " + name + ";";

		// Citamo fajl
		try (Scanner input = new Scanner(file)) {

			while (input.hasNext()) {

				String s = input.nextLine();
				if (s.equals(packageString)) {
					System.out.println("File: " + file + " vec ima package " + name);
					return; // Zaustavkjamo metodu ako package vec ima fajl
							// header
				}
				packageString += lineSeparator + s;

			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		// Spremamo novi fajl
		try (PrintWriter out = new PrintWriter(file)) {
			out.write(packageString);
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println(packageString);

	}

	public static void main(String[] args) {
		// Novi falj txt
		File mainDir = new File("file.txt");
		// Ako nije direktoriji ispisujemo poruku
		if (!mainDir.isDirectory()) {
			System.out.println(mainDir.getAbsolutePath());
			System.out.println(mainDir + " nije direktoriji.");
			System.exit(2);
		}
		// Ucitajemo niz fajlova iz direktorija
		File[] mainDirFiles = mainDir.listFiles();
		// Ako nema fajlova ispisujemo poruku
		if (mainDirFiles == null) {
			System.out.println("Nisu pronadjeni fajlovi " + mainDir);
			System.exit(3);
		}
		// Lista direktorija
		ArrayList<File> packageDirs = new ArrayList<>();
		for (int i = 0; i < mainDirFiles.length; i++) {
			// Ako je direktorji i ako ima ime i sadrzi dodajemo na listu
			if (mainDirFiles[i].isDirectory() && mainDirFiles[i].getName().contains("Zadaci")) {
				packageDirs.add(mainDirFiles[i]);
			}
		}
		// Ako je package prazan ispisujemo to
		if (packageDirs.isEmpty()) {
			System.out.print("Nismo pronasli nikakav package " + mainDir.getName());
			System.exit(2);
		}
		// Prolazimo kroz direktoriji
		for (File dir : packageDirs) {
			File[] files = dir.listFiles();
			// Ako ima 0 fajlova nastavljamo
			if (files == null)
				continue;

			for (File file : files) {
				// Ako ime fajla sadrzi java updatujemofajl
				if (file.getName().contains(".java")) {
					updateFilePackage(file, dir.getName());
				}
			}
		}

	}

}
