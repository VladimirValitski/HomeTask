package homeWork3_2;

public class Bonus_NineCiclShift {
/* For two strings, s1 and s2, test code, whether the string s2 s1 
 * received cyclic shift*/
	public static void main(String[] args) {
		String s1 = new String("waterboll");//create strings
		String s2 = new String("bollwater");
		if(isSubstring(s1,s2)){ //check strings by method isSubstring(s1,s2)
			System.out.println("Строка s2 получена циклическим сдвигом s1");
		}
		else System.out.println("Строка s2 НЕ является циклическим сдвигом s1");

	}
	
	public static boolean isSubstring(String str1, String str2) {//create method isSubstring()
		if (str1.length() != str2.length()) {//check length of strings
			return false;
		}
		StringBuilder sb = new StringBuilder(str2);//create  StringBuilder 
		for (int i = 0; i < sb.length(); i++) {
			if (sb.toString().equalsIgnoreCase(str1)) {//compare value str1 with str2
				return true;
			} else {
				sb.insert(0, sb.charAt(sb.length() - 1));//if else: insert last symbol in begining string 
				sb.deleteCharAt(sb.length() - 1);//delete last symbol
			}
		}
		return false;
	}

}
