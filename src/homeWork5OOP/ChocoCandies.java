package homeWork5OOP;

import java.io.Serializable;

/**
 * Create child class ChocoCandies public class ChocoCandies extends Sweets
 * implements Serializable
 * 
 * @author user
 *
 */
public class ChocoCandies extends Sweets implements Serializable {

	private static final long serialVersionUID = 1L;

	public ChocoCandies(String name, int sugar, int weight, int price) {
		// create constructor
		super(name, sugar, weight, price);
	}

	@Override
	public String toString() {
		// Override toString() from parent class
		return super.toString();
	}
}
