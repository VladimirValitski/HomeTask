package SaxStaxDom;

import java.io.IOException;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
/**
 * class SaxMain
 * @author Valodik
 *
 */
public class SaxMain {
	public static void main(String[] args) {
		try {
			// create SAX analyzer
			XMLReader reader = XMLReaderFactory.createXMLReader();
			Sax handler = new Sax();
			reader.setContentHandler(handler);
			reader.parse("src/SaxStaxDom/point.xml");
		} catch (SAXException e) {
			System.err.print("ошибка SAX парсера " + e);
		} catch (IOException e) {
			System.err.print("ошибка I/О потока " + e);
		}
	}
}
