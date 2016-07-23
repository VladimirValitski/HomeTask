package homeWork3_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* From the text to remove all words of a given length beginning with wovels letter*/
public class FourDelWords {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Введите число задающее длину слова: "); 
			// enter number of length word
			int lengthWord = Integer.parseInt(reader.readLine());
			String text = "Из текста! удалить все слова заданной длины, начинающиеся на согласную букву и еще.";
			// create string
			String[] word = text.split(" "); // create array
			// StringBuffer[] sbArray = new StringBuffer[word.length];
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < word.length; i++) {
				char lastSymbol = word[i].charAt(word[i].length() - 1);
				if (IsSymbol(lastSymbol)) {
					word[i] = word[i].substring(0, word[i].length() - 1); 
					// check whether a last Symbol is/ not letter(,.:!?)
				}
				if ((word[i].length() == lengthWord) && (IsWovels(word[i]))) {
					// check whether a last Symbol is wovels and has a predetermined length
				} else
					sb.append(word[i]).append(" ");
			}
			System.out.print(sb);
		} catch (Exception e) { // catch Exception
			System.out.println(e);
		}
	}
	public static boolean IsWovels(String t) {// method for finding wovels
		switch ((char) Character.toLowerCase(t.charAt(0))) {
		case 'а':
		case 'у':
		case 'е':
		case 'ы':
		case 'о':
		case 'э':
		case 'я':
		case 'и':
		case 'ю':
			return true;
		default:
			return false;
		}
	}

	public static boolean IsSymbol(char t) { // method for finding Symbol
		switch (t) {
		case ',':
		case '.':
		case ':':
		case '!':
		case '?':
			return true;
		default:
			return false;
		}
	}
}
