package Task2Bonus;
/**
 * Created by Valodik on 06.07.2016.
 Table 10 squares of integers */
public class TablOfSquare {

	public static void main(String[] args) {
		Integer[] tabl = new Integer[10]; //Create an array
		for (int i=0; i < tabl.length; i++){
			tabl[i] =(int) Math.pow(i+1, 2);//fill an array
			System.out.print(tabl[i] + " ");
		}
			
	}

}
