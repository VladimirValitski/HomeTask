package HomeWork3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Three_InitArray  {
/* Declare and initialize an array  */
	public static void main(String[] args) throws Exception {
		// create an array initialization list
		String[] array1 = {"one","rw","fref","wef","zsdf","serg","vdf","serg","erg",
				"awerf","asef","awef","awef","awef","awef" };
		try { 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int j = 0;
		int [] array2 = new int[15]; // create an array through the keyboard input
		System.out.println("¬ведите элементы масива (15 шт/ тип int): ");
		while (j<15){
			array2[j] = Integer.parseInt(reader.readLine());
			j++;
		}
		
		
		int [] array3 = new int[15]; // create an array randomly
		for (int i = 0; i< array3.length; i++){// Fill an array through Math.random()
			array3[i]=(int)(Math.random()*10);
		}
		
		for (String n: array1){// print array
			System.out.print(n + " ");
			}
		System.out.println();
		for (int n: array2){// print array
			System.out.print(n + " ");
			}
		System.out.println();
		for (int n: array3){// print array
			System.out.print(n + " ");
			}
		System.out.println();
	}
	catch (Exception e){ // check on the input element
		System.out.println(e);
		System.out.println("¬веденный символ не €вл€етс€ числом/ "
				+ "¬ведите число.");
	}
	}
}


