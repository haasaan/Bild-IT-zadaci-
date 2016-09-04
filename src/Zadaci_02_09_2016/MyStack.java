package Zadaci_02_09_2016;

import java.util.ArrayList;

public class MyStack implements Cloneable {
	// Klasa MyStack u kojo implementujemo clonable

	// Bova lista
	private ArrayList<Object> list = new ArrayList<>();

	// Provjeravamo da li je lista prazna
	public boolean isEmpty() {
		return list.isEmpty();
	}

	// Velicina liste
	public int getSize() {
		return list.size();
	}

	public Object peek() {
		return list.get(getSize() - 1);
	}

	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public void push(Object o) {
		list.add(o);
	}

	@Override // Override metodu to string
	public String toString() {
		return "stack: " + list.toString();
	}

	@Override
	protected Object clone() {
		MyStack myStack = null;
		try {
			myStack = (MyStack) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		myStack.list = new ArrayList<>(list);
		return myStack;
	}
}
