package homeWork9Pattern;

/**
 * Override methods of DinnerBuilder class
 * @author Valodik Child class. 
 */
public class AdditionalDinnerBuilder extends DinnerBuilder {
	@Override
	public void buildFistDish() {
		dinner.setFistDish("Borscht");
	}

	@Override
	public void buildSecondDish() {
		dinner.setSecondDish("Meat with potatoes");
	}

	@Override
	public void buildDrink() {
		dinner.setDrink("Kefir");
	}

	public void buildNewDishOne() {
		dinner.setNewDishOne("Pizza");
	}

	public void buildNewDishTwo() {
		dinner.setNewDishTwo("Beer");
	}

	public void buildNewDishThree() {
		dinner.setNewDishThree("Fruit");
	}
}
