package Zadaci_11_08_2016;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Zadatak3 {

	public static void main(String[] args) {
		// Koritimo Simple date fromat tj pravimo novi te postavljamo kako ce
		// izgledati format naseg datum i vremena
		SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy HH:mm:ss");
		// Pravimo novi datum
		Date date = new Date();
		// Pravimo string koji ce nam uzimati format tog datuma i vremena te taj
		// string ispisujemo
		// u konzoli
		String time = sdf.format(date);
		// Printamo trenutni datum i vrijeme
		System.out.println("Trenutni datum i vrijeme: " + time);

	}

}
