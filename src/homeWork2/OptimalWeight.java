package homeWork2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Valodik on 02.07.2016. Determining optimal weight
 */
public class OptimalWeight { /* Determining optimal weight */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Введите Ваш рост в см: ");
		int growth = Integer.parseInt(reader.readLine()); // We get the height
															// from the console
		System.out.println("Введите Ваш вес в кГ: ");
		int weight = Integer.parseInt(reader.readLine()); // We get the weight
															// from the console
		int optimalWeight = growth - 100;
		if (weight < optimalWeight) { // Compare the weight with optimum
			int result = optimalWeight - weight;
			System.out.println("Вам необходимо поправится на " + result + " кГ"); // Output
																					// result
		} else if (weight > optimalWeight) {
			int result = weight - optimalWeight;
			System.out.println("Вам необходимо похудеть на " + result + " кГ"); // Output
																				// result
		} else if (weight == optimalWeight) {
			System.out.println("Поздравляем! У Вас идеальный вес."); // Output
																		// result
		}
	}
}
