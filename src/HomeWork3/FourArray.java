package homeWork3;

public class FourArray {
	/* Find the maximum element and his index in the array */
	public static void main(String[] args) {
		int[] num = new int[15];// Create an Array
		for (int i = 0; i < num.length; i++) {// Fill an array through Math.random()
			num[i] = (int) (Math.random() * 10);
		}
		for (int n : num) {// print array
			System.out.print(n + " ");
		}
		System.out.println();
		int maxValue = num[0];

		int index = 0;
		for (int i = 1; i < num.length; i++) {// find max value
			if (num[i] > maxValue) {
				maxValue = num[i];
				index = i; // find index of max value
			}
		}
		System.out.println("Max value = " + maxValue); // print max value
		System.out.println("Index = " + index); // print index of max value
	}
}
