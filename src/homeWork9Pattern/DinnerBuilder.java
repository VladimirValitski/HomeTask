package homeWork9Pattern;

/**
 * abstract class DinnerBuilder
 * @author Valodik
 *
 */
public abstract class DinnerBuilder {
	protected Dinner dinner;

	public Dinner getDinner() {
		return dinner;
	}

	public void createNewDinner() {
		dinner = new Dinner();
	}

	public abstract void buildFistDish();

	public abstract void buildSecondDish();

	public abstract void buildDrink();

	public abstract void buildNewDishOne();

	public abstract void buildNewDishTwo();

	public abstract void buildNewDishThree();
}
