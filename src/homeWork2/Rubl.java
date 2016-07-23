package homeWork2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Valodik on 03.07.2016. Declination end word ruble to the resulting
 * number from the console
 */
public class Rubl {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите целое число от 1 до 999: ");
		int number = Integer.parseInt(reader.readLine()); // We get the number from the console
		if ((number < 1) || (number > 999)) {
			System.out.println("Веденное число находится вне диапазона условия. Введите заново.");
		} else {
			String num = Integer.toString(number); // convert the number to a string
			char[] chArray = num.toCharArray(); // Translate string into an array
			if ((chArray.length == 2) && (chArray[0] == '1') && (chArray[1] == '1')) {
				System.out.println(num + " рублей"); // A special case for the number 11
			} else {
				if ((chArray[chArray.length - 1] == '1')) { // Check the last digit of the number
					System.out.println(num + " рубль"); // Output result
				} else if ((chArray[chArray.length - 1] == '2') || (chArray[chArray.length - 1] == '3')
						|| (chArray[chArray.length - 1] == '4')) {
					System.out.println(num + " рубля"); // Output result
				} else
					System.out.println(num + " рублей"); // Output result
			}
		}
	}
}