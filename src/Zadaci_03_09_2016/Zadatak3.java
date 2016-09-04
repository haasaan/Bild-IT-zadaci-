package Zadaci_03_09_2016;

public class Zadatak3 {

	public static void main(String[] args) {
		// Pravimo dva objekta octagon
		Octagon oc1 = new Octagon(10);
		Octagon oc2 = (Octagon) oc1.clone();
		// Ispisujemo da li se mogu porediti dali su jednaki i da li imaju iste
		// reference
		System.out.println("compareTo: " + (oc1.compareTo(oc2) == 0));
		System.out.println("equals: " + oc1.equals(oc2));
		System.out.println("Have the same reference? " + (oc1 == oc2));

	}

}
