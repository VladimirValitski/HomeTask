package homeWork3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BonusTenArray {
	/*
	 * Get the sequence of elements of the main and secondary diagonal.
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Введите натуральное число n: ");
			int n = Integer.parseInt(reader.readLine());
			int[][] array = new int[n][n];
			for (int i = 0; i < n; i++) {// fill the array
				for (int j = 0; j < n; j++) {
					array[i][j] = (int) (Math.random() * 10 * (i + 1) * (j + 1));
					System.out.printf("%4d", array[i][j]);
				}
				System.out.println();
			}
			System.out.println("Елементы главной диагонали");
			int j = 0;
			for (int i = 0; i < n; i++) {// output main diagonal
				while (j < n) {
					System.out.print(array[i][j] + " ");
					break;
				}
				j++;
			}
			System.out.println();
			System.out.println("Елементы второстепенной диагонали");
			int k = 0;
			for (int i = n - 1; i >= 0; i--) {// output secondary diagonal
				while (k < n) {
					System.out.print(array[i][k] + " ");
					break;
				}
				k++;
			}
		} catch (Exception e) { // check on the input element
			System.out.println(e);
		}
	}
}
