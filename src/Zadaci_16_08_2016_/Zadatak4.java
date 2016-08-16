package Zadaci_16_08_2016_;

import java.util.Date;

public class Zadatak4 {
	// Metoda koja vraca trenutni datum i vrijeme
	public static Date currentDateAndTime() {
		// Pravimo objekt dateAndTime i dodajemo novi datum tj trenutni datum i
		// vrijeme
		Date dateAndTime = new Date();
		// Vracamo taj objekt kojem smo dodijelili ztrenutni datum i vrijeme
		return dateAndTime;

	}

	public static void main(String[] args) {
		// Printamo trenutni datum i vrijeme pozivajuci metodu
		// currentDateAndTime
		System.out.println("Trenutacno datum i vrijeme je: ");
		System.out.println(currentDateAndTime());

	}

}
