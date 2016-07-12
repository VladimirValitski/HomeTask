package Task2Bonus;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Created by Valodik on 06.07.2016.
 Calculates the Factorial*/
public class Factorial {
	public static void main(String[] args)throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¬ведите целое число: ");
        int num = Integer.parseInt(reader.readLine()); // We get the number from the console
        int fact = 1;
        for (int i =1; i<=num; i++){
        	fact = fact * i;
        }
        System.out.println(fact); // Output result
}
}