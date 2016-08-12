package homeWork9Pattern;

/**
 * expert class Dinner
 * @author Valodik
 * 
 */
public class Dinner {
	private String fistDish = "";
	private String secondDish = "";
	private String drink = "";
	private String newDishOne = "";
	private String newDishTwo = "";
	private String newDishThree = "";

	public void setNewDishOne(String newDishOne) {
		this.newDishOne = newDishOne;
	}

	public void setNewDishTwo(String newDishTwo) {
		this.newDishTwo = newDishTwo;
	}

	public void setNewDishThree(String newDishThree) {
		this.newDishThree = newDishThree;
	}

	public void setFistDish(String fistDish) {
		this.fistDish = fistDish;
	}

	public void setSecondDish(String secondDish) {
		this.secondDish = secondDish;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	@Override
	public String toString() {
		return "Dinner [fistDish: *" + fistDish + "*, secondDish: *" + secondDish + "* , drink: *" + drink + "* ]"
				+ " add dishs: [" + newDishOne + " " + newDishTwo + " " + newDishThree + "]";
	}
}
