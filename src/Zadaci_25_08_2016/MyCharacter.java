package Zadaci_25_08_2016;

public class MyCharacter {
	// Private data field tipa char
	private char ch;

	// Kostruktor kome prosjedjuemo nas karakter
	public MyCharacter(char ch) {
		this.ch = ch;
	}

	// Prvjeravao da li je nas karater broj
	public static boolean isDigit(char ch) {
		return ch <= '9' && ch >= '0';
	}

	// Provjeravamo da li je nas karatkter napisan malim slovima
	public static boolean isLowerCase(char ch) {

		return (ch <= 'z' && ch >= 'a');
	}

	// Provjeravamo da li je napisan velikim slovima
	public static boolean isUpperCase(char ch) {
		return (ch <= 'Z' && ch >= 'A');
	}

	// Provjeravamo da li je nas karakter slovo
	public static boolean isLetter(char ch) {
		return (ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A');
	}

	// Provjeravamo da li je nas karakter ili slovo ili broj
	public static boolean isLetterOrDigit(char ch) {
		return isLetter(ch) || isDigit(ch);
	}

	// Provjeravamo da li je nas karakter velikim slivima
	public static char toUpperCase(char ch) {
		if (isLowerCase(ch)) {
			return (char) (ch - 'a' + 'A');
		} else {
			return ch;
		}
	}

	// Provjeravamo da li je nas karakter pisan malim slovima
	public static char toLowerCase(char ch) {
		if (isUpperCase(ch)) {
			return (char) (ch - 'A' + 'a');
		} else {
			return ch;
		}
	}

	// Bollean dali je broj true ili fakse
	public boolean isDigit() {
		return isDigit(ch);
	}

	// Boolean da li je slovo
	public boolean isLetter() {
		return isLetter(ch);
	}

	// Getter za nas private data field kako bi ogli korisiti u tets klasi
	public char getChar() {
		return ch;
	}

	// Poredimo nase karaktere preko metode compare
	public int compareTo(MyCharacter ch) {
		return this.ch - ch.getChar();
	}

	// Provjeravamo jednakost karaktera
	public boolean equals(MyCharacter ch) {
		return this.ch == ch.getChar();
	}

}
