package Zadaci_25_08_2016;

public class MyStringBuilder1 {
	private char[] buffer;

	// Konstruktor koji prima argument niz karaktera
	public MyStringBuilder1(char[] chars) {
		buffer = new char[chars.length];

		System.arraycopy(chars, 0, buffer, 0, chars.length);
	}

	// Ponovo konstruktor kojem prosljedujemo string kao argument
	public MyStringBuilder1(String s) {
		this(s.toCharArray());
	}

	// Metoda koja spaja string sa vrijednostima
	public MyStringBuilder1 append(int i) {

		String temp = "";
		while (i > 0) {
			temp = i % 10 + temp;
			i /= 10;
		}
		return new MyStringBuilder1(toString() + temp);
	}

	// Koristimo metodu append koja spaja dva stringa
	public MyStringBuilder1 append(MyStringBuilder1 s) {

		return new MyStringBuilder1(toString() + s.toString());
	}

	// Metoda koja pravi novi string
	public String toString() {
		return new String(buffer);
	}

	// Provjeravamo duzinu preko metode length
	public int length() {
		return buffer.length;
	}

	// Provejravamo indexe u nizu karaktera
	public char charAt(int i) {
		return buffer[i];
	}

	// Perbacujemo niz karaktera u malaslova preko metode to lower case
	public MyStringBuilder1 toLowerCase() {
		char[] lower = new char[buffer.length];

		for (int i = 0; i < buffer.length; i++) {
			char old = buffer[i];
			if (old >= 'A' && old <= 'Z') {
				lower[i] = (char) (old - 'A' + 'a');
			} else {
				lower[i] = old;
			}
		}
		return new MyStringBuilder1(lower);
	}

	// Pronalazimo substring
	public MyStringBuilder1 substring(int begin, int end) {

		char[] temp = new char[end - begin];
		for (int i = begin; i < end; i++) {
			temp[i - begin] = buffer[i];
		}

		return new MyStringBuilder1(temp);
	}

	// Preko metode insert ubacujemo u niz karaktera duzinu prvog i drugog
	// stringa
	public MyStringBuilder1 insert(int offset, MyStringBuilder1 s) {
		char[] temp = new char[s.length() + buffer.length];
		for (int i = 0; i < offset; i++) {
			temp[i] = buffer[i];
		}

		for (int i = 0; i < s.length(); i++) {
			temp[offset + i] = s.charAt(i);

		}
		for (int i = offset + s.length(); i < temp.length; i++) {
			temp[i] = buffer[offset++];
		}

		return new MyStringBuilder1(temp);
	}

	// Metoda koja okrece nas string unazad
	public MyStringBuilder1 reverse() {
		char[] reverse = new char[buffer.length];

		int start = 0;
		for (int i = buffer.length - 1; i >= 0; i--) {
			reverse[i] = buffer[start++];
		}
		return new MyStringBuilder1(reverse);
	}

	// Substring stringa
	public MyStringBuilder1 substring(int begin) {
		return substring(begin, buffer.length);
	}

	// Pretvaramo nas niz karaktera u velika slova
	public MyStringBuilder1 toUpperCase() {

		char[] temp = new char[buffer.length];

		for (int i = 0; i < buffer.length; i++) {
			char ch = buffer[i];
			if (ch >= 'a' && ch <= 'z') {
				temp[i] = (char) (ch - 'a' + 'A');
			} else {
				temp[i] = ch;
			}
		}
		return new MyStringBuilder1(temp);
	}

}
