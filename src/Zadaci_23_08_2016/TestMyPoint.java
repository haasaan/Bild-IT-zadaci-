package Zadaci_23_08_2016;

public class TestMyPoint {

	public static void main(String[] args) {
		// Pravimo dva objekta tj dvije tacke
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);
		// Printamo distancu izmedju njih
		System.out.println(p1.distance(p2));
		System.out.println(p1.distance(1, 0));

	}

}
