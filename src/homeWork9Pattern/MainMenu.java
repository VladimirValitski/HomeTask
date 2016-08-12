package homeWork9Pattern;

/*
 * Паттерн Builder. Разработать модель системы Комплексный обед. 
 * Написать код  приложения,  позволяющий  создавать  как  стандартные
 * комплексные обеды, так и обеды, в которые включены дополнительные 
 * блюда из меню. Минимум 3 типа дополнительных блюд.*/
/**
 * main class MainMenu
 * @author Valodik
 *
 */
public class MainMenu {

	public static void main(String[] args) {
		System.out.println("Menu: ");
		Director director = new Director();
		// implements class ComplexDinnerBuilder through Director
		DinnerBuilder complexDinnerBuilder = new ComplexDinnerBuilder();
		director.setDinnerBuilder(complexDinnerBuilder);
		director.constructMenuDinner();
		Dinner dinnerOne = director.getDinner();
		System.out.println(dinnerOne);
		// implements class AdditionalDinnerBuilder through Director
		DinnerBuilder additionalDinnerBuilder = new AdditionalDinnerBuilder();
		director.setDinnerBuilder(additionalDinnerBuilder);
		director.constructMenuDinner();
		Dinner dinnerTwo = director.getDinner();
		System.out.println(dinnerTwo);
	}
}
