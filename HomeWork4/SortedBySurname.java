package homeWork4;

import java.util.Comparator;
/* Sorted array by surname*/
public class SortedBySurname implements Comparator<Customer> {
	public int compare(Customer obj1, Customer obj2) {//create method to compare strings

		String str1 = obj1.getName();
		String str2 = obj2.getName();

		return str1.compareTo(str2);
	}
}
