package HomeWork3;

public class SixArray {
	/* Find a number of negative elements in the array */
	public static void main(String[] args) {
		int[] num = new int[10];// Create an Array
		for (int i = 0; i < num.length; i++) {
			// Fill an array through Math.random() with negative elements
			int randNum = (int) (Math.random() * 10);
			num[i] = (int) (Math.random() * 10 * Math.pow((-1), randNum));
		}
		for (int n : num) {// print array
			System.out.print(n + " ");
		}
		System.out.println();
		int count = 0;
		for (int i = 0; i < num.length; i++) {// find count negative value
			if (num[i] < 0) {
				count += 1;
			}
		}
		System.out.println("Количество отрицательных элементов: " + count);
	}
}
