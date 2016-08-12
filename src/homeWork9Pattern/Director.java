package homeWork9Pattern;

/**
 * class Director create objects
 * @author Valodik 
 */
public class Director {
	private DinnerBuilder dinnerBuilder;

	public void setDinnerBuilder(DinnerBuilder dinnerBuilder) {
		this.dinnerBuilder = dinnerBuilder;
	}

	public Dinner getDinner() {
		return dinnerBuilder.getDinner();
	}

	/**
	 * void constructMenuDinner() method create complex objects
	 */
	public void constructMenuDinner() {
		dinnerBuilder.createNewDinner();
		dinnerBuilder.buildFistDish();
		dinnerBuilder.buildSecondDish();
		dinnerBuilder.buildDrink();
		dinnerBuilder.buildNewDishOne();
		dinnerBuilder.buildNewDishTwo();
		dinnerBuilder.buildNewDishThree();
	}
}
