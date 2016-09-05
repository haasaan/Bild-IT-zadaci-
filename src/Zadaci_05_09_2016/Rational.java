package Zadaci_05_09_2016;

public class Rational extends Number implements Comparable<Rational> {
	// Data fieldovi
	private long[] r = new long[2];
	private static int NUMERATOR = 0;
	private static int DENOMINATOR = 1;

	// Default no arg konstruktor
	public Rational() {
		this(0, 1);
	}

	// Konstruktor kome prosljedujemo data fieldove kao argumente
	public Rational(long numerator, long denominator) {
		long gcd = gcd(numerator, denominator);
		r[NUMERATOR] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		r[DENOMINATOR] = Math.abs(denominator) / gcd;
	}

	// Pronalazimo najvecu razliku
	private long gcd(long n, long d) {
		long t1 = Math.abs(n);
		long t2 = Math.abs(d);
		long remainder = t1 % t2;

		while (remainder != 0) {
			t1 = t2;
			t2 = remainder;
			remainder = t1 % t2;
		}

		return t2;
	}

	// Vracamo numerator
	public long getNumerator() {
		return r[NUMERATOR];
	}

	// Vracamo denominator
	public long getDenominator() {
		return r[DENOMINATOR];
	}

	// Dodajemo racionalne broje
	public Rational add(Rational secondRational) {
		long n = r[NUMERATOR] * secondRational.getDenominator() + r[DENOMINATOR] * secondRational.getNumerator();
		long d = r[DENOMINATOR] * secondRational.getDenominator();
		return new Rational(n, d);
	}

	// Subtraktujemo racionalne brojeve
	public Rational subtract(Rational secondRational) {
		long n = r[NUMERATOR] * secondRational.getDenominator() - r[DENOMINATOR] * secondRational.getNumerator();
		long d = r[DENOMINATOR] * secondRational.getDenominator();
		return new Rational(n, d);
	}

	// Umnozajemo racionalne brojeve
	public Rational multiply(Rational secondRational) {
		long n = r[NUMERATOR] * secondRational.getNumerator();
		long d = r[DENOMINATOR] * secondRational.getDenominator();
		return new Rational(n, d);
	}

	// Dijelimo racionalne brojeve
	public Rational divide(Rational secondRational) {
		long n = r[NUMERATOR] * secondRational.getDenominator();
		long d = r[DENOMINATOR] * secondRational.r[NUMERATOR];
		return new Rational(n, d);
	}

	// Overajdamo to string
	@Override
	public String toString() {
		if (r[DENOMINATOR] == 1)
			return r[NUMERATOR] + "";
		else
			return r[NUMERATOR] + "/" + r[DENOMINATOR];
	}

	// Overajdamo equals metodu
	public boolean equals(Object parm1) {
		return (this.subtract((Rational) (parm1))).getNumerator() == 0;
	}

	// Overajdamo hashCode metodu
	public int hashCode() {
		return new Double(this.doubleValue()).hashCode();
	}

	// Overajdamo abstrak metodu int Valuse
	public int intValue() {
		return (int) doubleValue();
	}

	// Overajdamo metodu floatValue
	public float floatValue() {
		return (float) doubleValue();
	}

	// Overajdamo doubleValue metodu
	public double doubleValue() {
		return r[NUMERATOR] * 1.0 / r[DENOMINATOR];
	}

	// Overajdamo longValue metodu
	public long longValue() {
		return (long) doubleValue();
	}

	@Override
	public int compareTo(Rational o) {
		if ((this.subtract(o)).getNumerator() > 0)
			return 1;
		else if ((this.subtract(o)).getNumerator() < 0)
			return -1;
		else
			return 0;
	}
}
