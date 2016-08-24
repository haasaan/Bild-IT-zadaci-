package Zadaci_23_08_2016;

public class PrimeNumbers {

	public static void main(String[] args) {
		// Printamo proste brojeve ispod 120
		System.out.println("Printing prime numbers under 120.. ");
		// Novi objekat stak i prosljedjujemo mu vrijednost 20
		StackOfIntegers stack = new StackOfIntegers(20);
		// For petlja te pozivamo metodu da li je broj prost i pushamo na nas
		// stak
		for (int i = 2; i < 120; i++) {
			if (isPrime(i)) {
				stack.push(i);
			}
		}
		// Ako je stak prazan ispisujemo
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

	// Provjeravamo da li je broj prost
	public static boolean isPrime(int n) {

		double range = Math.sqrt(n);
		for (int i = 2; i < range; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
