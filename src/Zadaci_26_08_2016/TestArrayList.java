package Zadaci_26_08_2016;

import java.util.ArrayList;
import java.util.Date;

import Zadaci_20_08_2016.Account;

public class TestArrayList {

	public static void main(String[] args) {
		// Pravimo novu array listu
		ArrayList<Object> list = new ArrayList<>();
		// Dodajemo objekat u array listu te string datum i novi akaunt
		list.add(new Circle2D());
		list.add("Hello World");
		list.add(new Date());
		list.add(new Account(111, 230));
		// Printamo nasu listu preko for each petlje
		list.forEach(System.out::println);

	}

}
