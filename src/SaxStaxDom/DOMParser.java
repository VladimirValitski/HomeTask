package SaxStaxDom;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
/**
 * DOMParser
 * @author Valodik
 *
 */
public class DOMParser {

	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Document doc = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		File f = new File("src/SaxStaxDom/point.xml");
		try {
			doc = builder.parse(f);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Element root = doc.getDocumentElement();
		// System.out.println(root.getTagName());
		NodeList nodeList = root.getChildNodes();
		NodeList nodeOneList;
		ArrayList<String> x = new ArrayList<>();
		ArrayList<String> y = new ArrayList<>();
		ArrayList<String> unit = new ArrayList<>();
		String name = "";
		for (int i = 0; i < nodeList.getLength(); i++) {
			//  go through the hierarchy of nodes
			if (nodeList.item(i) instanceof Element) {
				name = nodeList.item(i).getNodeName();
				nodeOneList = nodeList.item(i).getChildNodes();
				for (int j = 0; j < nodeOneList.getLength(); j++) {
					if ((nodeOneList.item(j).getNodeName().equals(("x")))) {
						x.add(((Element) nodeOneList.item(j)).getTextContent());
					} else if ((nodeOneList.item(j).getNodeName().equals(("y")))) {
						y.add(((Element) nodeOneList.item(j)).getTextContent());
					} else if ((nodeOneList.item(j).getNodeName().equals(("unit")))) {
						unit.add(((Element) nodeOneList.item(j)).getTextContent());
					}
				}
			}
		}
		for (int i = 0; i < unit.size(); i++) {
			System.out.print(
					name + " " + (i + 1) + ": " + x.get(i) + unit.get(i) + ", " + y.get(i) + unit.get(i) + "\n");
		}
	}
}