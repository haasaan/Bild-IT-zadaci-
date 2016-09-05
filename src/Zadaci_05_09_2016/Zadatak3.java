package Zadaci_05_09_2016;

import Zadaci_05_09_2016.BigRational;
import java.util.ArrayList;

public class Zadatak3 {

	public static void main(String[] args) {
		String[] token = getTokens(args);
		// Pravimo niz stringova
		// Ako je duzina razlicita od 3 ili nije validan operator ispisujemo da
		// argumenti nisu validni
		if (token.length != 3 || !isValidOperator(token)) {
			System.out.println("Argumenti nisu validni.");
			System.exit(1);
		}
		// Pravimo dva objekta
		BigRational operand1 = new BigRational(token[0]);
		BigRational operand2 = new BigRational(token[2]);
		// Postavljamo da je odgovor jednak nuli
		BigRational answer = null;
		switch (args[1]) {
		// Ako je jednak plusu dodajemo na listu i
		case "+":
			answer = operand1.add(operand2);
			break;
		// Ako je u pitanju znak minus oduzimamo
		case "-":
			answer = operand1.subtract(operand2);
			break;
		// Ako je u piranju zvijezdica mnozimo
		case "*":
			answer = operand1.multiply(operand2);
			break;
		case "/":
			// Ako je u pitanju kosa crta dijelimo
			answer = operand1.divide(operand2);
			break;
		}

		System.out.println(operand1 + " " + args[1] + " " + operand2 + " = " + answer);
	}

	// Metoda koja provjerava da li je operator sa kojim radimo validan
	private static boolean isValidOperator(String[] token) {

		return token[0].matches("[\\d]*[0-9]/[\\d]*[0-9]") && token[1].matches("[\\-\\+\\*\\/]")
				&& token[2].matches("[\\d]*[0-9]/[\\d]*[0-9]");
	}

	// Metoda koja pravi tokene
	private static String[] getTokens(String[] strings) {
		String merged = " ";
		for (String s : strings) {
			merged += " " + s;
		}

		String[] tokens = merged.split("[\\s ]");
		ArrayList<String> temp = new ArrayList<>();
		// Brisamo prazna mjesta
		for (String s : tokens) {
			if (s.length() != 0) {
				temp.add(s);
			}
		}
		return temp.toArray(new String[temp.size()]);

	}

}
