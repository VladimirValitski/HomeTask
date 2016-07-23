package homeWork3;

/* An array of 10 variables of type float *
 *  with finding their average value  */
public class TwoMinAndMaxValue {

	public static void main(String[] args) {
		int[] num = new int[10];// Create an Array
		for (int i = 0; i < num.length; i++) {// Fill an array through Math.random()
			num[i] = (int) (Math.random() * 10);
		}
		int maxValue = num[0];
		for (int i = 1; i < num.length; i++) {// find max value
			if (num[i] > maxValue) {
				maxValue = num[i];
			}
		}
		System.out.println("max value = " + maxValue); // print max value
		int minValue = num[0];
		for (int i = 1; i < num.length; i++) {// find minimum value
			if (num[i] < minValue) {
				minValue = num[i];
			}
		}
		System.out.println("min value = " + minValue); // print minimum value
	}
}
