package Zadaci_29_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

import Zadaci_23_08_2016.MyPoint;

public class Zadatak1 {
	// Metoda koja racuna povrsinu konveksnog poligoba te toj metodi
	// prosljedjujeo arraylistu i klasu MyPoint kao argumente
	public static double getConvexPolygonArea(ArrayList<MyPoint> points) {
		// ppravimodvije varijable sum
		double sum1 = 0;
		double sum2 = 0;
		// For eptlja prolazi kroz od 0 do velicine tacki
		for (int i = 0; i < points.size(); i++) {
			// Index + 1 djelimo sa velicinom tacki
			int limitIndex = (i + 1) % points.size();
			// Uzimamo index za tacku 1 i tacku 2
			MyPoint p1 = points.get(i);
			MyPoint p2 = points.get(limitIndex);
			// Printamo indexe
			System.out.println("P1 index = " + i);
			System.out.println("P2 index =" + limitIndex);
			// Racunamo sumu tacki
			sum1 += (p1.x * p2.y);
			sum2 += (p1.y * p2.x);
		}
		// Racunamo povrsinu poligona
		double area = 0.5 * (sum1 - sum2);
		return (area > 0) ? area : -area;
	}

	public static void main(String[] args) {
		// Unosimo koliko zelimo tacki
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite broj tacki: ");
		int numOfPoints = input.nextInt();
		// Unosimo koordinate tacki
		System.out.print("Unesite koordinate tacki: ");
		ArrayList<MyPoint> points = new ArrayList<>();
		for (int i = 0; i < numOfPoints; i++) {
			// dodajemona listu tacke koje su unisjete i koordinate
			points.add(new MyPoint(input.nextDouble(), input.nextDouble()));
		}
		// Pozivamo metodu koja racuna povrsinu te printamo kolika je povrsina
		System.out.println("Povrsina je: " + getConvexPolygonArea(points));
		input.close();
	}

}
