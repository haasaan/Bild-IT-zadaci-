package Zadaci_02_09_2016;

import java.util.ArrayList;
import Zadaci_02_09_2016.MyStack;

public class Zadatak5 {

	public static void main(String[] args) {

		MyStack myStack = new MyStack();
		for (int i = 0; i < 10; i++) {
			myStack.push(i);
		}
		MyStack myStack2 = (MyStack) myStack.clone();
		// Koristimo dva itema
		myStack.pop();
		myStack.pop();

		// Ispisujemo velicinu obe liste i provjeravamo da li su razlicite
		System.out.println("stack1 size = " + myStack.getSize());
		System.out.println("stack2 size = " + myStack2.getSize());

	}

}
