package homeWork8Internat;

import java.io.Serializable;

import homeWork5OOP.Sweets;

public class Sweetmeats extends Sweets implements Serializable {
	private static final long serialVersionUID = 1L;

	/* Create child class Sweets */

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
