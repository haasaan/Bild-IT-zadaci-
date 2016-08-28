package Zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
	// Metoda koja pravi od dvije liste jednu listu tj sklapa dvije lise u jednu
	// listu uniju te dvije liste
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		// Pravimo trecu lisz temp koja ce sadrzat sve vridjednosti iz prve i
		// druge liste i bice njihiva unija
		ArrayList<Integer> temp = new ArrayList<>();
		// Dodajemo na listu temp sve vridjenosti it liste1 i liste 2
		temp.addAll(list1);
		temp.addAll(list2);
		// Vracamo listu temp
		return temp;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Pravimo dvije nove liste
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		// Trazimo od korisnika da unese brojeve za listu jedan
		System.out.print("Unesite pet brojeva za prvu listu ");
		for (int i = 0; i < 5; i++)
			list1.add(input.nextInt());
		// Trazimo od korisnika da unese brojeve za listu dva
		System.out.print("Unesite pet brojeva za drugu listu ");
		for (int i = 0; i < 5; i++) {
			list2.add(input.nextInt());
		}
		// Pozivamo metodu union koja spaja dvije liste te printamo nase liste
		// spojene
		System.out.println("Kombinovana lista je  " + union(list1, list2));
		// Zatvaramo unos
		input.close();
	}

}
