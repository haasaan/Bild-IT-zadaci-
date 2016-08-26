package Zadaci_25_08_2016;

public class TestMyStringBuilder {

	public static void main(String[] args) {
		// Pravimo novi objekat i prosljedujemo mu string
		MyStringBuilder1 s = new MyStringBuilder1("ButtonDemo");
		// Pretvaramo sve u string zatim dodajemo vrijednost 100 i prebacuje sve
		// u string te ispisujemo sve u lower case i pronalazimo substring
		System.out.println(s.toString());
		System.out.println(s.append(100).toString());
		System.out.println(s.toString());
		System.out.println("lowercase = " + s.toLowerCase());
		System.out.println("substring 0 3: " + s.substring(0, 3));

	}

}
