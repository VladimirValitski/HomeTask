package homeWork2;

/**
 * Created by Valodik on 03.07.2016. Split into two lines
 */
public class StringOnTwoString {
	public static void main(String[] args) {
		String str = "Данная задача разбивает строку на две.";
		int halfLength = str.length() / 2; // Find the half length of the string
		System.out.println(str.length());
		String str1 = str.substring(0, halfLength); // Divide in half line
		String str2 = str.substring(halfLength, str.length());
		System.out.println(str1); // Print the resulting string
		System.out.println(str2);
	}
}