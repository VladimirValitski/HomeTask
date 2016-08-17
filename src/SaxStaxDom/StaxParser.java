package SaxStaxDom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.util.ArrayList;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 * StaxParser
 * 
 * @author Valodik
 *
 */
public class StaxParser {

	public static void main(String args[]) {
		boolean isX = false;
		boolean isY = false;
		boolean isUnit = false;
		XMLInputFactory factory = XMLInputFactory.newFactory();
		try {
			XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("src/SaxStaxDom/point.xml"));
			String x = "";
			String y = "";
			String unit = "";
			int step = 0;
			int num = 1;
			while (reader.hasNext()) {
				int res = reader.next();
				if (res == XMLStreamConstants.START_ELEMENT) {
					if (reader.getLocalName().equals("point"))
						System.out.print(reader.getLocalName() + " ");
					else if (reader.getLocalName().equals("x"))
						isX = true;
					else if (reader.getLocalName().equals("y"))
						isY = true;
					else if (reader.getLocalName().equals("unit"))
						isUnit = true;
				} else if (res == XMLStreamConstants.CHARACTERS) {
					if (isX) {
						x = reader.getText();
						isX = false;
					} else if (isY) {
						y = reader.getText();
						isY = false;
					} else if (isUnit) {
						unit = reader.getText();
						step = 1;// take a flag which means end of cycle
						isUnit = false;
					}
				}
				if (step > 0) {// check flag
					System.out.println(num + ": " + x + unit + ", " + y + unit);
					num++;
					step = 0;// clean flag
				}
			}
		} catch (FileNotFoundException | XMLStreamException e) {
			e.printStackTrace();
		}
	}
}
