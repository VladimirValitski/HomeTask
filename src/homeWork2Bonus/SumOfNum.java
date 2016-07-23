package homeWork2Bonus;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Valodik on 06.07.2016. Calculates the sum of the numbers from 1 to * n
 */
public class SumOfNum {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите целое число: ");
		int num = Integer.parseInt(reader.readLine()); // We get the number from the console
		double sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += 1.0 / i;
		}
		System.out.println(sum); // Output result
	}
}
