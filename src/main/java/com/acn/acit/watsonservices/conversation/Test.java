package com.acn.acit.watsonservices.conversation;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Test {
	private static final String XML_FILE_PATH = "src/main/java/bookstore.xml";
	    private static final String XPATH_NODE[] = {
	        "/bookstore/bookList/book[@author='author1']/isbn", //attribute search - absolute node path
	        "//book[@author='author1']/isbn", //search using attribute value without absolute node path
	        "//book[publisher='publisher1']/isbn",//search using node value
	        "//book[@author='author1']/*" //search using attribute receieve all nodes
	    };

	    private static final String XPATH_STRING[] = {
	 		"/bookstore/bookList/book[@author='author2']/isbn/text()",
	 		"//book[@author='author2']/isbn/text()",
	    	"//book[publisher='publisher2']/isbn/text()"
	    };
	    
	    public static void main(String... args) {
	    	new Test().doMain(args);
	    }
	    
	    private void doMain(String... args) {
	    	try {
	    		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    		DocumentBuilder builder = factory.newDocumentBuilder();
	    	    Document doc = builder.parse(XML_FILE_PATH);
	    	
	    	    //get Node List from XML using XPATH
	    	    for (int i = 0; i < XPATH_NODE.length; i++) {
	    	    	getNodeListByXPath(doc, XPATH_NODE[i]);
	    	    }
	    	 	
	    	    //get String value from XML using XPATH
	    	    for (int i = 0; i < XPATH_STRING.length; i++) {
	    	    	getStringByXPath(doc, XPATH_STRING[i]);
	    	    }
	    	
	    	} catch (SAXException | IOException | ParserConfigurationException ex) {
	    		Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
	    	}
	    }
	   
	    private void getNodeListByXPath(Document doc, String xpathVal) {
	    	try {
	    		XPathFactory xPathfactory = XPathFactory.newInstance();
	    		XPath xpath = xPathfactory.newXPath();
	    		XPathExpression expr = xpath.compile(xpathVal);
	    		NodeList nl = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
	    		
	    		Logger.getLogger(Test.class.getName()).log(Level.INFO, "Number of nodes = {0}", nl.getLength());
	    		StringBuilder sb = new StringBuilder();
	    		for (int i = 0; i < nl.getLength(); i++) {
	    			Node node = nl.item(i);
	    			sb.append(node.getFirstChild().getNodeValue()).append(",\t");
	    		}
	    		Logger.getLogger(Test.class.getName()).log(Level.INFO, "ISBN Code = {0}", sb);
	    	} catch (XPathExpressionException ex) {
	    		Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
	    	}
	    }
	   
	    private void getStringByXPath(Document doc, String xpathVal) {
	    	try {
	    		XPathFactory xPathfactory = XPathFactory.newInstance();
	    		XPath xpath = xPathfactory.newXPath();
	    		XPathExpression expr = xpath.compile(xpathVal);
	    		String isbn = (String) expr.evaluate(doc, XPathConstants.STRING);
	    		
	    		Logger.getLogger(Test.class.getName()).log(Level.INFO, "ISBN Code = {0}", isbn);
	    	} catch (XPathExpressionException ex) {
	    		Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
	    	}
	    }
}
