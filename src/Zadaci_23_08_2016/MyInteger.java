package Zadaci_23_08_2016;

public class MyInteger {
	private int value;

	// Konstruktor kome prosljedujemo argument value
	public MyInteger(int value) {
		this.value = value;
	}

	// Getter i setter za data field value
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	// Da li je broj paran
	public boolean isEven() {
		return value % 2 == 0;
	}

	// Da li je broj neparan
	public boolean isOdd() {
		return !isEven();
	}

	// Da li je broj prost
	public boolean isPrime() {
		double range = Math.sqrt(value);
		for (int i = 2; i < range; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}

	// Boolean da li je broj paran
	public static boolean isEven(int value) {
		return value % 2 == 0;
	}

	// Boolean da li je broj neparan
	public static boolean isOdd(int value) {
		return !isEven(value);
	}

	// Boolean da li je broj prost
	public static boolean isPrime(int value) {
		double range = Math.sqrt(value);

		for (int i = 2; i < range; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}

	// Provejravamo da li je integeer paran
	public static boolean isEven(MyInteger myInteger) {
		return myInteger.isEven();
	}

	// Da li je integer neparan porsljedjuemo objekat
	public static boolean isOdd(MyInteger myInteger) {
		return myInteger.isOdd();
	}

	// Da li je prost takodjer objekat
	public static boolean isPrime(MyInteger myInteger) {
		return myInteger.isPrime();
	}

	// Provjeravamo da li su vrijednosti jednake
	public boolean equals(int value) {
		return this.value == value;
	}

	public boolean equals(MyInteger myInteger) {
		return this.value == myInteger.value;
	}

	// Pretvaramo niz numerickih karakte u int tip
	public static int parseInt(char[] value) {

		double valueDouble = 0;
		int toPower = value.length - 1;
		for (char aValue : value) {

			valueDouble += Math.pow(10, toPower--) * (aValue - '0');
		}

		return (int) valueDouble;
	}

	public static int parseInt(String value) {

		return MyInteger.parseInt(value.toCharArray());
	}

}
