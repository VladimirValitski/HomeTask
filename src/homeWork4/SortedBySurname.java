package homeWork4;

import java.util.Comparator;

/* Sorted array by surname*/
public class SortedBySurname implements Comparator<Customer> {
	public int compare(Customer objectOne, Customer objectTwo) {
		// create method to compare strings
		String stringOne = objectOne.getSurname();
		String stringTwo = objectTwo.getSurname();
		return stringOne.compareTo(stringTwo);
	}
}
