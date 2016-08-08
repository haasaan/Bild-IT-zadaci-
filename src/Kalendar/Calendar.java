package Kalendar;

public class Calendar {
	// Pravimo scanner
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// Unosimo mjesec
		int month = checkMonth();
		// Unosimo godinu
		int year = checkYear();

		// Pozivamo metodu da prikazemo kalendar za odredjenji mjesec i godinu

		showCalendar(month - 1, year);

	}

	// metoda za prikaz kalendara
	public static void showCalendar(int month, int year) {
		// kreiramo instanacu kalendara
		java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();
		// Postavljamo godinu i mjesec na vrijednosti koje proslijedimo

		calendar.set(java.util.Calendar.MONTH, month);
		calendar.set(java.util.Calendar.YEAR, year);

		// Pravimo naziv mjeseci
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		// Ipsiujemo mjesece godinu i dane
		System.out.printf("%13s, %d\n", months[month], year);
		System.out.println("----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

		// Postavljamo redni broj sa kojem pocinje kalendar
		int brojac = calendar.get(java.util.Calendar.DAY_OF_WEEK) - 1;

		for (int i = 0; i < brojac; i++) {
			System.out.print("    ");
		}

		for (int i = 1; i <= numOfDaysInMonth(month, year); i++) {
			// ako su ispisani dani jedne sedmice, predji u novi red
			if (brojac % 7 == 0) {
				System.out.println();
			}
			// Ispisujemo dan

			System.out.printf("  %2d", i);
			brojac++; //
		}
		System.out.println();
	}

	// Pravimo metodu koja vraca broj dana u mjesecu
	public static int numOfDaysInMonth(int month, int year) {
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// Koristimo uslov i racunamo ako je godina prestupna
		if (isLeapYear(year) && month == 1)
			return 29;
		else
			return daysInMonth[month];
	}

	// Metoda koja provjerava da li je godina prijestupna
	public static boolean isLeapYear(int year) {

		if ((year >= 1582) && (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)))
			return true;
		else if (year >= 8 && year < 1582 && year % 4 == 0)
			return true;
		else if (year > -45 && year <= -9 && year % 3 == 0)
			return true;
		return false;
	}

	// Pravimo metodu za provjeru mjeseca
	public static int checkMonth() {
		int month = 0;
		do {
			System.out.println("Unesite zeljeni mjesec");
			while (!input.hasNextInt()) { // sve dok unos nije int
				System.out.println("Unesite zeljeni mjesec");
				input.next();
			}
			month = input.nextInt();
		} while (month <= 0 || month > 12);
		return month;
	}

	// Pravimo metodu koja provjerava godinu
	public static int checkYear() {
		int year;
		do {
			System.out.println("Unesite zeljenu godinu ");
			while (!input.hasNextInt()) { // sve dok unos nije int
				System.out.println("Unesite zeljenu godinu");
				input.next();
			}
			year = input.nextInt();
		} while (year <= 0);
		return year;
	}

}
