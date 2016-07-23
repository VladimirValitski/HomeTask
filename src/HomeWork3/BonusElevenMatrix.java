package homeWork3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BonusElevenMatrix {
	/* Replace the elements of the Matrix of main diagonal in ascending */
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Введите натуральное число n для заполнения матрицы: ");
			int n = Integer.parseInt(reader.readLine());
			int[][] array = new int[n][n];
			for (int i = 0; i < n; i++) {// fill the array
				for (int j = 0; j < n; j++) {
					array[i][j] = (int) (Math.random() * 10 * (i + 1) * (j + 1));
					System.out.printf("%5d", array[i][j]);
				}
				System.out.println();
			}
			System.out.println("Массив с диагональю по возрастанию: ");
			int[] arrayDiagonal = new int[n]; // create new array for elements of the diagonal
			int b = 0;
			for (int a = 0; a < n; a++) {// find main diagonal and set it in [] arrayDiagonal
				while (b < n) {
					arrayDiagonal[a] = array[a][b];
					break;
				}
				b++;
			}
			for (int i = arrayDiagonal.length - 1; i >= 0; i--) {// sort array[] arrayDiagonal
				for (int j = 0; j < i; j++) {
					if (arrayDiagonal[j] > arrayDiagonal[j + 1]) {
						int temp = arrayDiagonal[j];
						arrayDiagonal[j] = arrayDiagonal[j + 1];
						arrayDiagonal[j + 1] = temp;
					}
				}
			}
			int y = 0;
			for (int x = 0; x < n; x++) {// replace main diagonal on the new sort diagonal
				while (y < n) {
					array[x][y] = arrayDiagonal[x];
					break;
				}
				y++;
			}
			for (int i = 0; i < n; i++) {// print the array with new main diagonal
				for (int j = 0; j < n; j++) {
					System.out.printf("%5d", array[i][j]);
				}
				System.out.println();
			}
		} catch (Exception e) { // check on the input element
			System.out.println(e);
		}
	}
}
