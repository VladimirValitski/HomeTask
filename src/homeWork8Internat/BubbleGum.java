package homeWork8Internat;

import java.io.Serializable;

import homeWork5OOP.Bubbleable;
import homeWork5OOP.Sweets;

interface Bubbleable {// create interface for class BubbleGum
	public void createBubbles();
}

public class BubbleGum extends Sweets implements Bubbleable, Serializable {
	/* Create child class BubbleGum */
	private static final long serialVersionUID = 1L;

	public BubbleGum(String name, int sugar, int weight, int price) {
		// create constructor
		super(name, sugar, weight, price);
	}

	@Override
	public String toString() {
		// Override toString() from parent class
		return super.toString();
	}

	@Override
	public void createBubbles() {
		// Initialization method from interface Bubbleable
		System.out.println("I can make bubbles!)))");
	}
}
