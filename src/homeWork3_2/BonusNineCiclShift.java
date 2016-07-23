package homeWork3_2;

public class BonusNineCiclShift {
	/*
	 * For two strings, stringOne and stringTwo, test code, whether the string
	 * stringTwo, stringOne received cyclic shift
	 */
	public static void main(String[] args) {
		String stringOne = new String("waterboll");// create strings
		String stringTwo = new String("bollwater");
		if (isSubstring(stringOne, stringTwo)) { // check strings by method isSubstring(s1,s2)
			System.out.println("Строка stringTwo получена циклическим сдвигом stringOne");
		} else
			System.out.println("Строка stringTwo НЕ является циклическим сдвигом stringOne");
	}

	public static boolean isSubstring(String strOne, String strTwo) {// create method isSubstring()
		if (strOne.length() != strTwo.length()) {// check length of strings
			return false;
		}
		StringBuilder sb = new StringBuilder(strTwo);// create StringBuilder
		for (int i = 0; i < sb.length(); i++) {
			if (sb.toString().equalsIgnoreCase(strOne)) {// compare value strOne with strTwo
				return true;
			} else {
				sb.insert(0, sb.charAt(sb.length() - 1));// if else: insert last symbol in beginning string
				sb.deleteCharAt(sb.length() - 1);// delete last symbol
			}
		}
		return false;
	}
}
