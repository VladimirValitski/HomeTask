package Task2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Valodik on 02.07.2016.
 A comparison of two numbers*/
public class TwoNums { /* A comparison of two numbers  */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¬ведите два целых числа: ");
        int num1 = Integer.parseInt(reader.readLine()); // We get the number from the console
        int num2 = Integer.parseInt(reader.readLine());
        if (num1 > num2) { // A comparison of two numbers
            System.out.println(num1 + " больше " + num2); // Output result
        }
        if (num1 == num2) {
            System.out.println(num1 + " равн€етс€ " + num2); // Output result
        }
        else
            System.out.println(num2 + " больше " + num1); // Output result

    }
}