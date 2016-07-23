package homeWork2Bonus;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Valodik on 06.07.2016. Calculates the sum of the numbers from 1 to * n
 */
public class SumNum {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите целое число: ");
		int num = Integer.parseInt(reader.readLine()); // We get the number from the console
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum); // Output result
	}
}
