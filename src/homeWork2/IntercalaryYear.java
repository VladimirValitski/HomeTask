package homeWork2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Valodik on 03.07.2016. The definition of a leap year
 */
public class IntercalaryYear {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите год: ");
		int year = Integer.parseInt(reader.readLine()); // We get a year from
														// the console

		if ((year % 100 == 0) && (!(year % 400 == 0))) {// Check for leap year
			System.out.println("Год невисокосный"); // Output result
		} else if (year % 4 == 0) {
			System.out.println("Год високосный"); // Output result
		} else

			System.out.println("Год невисокосный"); // Output result
	}
}
