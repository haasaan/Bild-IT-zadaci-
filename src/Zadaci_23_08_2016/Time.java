package Zadaci_23_08_2016;

public class Time {
	// Pravimo tri privatna datefielda
	public long hour;
	public long minute;
	public long second;

	// Konstruktor kome ne prosljedjujemo argument
	public Time() {
		// Racunamo milisenkunde
		long totalSeconds = System.currentTimeMillis() / 1000;
		// Racunamo minute
		long totalMinutes = totalSeconds / 60;
		// Racunamo sate
		long totalHours = totalMinutes / 60;
		// Ovaj sat je jednak ukupnim satima podjeljeno sa 24
		this.hour = totalHours % 24;
		// Ove minute jendako ukupne izracunate minute podjeljeno sa 60
		this.minute = totalMinutes % 60;
		// I ove sekunde je jednako ukupne sekunde podjeljeno sa 60
		this.second = totalSeconds % 60;

	}

	// Ponovo konstruktor kome prosljedjuemo argumente nase data fieldove
	public Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// Konstruktor kome prosljedujemo argument prolazno vrijeme
	public Time(long elapseTime) {
		// racunao ukupne sekunde
		long totalSeconds = elapseTime / 1000;
		// Ukupne minute
		long totalMinutes = totalSeconds / 60;
		// Ukupne sate
		long totalHours = totalMinutes / 60;
		this.hour = totalHours % 24;
		this.minute = totalMinutes % 60;
		this.second = totalSeconds % 60;

	}

	// Getteri za privatne data fieldove preko kojih pravimo da nasi data
	// fieldovi budu vidljivi i u testnoj klasi
	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

}
