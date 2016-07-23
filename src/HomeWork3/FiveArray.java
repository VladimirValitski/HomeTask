package homeWork3;

public class FiveArray {
	/* Find the minimum element and his index in the array */
	public static void main(String[] args) {
		int[] num = new int[15];// Create an Array
		for (int i = 0; i < num.length; i++) {// Fill an array through Math.random()
			num[i] = (int) (Math.random() * 10);
		}
		for (int n : num) {// print array
			System.out.print(n + " ");
		}
		System.out.println();
		int minValue = num[0];
		int index = 0;
		for (int i = 1; i < num.length; i++) {// find minimum value
			if (num[i] < minValue) {
				minValue = num[i];
				index = i; // find index of minimum value
			}
		}
		System.out.println("Min value = " + minValue); // print minimum value
		System.out.println("Index = " + index); // print index of minimum value
	}
}
