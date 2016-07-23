package HomeWork3;

/* An array of 10 variables of type float *
 *  with finding their average value  */
public class OneAverageValue {

	public static void main(String[] args) {
		float[] num = new float[10];// Create an Array
		float sum = 0;
		for (int i = 0; i < num.length; i++) {// Fill an array through Math.random()
			double randNum = Math.random() * 10 + Math.random();
			float randNum1 = (float) randNum;
			num[i] = randNum1;
			sum += num[i];// save sun value of array
		}
		for (float n : num) {// print array
			System.out.print(" " + n + " | ");
		}
		System.out.println();
		float averageValue = sum / num.length;// find averageValue
		System.out.println("AverageValue: " + averageValue);
	}
}
