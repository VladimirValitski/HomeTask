package homeWork3_2;
/*Create method determines if one string is a permutation of another */
public class Six_PermutationOfStrings {

	public static void main(String[] args) {
		String str1  = new String ("java");//create strings
		String str2  = new String ("Ajav");
		
		if (isPermutationOfStrings(str1, str2)){ //check strings
		System.out.println("Вторая строка является перестановкой первой");
		}
		else System.out.println("Вторая строка НЕ является перестановкой первой");

	}
	public static  boolean isPermutationOfStrings(String s1,String s2){//create method determines if one string is a permutation of another
		s1 = s1.toLowerCase();//ignore case
		s2 = s2.toLowerCase();
		if (s1.length()!= s2.length()){//check string for length
			return false;
		}
		return sort(s1).equals(sort(s2)); 
	}
	
	public static String sort(String s){//create sort method
		char[] arrayCh = s.toCharArray();// create char array
		java.util.Arrays.sort(arrayCh);;// calling standart method sort()
		return new String(arrayCh);
	}

}
