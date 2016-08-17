package SaxStaxDom;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
/**
 * Sax Parser
 * @author Valodik
 *
 */
public class Sax extends DefaultHandler {
	String localName = "";
	ArrayList<String> unit = new ArrayList<String>();
	ArrayList<Integer> x = new ArrayList<Integer>();
	ArrayList<Integer> y = new ArrayList<Integer>();
	boolean isX = false;
	boolean isY = false;
	boolean isUnit = false;

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attrs) {
		if (localName.equals("unit")) {
			isUnit = true;
		} else if (localName.equals("x")) {
			isX = true;
		} else if (localName.equals("y")) {
			isY = true;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) {
		if (isUnit) {
			unit.add(new String(ch, start, length));
			isUnit = false;
		} else if (isX) {
			x.add(Integer.parseInt(new String(ch, start, length)));
			isX = false;
		} else if (isY) {
			y.add(Integer.parseInt(new String(ch, start, length)));
			isY = false;
		}
	}

	@Override
	public void endDocument() {
		for (int i = 0; i < x.size(); i++) {
			System.out.println(localName + (i + 1) + ": " + x.get(i) + unit.get(i) + ", " + y.get(i) + unit.get(i));
		}
	}
}