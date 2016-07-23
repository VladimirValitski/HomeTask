package homeWork2Bonus;

public class FunctionY {
	/**
	 * Created by Valodik on 06.07.2016. Function Y
	 */
	public static void main(String[] args) {
		double y = 0;
		for (double x = -4; x <= 4;) {
			y = Math.pow(2 * x, 2) - 5 * x - 8;
			x = x + 0.5;
		}
		System.out.println("y = " + y); // Output result
	}
}
