package Task2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Valodik on 02.07.2016.
 Defining private*/
public class TwoNumsDelenie { /* Finding the quotient of the two numbers */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¬ведите два целых числа: ");
        int num1 = Integer.parseInt(reader.readLine()); // We get the number from the console
        int num2 = Integer.parseInt(reader.readLine());
        double result = (double) num1*1.0 / num2;
        System.out.println("„астное от делени€: " + result); // Output result
    }
}
