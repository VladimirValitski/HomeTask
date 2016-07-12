package HomeWork3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eight_Array8 {
	/* Multiplication of the elements of the array to the first zero.*/
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
		int i = 0;
		int [] array = new int[10]; // create an array through the keyboard input
		System.out.println("Введите элементы масива (10 шт/ тип int): ");
		while (i<10){
			array[i] = Integer.parseInt(reader.readLine());
			i++;
		}
		for (int n: array){// print array
			System.out.print(n + " ");
		}
		System.out.println();
		
		int mult = 1;
		int count0 = 0;// consider zeros
			for (int j = 0; j< array.length; j++){// Fill an array through Math.random()
			if (array[j] != 0){// check the array to zero
				mult *= array[j]; // consider multiplication of the elements
				count0 ++; // consider the count of zero
			}
				else break;
			}
			if (count0 == array.length){ // check the array, is there a zero?
				System.out.println("В массиве нет нуля: ");
			}
			else System.out.println("Произведение элементов массива до первого нуля: " + mult);
			

		}
		catch (Exception e){ // check on the input element
			System.out.println(e);
			System.out.println("Введенный символ не является числом/ "
					+ "Введите число.");
		}
	}

}
