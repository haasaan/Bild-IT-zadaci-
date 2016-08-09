package Zadaci_09_08_2016;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese sirinu za tacku 1
		System.out.println("Unesite sirinu za tacku 1");
		double x1 = Math.toRadians(input.nextDouble());
		// Trazimo od korsinika da unese duzinu za tacku 1
		System.out.println("Unesite duzni za tacku 1");
		double y1 = Math.toRadians(input.nextDouble());
		// Trazimo od korisnika da unese sirinu za tacku 2
		System.out.println("Unesite sirinu za tacku 2 ");
		double x2 = Math.toRadians(input.nextDouble());
		// Trazimo od korisnika da unese duzni za tacku 2
		System.out.println("Unesite duzinu za tacku 2");
		double y2 = Math.toRadians(input.nextDouble());
		// Koristimo se ovom formulom da izracunamo distancu izmedju dvije tacke
		double distanca = 6371.01
				* Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		System.out.println("Distanca izmedju dvije tacke je: " + distanca + " km");

		input.close();

	}

}
