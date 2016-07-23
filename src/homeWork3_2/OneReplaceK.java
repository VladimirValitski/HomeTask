package homeWork3_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Every word of the text the k-th letter to replace the specified
 *  character c keyboard*/
public class OneReplaceK {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Введите число к: "); // enter number K
			int k = Integer.parseInt(reader.readLine());
			System.out.println("Введите символ для замены: ");
			String symbol = reader.readLine(); // enter symbol of replace
			char symbolChar = symbol.charAt(0);
			String text = "В данном тексте заменяем каждую к-ю букву"
					+ " каждого слова на новый символ, введенный с клавиатуры.";// create string
			String[] word = text.split(" "); // create array
			for (int i = 0; i < word.length; i++) {
				if (word[i].length() >= k) {
					StringBuffer sb = new StringBuffer(word[i]);
					sb.setCharAt(k - 1, symbolChar); // replace symbols
					word[i] = sb.toString();
				}
			}
			for (String t : word) { // print array
				System.out.println(t);
			}
		} catch (Exception e) { // catch Exception
			System.out.println(e);
		}
	}
}
