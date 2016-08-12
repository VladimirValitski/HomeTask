package homeWork9Pattern;

/**
 * Child class. Override methods of DinnerBuilder class
 * @author Valodik 
 */
public class ComplexDinnerBuilder extends DinnerBuilder {
	@Override
	public void buildFistDish() {
		dinner.setFistDish("Milk soup");
	}

	@Override
	public void buildSecondDish() {
		dinner.setSecondDish("Fish with vegetanles");
	}

	@Override
	public void buildDrink() {
		dinner.setDrink("Cake");
	}

	@Override
	public void buildNewDishOne() {
	}

	@Override
	public void buildNewDishTwo() {
	}

	@Override
	public void buildNewDishThree() {
	}
}
