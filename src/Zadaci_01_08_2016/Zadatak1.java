package Zadaci_01_08_2016;

import java.util.ArrayList;

public class Zadatak1 {

	public static Integer max(ArrayList<Integer> list) {
		int najvecaVrijednost = 0;

		if (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) > najvecaVrijednost) {
					najvecaVrijednost = list.get(i);
				}
			}
			return najvecaVrijednost;
		} else {
			return null;
		}

	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(345);
		list.add(35);
		list.add(5);

		if (max(list) != null) {
			System.out.println("Najveci element u listi je: " + max(list));
		}

	}
}
