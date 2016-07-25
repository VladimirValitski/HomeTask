package homeWork5OOP;

import java.io.Serializable;

/**
 * interface Bubbleable create interface for class BubbleGum
 * 
 * @author user create interface for class BubbleGum
 */
interface Bubbleable {// create interface for class BubbleGum
	public void createBubbles();
}

/**
 * Create child class BubbleGum public class BubbleGum extends Sweets implements
 * Bubbleable, Serializable
 * 
 * @author user
 *
 */
public class BubbleGum extends Sweets implements Bubbleable, Serializable {
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
