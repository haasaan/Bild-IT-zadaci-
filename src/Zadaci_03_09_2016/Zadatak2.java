package Zadaci_03_09_2016;

public class Zadatak2 {

	public static void main(String[] args) {
		// Dva objekta rectangle kome prosljedjujemo sirinu i visinu te ih
		// poredimo
		Rectangle rec1 = new Rectangle(10, 10);
		Rectangle rec2 = new Rectangle(10, 10);
		System.out.println(rec1.equals(rec2));
		System.out.println(rec1.compareTo(rec2));

	}

}
