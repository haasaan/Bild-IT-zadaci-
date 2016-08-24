package Zadaci_23_08_2016;

public class TestTime {

	public static void main(String[] args) {
		// Novi objekat time i prosljedjuemo mu odredjeni broj
		Time time = new Time(555550000);
		// Printamo sat minute i sekunde
		System.out.println(time.hour + ":" + time.minute + ":" + time.second);

	}

}
