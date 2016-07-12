package HomeWork3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Nine_Array9 {
/* Rearrange all zeros in the end of the array, 
 * without changing the order of non-zero elements*/
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
		int i = 0;
		int j = 0;
		int [] array = new int[10]; // create an array through the keyboard input
		int [] array1 = new int[10];// create additional array
		
		System.out.println("Введите элементы масива (10 шт/ тип int): ");
		while (i<10){
			array[i] = Integer.parseInt(reader.readLine());
			if (array[i] != 0){// check elements of the array on zero
				array1[j] = array[i];//fill two arrays at once
				j++;
			}				
			i++;
		}
		
		System.out.println("Исходный массив");
		for (int n: array){// print array
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("Конечный массив");
			
		for (int n1: array1){// print format array1
			System.out.print(n1 + " ");
		}
		}
		catch (Exception e){ // check on the input element
			System.out.println(e);
			
		}
	}


}
