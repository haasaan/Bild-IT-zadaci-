package Zadaci_08_08_2016;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Pravimo varijable tj dodjeljuje na njih tri nasumicna broja za koje
		// cemo racunati sumu
		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);
		int num3 = (int) (Math.random() * 10);
		System.out.println("Unesite zbir brojeva " + num1 + " + " + num2 + " + " + num3);
		// Unosimo sumu
		int sum = input.nextInt();
		// Koristimo while petlju sve dok je sum razlicita od zbira tri broja
		// program nam ispisuje da smo unijeli pogresan odgovor da pokusamo
		// ponovo
		while (sum != num1 + num2 + num3) {
			System.out.println("Unijeli ste pogresan odgovor pokusajte ponovo ");
			sum = input.nextInt();
		}
		// Kada odgovorimo tacno program prelazi u if uslov i ispisuje nam
		// poruku da je odgovor koji smo unijeli tacan te nam cestita i zavrsava
		// sa programom
		if (sum == num1 + num2 + num3) {
			System.out.println("Tacan odgovor je " + sum + " svaka cast");
		}
		input.close();

	}

}
