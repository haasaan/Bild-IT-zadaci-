package Zadaci_25_08_2016;

public class TestMyString1 {

	public static void main(String[] args) {
		// Objekat kome prosljedujemo neku vrijednost
		MyString1 num = MyString1.valueOf(987654321L);
		// Printamo tu vrijednost kao karaktere
		System.out.println(num.toChars());
		// Drugi objekat prosljedjuemo string
		MyString1 s = new MyString1("Test123");
		// Printamo duzinu karakter na indexu i jednakost stringa preko metodi
		// iz MyString1 klase
		System.out.println(s.length());
		System.out.println(s.charAt(1));
		System.out.println(s.equals(new MyString1("Test123")));
		System.out.print(MyString1.valueOf(345).toChars());

	}

}
