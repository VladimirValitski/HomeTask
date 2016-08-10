package homeWork8Internat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Написать  программу,  выполняющую  поиск  в  строке  всех  тегов  абзацев,
 *  в  т.ч.  тех,  у  которых  есть  параметры,  например  <p  id=”p1”>,
 *  и замену их на простые теги абзацев <p> (атрибуты игнорируем).
*/
public class Regex {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		Pattern regexp = Pattern.compile("<p[^>]*>");//create pattern
		Matcher m = regexp.matcher("<pbc> <b-><1> <p id = > <d/>");
		while (m.find())//find all matches
			m.appendReplacement(buffer, "<p>");//change all matches
		m.appendTail(buffer);

		System.out.println(buffer);
	}
}
