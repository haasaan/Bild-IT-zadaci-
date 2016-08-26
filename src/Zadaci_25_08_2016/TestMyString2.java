package Zadaci_25_08_2016;

public class TestMyString2 {

	public static void main(String[] args) {
		System.out.println(new MyString1("Hello World").toChars());
		// Dva objekta iz MyString1 kllase kojima prosljedujemo 2 stringa
		MyString1 s1 = new MyString1("test123");
		// Provjeravamo jednakost stringova vrijednost promjenutih upercase i
		// vrijednost true za tringove takodjer preko metodi iz MyString1 klase
		MyString1 s2 = new MyString1("test123");
		System.out.println("s1 = " + s1.toString());
		System.out.println("s2 = " + s2.toString());
		System.out.println("Is s1 equal to s2? " + s1.compare(s2));
		System.out.println(
				"Value of false changed to uppercase = " + (MyString1.valueOf(false).toUpperCase().toString()));
		System.out.println("Value of true = " + (MyString1.valueOf(true).toString()));

	}

}
