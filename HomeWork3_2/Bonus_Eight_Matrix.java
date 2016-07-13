package homeWork3_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bonus_Eight_Matrix {
/*In matrix N*M reset the rows and columns where he met zero */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
			System.out.println("Введите натуральное число n для заполнения строк матрицы: ");
			int n = Integer.parseInt(reader.readLine());//We assign the dimension of the matrix
			System.out.println("Введите натуральное число m для заполнения столбцов матрицы: ");
			int m = Integer.parseInt(reader.readLine());
			int [][] array = new int [n][m];
			boolean[] row = new boolean[n]; //create boolean array of rows
		    boolean[] column = new boolean[m];//create boolean array of columns
			
			System.out.println("Исходная матрица: ");//create matrix
			for (int i = 0; i < n; i++) {//fill the array
				for (int j = 0; j < m; j++){
					array[i][j] = (int) (Math.random()*10 );
					if (array[i][j] == 3){
						array[i][j] = 0;
					}
					System.out.printf("%5d", array[i][j]);
				}
				System.out.println();
			}
			System.out.println("Результат: ");
			
		    
		    for (int i = 0; i < n; i++) {
		        for (int j = 0; j < m; j++) {
		            if (array[i][j] == 0) {//check, if element of matrix equals 0
		                row[i] = true; 
		                column[j] = true;
		            }
		        }
		    }
		 
		    for (int i = 0; i < n; i++) {
		        for (int j = 0; j < m; j++) {
		            if (row[i] || column[j]) {//check arrays row[] and column[], if its true, change array[][] 
		                array[i][j] = 0;
		            }
		        }
		    }
			
			
			for (int i = 0; i < n; i++) {//print modified matrix
				for (int j = 0; j < m; j++){
					System.out.printf("%5d", array[i][j]);	
				}
				System.out.println();
			}
	}

}
