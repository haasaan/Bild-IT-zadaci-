package Zadaci_02_09_2016;

import java.util.Calendar;

public class Zadatak1 {

	private static MyCalendar calendar;

	/** Main method */
	public static void main(String[] args) {

		int year;
		if (args.length == 1) {
			year = Calendar.getInstance().get(Calendar.YEAR);
		} else {
			year = new Integer(args[1]);
		}
		int month = Integer.parseInt(args[0]) - 1;
		calendar = new MyCalendar(year, month, 1);
		calendar.set(Calendar.DATE, 1);

		printMonth();
	}

	/** Printamomjesec u godini */
	public static void printMonth() {
		// Zaglavlje
		printMonthTitle();

		// Tijelo kalendara
		printMonthBody();
	}

	/** Printamo naslov, e.g., May, 1999 */
	public static void printMonthTitle() {
		System.out.println("         " + calendar.getMonthName() + " " + calendar.get(Calendar.YEAR));
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}

	/** Printamo tijelo */
	public static void printMonthBody() {
		// Startni dan u sedmici
		int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;

		// Broj dana u mjesecu
		int numberOfDaysInMonth = calendar.daysInMonth();

		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print("    ");

		for (i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);

			if ((i + startDay) % 7 == 0)
				System.out.println();
		}

		System.out.println();
	}

}
