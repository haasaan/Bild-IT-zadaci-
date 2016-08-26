package Zadaci_25_08_2016;

public class TestCharacter {
	public static void main(String[] args) {
		// Pravimo objekat ch kome prosljedujemo karakter L
		MyCharacter ch = new MyCharacter('L');
		// Metoda get karatker te printamo da li je slovo ili broj i da li su
		// karakteri jednaki
		System.out.println("ch = " + ch.getChar());
		System.out.println("Is a letter: " + ch.isLetter());
		System.out.println("Is a digit: " + ch.isDigit());
		System.out.println("L == L ?" + ch.equals(new MyCharacter('L')));
	}
}
