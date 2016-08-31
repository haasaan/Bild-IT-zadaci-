package Zadaci_30_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
	// Pravimpo metodu string tipa koja generise nasumicne brojeve
	public static String randomNumbers(int size) {

		String s = "";
		for (int i = 0; i < size; i++) {
			s += " " + (int) (Math.random() * 100);
		}

		return s;
	}

	public static void main(String[] args) {
		// cPravimo nasumican broj poena da testiramo zadatak
		int numberOfScores = (int) (Math.random() * 100 + 100);
		// Try blok u kojem pokusajemo ispisat poene u scoes file i ispisat da
		// je spremljeno
		try {
			PrintWriter output = new PrintWriter("scores.txt");
			output.write(randomNumbers(numberOfScores));
			output.close();
			System.out.println("Spremljeno " + numberOfScores + " poeni na scores.txt");
			// Hvatamo exception
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Pravimo skene i tratimo od korisnika da unese ime fajla
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite ime fajla: ");
		File filename = new File(input.next());
		input.close();
		// Ako fajl ne postoji ispisujemo poruku da ne postiji
		if (!filename.exists()) {
			System.out.println(filename + " taj fajl ne postoji.");
			System.exit(1);
		}
		// Pravimo array listu u koju spremamo broj poena
		ArrayList<Integer> scores = new ArrayList<>();
		try {
			input = new Scanner(filename);
			while (input.hasNextInt()) {
				scores.add(input.nextInt());
			}
			// Ispisujemo broj poena u try bloku
			System.out.println("Ucitajemo " + scores.size() + " poena iz  " + filename);
			// Hvatamo gresku ako se pojavi ispisujemo da ne moze ocitat poene
		} catch (FileNotFoundException ex) {

			System.out.println("Problem pri ucitavanju " + filename);
			ex.printStackTrace();
		}
	}

}
