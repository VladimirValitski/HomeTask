package homeWork3_2;

/* Remove from the string all the characters, except spaces that are not letters*/
public class ThreeDelSymbols {

	public static void main(String[] args) {
		String text = "Из небольшого текста удалить " + "все символы, кроме пробелов, не являющиеся буквами!"; 
		// create  string
		char[] chArray = text.toCharArray(); // translate string into the array
		StringBuffer sb = new StringBuffer();
		int i = 0;
		while (i < chArray.length) {
			if (Character.isLetter(chArray[i])) { // check whether a character is a letter
				sb.append(chArray[i]);
			}
			if (Character.isWhitespace(chArray[i])) { // check whether a character is a Whitespace
				sb.append(chArray[i]);
			}
			i++;
		}
		System.out.print(sb);
	}
}
