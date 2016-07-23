package homeWork3_2;

/*Create method determines if one string is a permutation of another */
public class SixPermutationOfStrings {

	public static void main(String[] args) {
		String stringOne = new String("java");// create strings
		String stringTwo = new String("Ajav");
		if (isPermutationOfStrings(stringOne, stringTwo)) { // check strings
			System.out.println("Вторая строка является перестановкой первой");
		} else
			System.out.println("Вторая строка НЕ является перестановкой первой");
	}
	public static boolean isPermutationOfStrings(String strOne, String strTwo) {
		// create method determines if one string is a permutation of another
		strOne = strOne.toLowerCase();// ignore case
		strTwo = strTwo.toLowerCase();
		if (strOne.length() != strTwo.length()) {// check string for length
			return false;
		}
		return sort(strOne).equals(sort(strTwo));
	}

	public static String sort(String s) {// create sort method
		char[] arrayCh = s.toCharArray();// create char array
		java.util.Arrays.sort(arrayCh);// calling standard method sort()
		return new String(arrayCh);
	}
}
