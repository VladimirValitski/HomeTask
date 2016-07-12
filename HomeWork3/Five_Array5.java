package HomeWork3;

public class Five_Array5 {
	/*Find the minimum element and his index in the array */
	public static void main(String[] args) {
		int [] num = new int [15];// Create an Array
		for (int i=0; i< num.length; i++){// Fill an array through Math.random()
			num[i]=(int)(Math.random()*10);
		}
		for (int n: num){// print array
			System.out.print(n + " ");
			}
		System.out.println();
		
		int minValue = num[0];
		int index = 0;
		for (int i=1; i< num.length; i++){// find min value
			if (num[i] < minValue){
				minValue = num[i];
				index = i; // find index of min value
			}
			}
		System.out.println("Min value = " + minValue); // print min value
		System.out.println("Index = " + index); // print index of min value


	}

}
