package homeWork2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Valodik on 02.07.2016. Defining private
 */
public class TwoNumsDelenie { /* Finding the quotient of the two numbers */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите два целых числа: ");
		int numOne = Integer.parseInt(reader.readLine()); // We get the number from the console
		int numTwo = Integer.parseInt(reader.readLine());
		double result = (double) numOne * 1.0 / numTwo;
		System.out.println("Частное от деления: " + result); // Output result
	}
}
