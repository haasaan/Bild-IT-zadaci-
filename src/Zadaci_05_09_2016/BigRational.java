package Zadaci_05_09_2016;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigRational extends Number implements Comparable<BigRational> {
	// Data fieldovi za numerator i denominator
	private BigDecimal numerator = BigDecimal.ZERO;
	private BigDecimal denominator = BigDecimal.ONE;

	// Default no args konstruktor
	public BigRational() {
		this(BigDecimal.ZERO, BigDecimal.ONE);
	}

	// Konstruktor kome porsljedujemo data fieldove kao argumente
	public BigRational(BigDecimal numerator, BigDecimal denominator) {
		BigDecimal gcd = gcd(numerator, denominator);
		this.numerator = ((denominator.compareTo(BigDecimal.ZERO) > 0) ? BigDecimal.ONE : new BigDecimal(-1))
				.multiply(numerator).divide(gcd);
		this.denominator = denominator.abs().divide(gcd);
	}

	public BigRational(String decimal) {

		int index = (decimal.contains(".")) ? decimal.indexOf('.') : decimal.indexOf('/');
		BigDecimal d;
		BigDecimal n;
		// Ako je string u decimalnoj formi
		if (decimal.contains(".")) {
			int power = decimal.substring(index + 1, decimal.length()).length();
			d = new BigDecimal(Math.pow(10, power));
			n = new BigDecimal(new StringBuilder(decimal).deleteCharAt(index).toString());
		} else {
			// Ako string sadrzi '/'
			n = new BigDecimal(decimal.substring(0, index));
			d = new BigDecimal(decimal.substring(index + 1, decimal.length()));
		}

		BigDecimal gcd = gcd(n, d);
		this.numerator = ((d.compareTo(BigDecimal.ZERO) > 0) ? BigDecimal.ONE : new BigDecimal(-1)).multiply(n)
				.divide(gcd);
		this.denominator = d.abs().divide(gcd);

	}

	// Najmanji zajedniccki
	private static BigDecimal gcd(BigDecimal n, BigDecimal d) {
		BigDecimal n1 = n.abs();
		BigDecimal n2 = d.abs();

		BigDecimal remainder = n1.remainder(n2);
		while (remainder.compareTo(BigDecimal.ZERO) > 0) {
			n1 = n2;
			n2 = remainder;
			remainder = n1.remainder(n2);
		}

		return n2;
	}

	// Vracamo numerator
	public BigDecimal getNumerator() {
		return numerator;
	}

	// Vracamo denominator
	public BigDecimal getDenominator() {
		return denominator;
	}

	// Dodajemo racionalne brojeve
	public BigRational add(BigRational secondBigRational) {
		BigDecimal n1 = numerator.multiply(secondBigRational.getDenominator());
		BigDecimal n2 = denominator.multiply(secondBigRational.getNumerator());
		BigDecimal n = n1.add(n2);

		BigDecimal d = denominator.multiply(secondBigRational.getDenominator());
		return new BigRational(n, d);
	}

	// Subtraktujemo racionalne brojeve
	public BigRational subtract(BigRational secondBigRational) {
		BigDecimal n1 = numerator.multiply(secondBigRational.getDenominator());
		BigDecimal n2 = denominator.multiply(secondBigRational.getNumerator());
		BigDecimal n = n1.subtract(n2);

		BigDecimal d = denominator.multiply(secondBigRational.getDenominator());
		return new BigRational(n, d);
	}

	// Umnozajemo racionalne brojeve
	public BigRational multiply(BigRational secondBigRational) {
		BigDecimal n = numerator.multiply(secondBigRational.getNumerator());
		BigDecimal d = denominator.multiply(secondBigRational.getDenominator());
		return new BigRational(n, d);
	}

	// Dijelimo racionalne brojeve
	public BigRational divide(BigRational secondBigRational) {
		BigDecimal n = numerator.multiply(secondBigRational.getDenominator());
		BigDecimal d = denominator.multiply(secondBigRational.numerator);
		return new BigRational(n, d);
	}

	@Override
	public String toString() {
		if (denominator.equals(BigDecimal.ONE))
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}

	@Override // Overajdamo equals metodu
	public boolean equals(Object other) {
		if ((this.subtract((BigRational) (other))).getNumerator().equals(BigDecimal.ZERO))
			return true;
		else
			return false;
	}

	@Override // Implementujemo vaule iz Number abstraknte klase
	public int intValue() {
		return (int) doubleValue();
	}

	@Override // Implementujemo floatValue iz Number klase
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override // Implementujemo doubleValue iz Number klase
	public double doubleValue() {
		return numerator.divide(denominator).doubleValue();
	}

	public BigDecimal bigDecimalDouble() {
		return numerator.divide(denominator, 100, RoundingMode.HALF_DOWN);
	}

	@Override // Implementujemo LongValue iz abstrakne Number klase
	public long longValue() {
		return (long) doubleValue();
	}

	@Override // Implementujemo toCompare metodu iz Comparable
	public int compareTo(BigRational o) {
		if (this.subtract(o).getNumerator().compareTo(BigDecimal.ZERO) > 0)
			return 1;
		else if (this.subtract(o).getNumerator().compareTo(BigDecimal.ZERO) < 0)
			return -1;
		else
			return 0;
	}
}
