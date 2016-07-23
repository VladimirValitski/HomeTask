package HomeWork3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThreeInitArray  {
/* Declare and initialize an array  */
	public static void main(String[] args) throws Exception {
		// create an array initialization list
		String[] arrayOne = {"one","rw","fref","wef","zsdf","serg","vdf","serg","erg",
				"awerf","asef","awef","awef","awef","awef" };
		try { 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int j = 0;
		int [] arrayTwo = new int[15]; // create an array through the keyboard input
		System.out.println("Введите элементы масива (15 шт/ тип int): ");
		while (j<15){
			arrayTwo[j] = Integer.parseInt(reader.readLine());
			j++;
		}				
		int [] arrayThree = new int[15]; // create an array randomly
		for (int i = 0; i< arrayThree.length; i++){// Fill an array through Math.random()
			arrayThree[i]=(int)(Math.random()*10);
		}		
		for (String n: arrayOne){// print array
			System.out.print(n + " ");
			}
		System.out.println();
		for (int n: arrayTwo){// print array
			System.out.print(n + " ");
			}
		System.out.println();
		for (int n: arrayThree){// print array
			System.out.print(n + " ");
			}
		System.out.println();
	}
	catch (Exception e){ // check on the input element
		System.out.println(e);
		System.out.println("Введенный символ не является числом. Введите число.");
	}
	}
}


