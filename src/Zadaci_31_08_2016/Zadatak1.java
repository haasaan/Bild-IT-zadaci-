package Zadaci_31_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadatak1 {
	// Metoda koja pronalazi indexe u stringu
	public static int getIndex(String s, char ch) {

		for (int i = 0; i < s.length(); i++) {
			if (ch == s.charAt(i)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// Postavljamo file ako file ne postoji ispisujemo poruku
		File filename = new File("file.txt");
		if (!filename.exists()) {
			System.out.println(filename + " ne postoji.");

		}
		// Pravimo novi string builder te u try bloku pokusavamo unijet ime
		// fajla
		StringBuilder buffer = new StringBuilder();
		try {
			Scanner input = new Scanner(filename);
			while (input.hasNext()) {
				String s = input.nextLine();
				// Ako string sadrzi zagrade onda buffer postavljamo sa spaceom
				// prije zagrade
				if (s.contains("{")) {
					buffer.append(" {");
				} else {
					// Ako nije onda printamo ponovo space plus string
					buffer.append("\n" + s);
				}
			}
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			// Pretvaramo buffer u string te u catch blocku hvatamo exception i
			// ispisujemo buffer
			PrintWriter output = new PrintWriter(filename);
			output.write(buffer.toString());
			output.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(buffer);
	}

}
