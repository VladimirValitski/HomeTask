package HomeWork3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Seven_Array7 {
/* Sum of the elements of the array to the first zero*/
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
		int i = 0;
		int [] array = new int[10]; // create an array through the keyboard input
		System.out.println("������� �������� ������ (10 ��/ ��� int): ");
		while (i<10){
			array[i] = Integer.parseInt(reader.readLine());
			i++;
		}
		for (int n: array){// print array
			System.out.print(n + " ");
		}
		System.out.println();
		
		int sum = 0;
		int count0 = 0;
			for (int j = 0; j< array.length; j++){// Fill an array through Math.random()
			if (array[j] != 0){// check the array to zero
				sum += array[j]; // consider the sum
				count0 ++; // consider the count of zero
			}
				else break;
			}
			if (count0 == array.length){ // check the array, is there a zero?
				System.out.println("� ������� ��� ����: ");
			}
			else System.out.println("����� ��������� ������� �� ������� ����: " + sum);
			

		}
		catch (Exception e){ // check on the input element
			System.out.println(e);
			System.out.println("��������� ������ �� �������� ������/ "
					+ "������� �����.");
		}
	}

}
