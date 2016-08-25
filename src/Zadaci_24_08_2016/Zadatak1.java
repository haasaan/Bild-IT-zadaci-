package Zadaci_24_08_2016;

import java.math.BigDecimal;

public class Zadatak1 {

	public static void main(String[] args) {
		String numString = "" + 1;
		// Pravimo brojeve sa 50 decimala
		for (int i = 0; i < 49; i++) {

			numString += "0";
		}
		// Koristimo metodu BigDecimal i implementiramo nas string u kojem smo
		// napravili 50 decimala
		BigDecimal hugeNum = new BigDecimal(numString);
		int hugeNumCount = 0;
		while (hugeNumCount < 10) {

			// Provjeravamo da li je nas veliki broj djeljiv sa 2 i 3
			BigDecimal remainder2 = hugeNum.remainder(new BigDecimal(2));
			BigDecimal remainder3 = hugeNum.remainder(new BigDecimal(3));
			if (remainder2.equals(BigDecimal.ZERO) || remainder3.equals(BigDecimal.ZERO)) {
				hugeNumCount++;
				System.out.println(hugeNumCount + ": " + hugeNum);
			}
			hugeNum = hugeNum.add(BigDecimal.ONE);
		}
	}

}
