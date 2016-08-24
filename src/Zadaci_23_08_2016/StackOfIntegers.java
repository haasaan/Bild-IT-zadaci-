package Zadaci_23_08_2016;

public class StackOfIntegers {
	private int[] elements;
	private int size;

	/** Kontruktor koji sadrzi default kapacitet 16 */
	public StackOfIntegers() {
		this(16);
	}

	/** Konstruktor koji sadrzi maximalni kapacitet */
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	/** Postavljamo novi integer na vrh stacka */
	public int push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		return elements[size++] = value;
	}

	/** Vracamo i brisemo elemente sa vrha staka */
	public int pop() {
		return elements[--size];
	}

	/** Vracamo gornji element staka */
	public int peek() {
		return elements[size - 1];
	}

	/** Metoda ako je stak prazan */
	public boolean empty() {
		return size == 0;
	}

	/** Vracamo broj integera u staku */
	public int getSize() {
		return size;
	}
}
