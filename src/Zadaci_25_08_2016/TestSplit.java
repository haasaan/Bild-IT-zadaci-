package Zadaci_25_08_2016;

public class TestSplit {

	public static void main(String[] args) {
		// Pravimo objekat i prosljedujemo mu string te pozivamo metodu iz
		// MyString1 klase split i splitujemo string te ga printamo
		String[] temp1 = MyString1.split("WordAttachedlolol", "Attached");
		for (String s : temp1) {
			System.out.println(s);
		}
		// Ponovo ravimo objekat i prosljedujemo string te ga splitujemo i
		// dobijamo slogovan string tj nasstring u slogovima
		String[] temp2 = MyString1.split("Wor#dAt#tac#he#dl#ol#ol", "#");
		for (String s : temp2) {
			System.out.println(s);

		}

	}
}
