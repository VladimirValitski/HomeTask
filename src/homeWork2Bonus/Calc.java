package homeWork2Bonus;

/**
 * Created by Valodik on 07.07.2016.
 Very simple Calculator */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calc {

	public static void main(String[] args) throws Exception {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Введите первое число: ");
			int num1 = Integer.parseInt(reader.readLine()); // We get the number1 from the console
			System.out.println("Введите символ операции (+,-,*,/) : ");
			String symbol = reader.readLine(); // We get the operation symbol from the console
			System.out.println("Введите второе число: ");
			int num2 = Integer.parseInt(reader.readLine()); // We get the number2 from the  console
			{
				switch (symbol) {
				case ("+"):
					System.out.println(num1 + num2);
					break; // input character check
				case ("-"):
					System.out.println(num1 - num2);
					break;
				case ("*"):
					System.out.println(num1 * num2);
					break;
				case ("/"):
					double result = num1 * 1.0 / num2;
					System.out.println(result);
					break;
				default:
					System.out.println("Введен неверный символ");
					break;
				}
				System.exit(0); // Output from the task
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
