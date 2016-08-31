package Zadaci_30_08_2016;

public class Zadatak1 {
	// Metoda koja nam throwa numberformatException
	public static int bin2Dec(String binary) throws NumberFormatException {
		// Ako je stringrazlicit onda bacamo exception da string nije binaran
		// broj
		if (!isBinary(binary)) {
			throw new NumberFormatException(binary + " is not a binary number.");
		}

		int power = 0;
		int decimal = 0;
		// Prlazimo duzinu stringa
		for (int i = binary.length() - 1; i >= 0; i--) {
			// Ako je karakter na indexu i jednak 1 onda sabiramo decimale
			// koristeci math.pow metodu
			if (binary.charAt(i) == '1') {
				decimal += Math.pow(2, power);
			}
			power++;
		} // Vracamo decimalu
		return decimal;
	}

	public static boolean isBinary(String binary) {
		// For each petlja preko koje string prebacujemo u niz karaktera
		for (char ch : binary.toCharArray()) {
			// ako je karakter razlicit od jedan i razlicit od 0 vracamo false
			if (ch != '1' && ch != '0')
				return false;
		}
		// Ako je drugacije vracamo true
		return true;
	}

	public static void main(String[] args) {
		// Pozivamo metodu ii ispisujemo
		System.out.println(bin2Dec("1100100"));
		// Purposely throwing an exception...
		System.out.println(bin2Dec("lafkja"));
	}

}
