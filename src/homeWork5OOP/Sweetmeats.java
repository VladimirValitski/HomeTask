package homeWork5OOP;

import java.io.Serializable;

/**
 * Create child class Sweets
 * 
 * @author user
 *
 */
public class Sweetmeats extends Sweets implements Serializable {
	private static final long serialVersionUID = 1L;

	public Sweetmeats(String name, int sugar, int weight, int price) {
		// create constructor
		super(name, sugar, weight, price);
	}

	@Override
	public String toString() {
		// Override toString() from parent class
		return super.toString();
	}

}
