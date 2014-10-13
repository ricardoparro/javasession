import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.*;
import java.util.Arrays;

import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;


import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

//for SAX parsing 

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;



public class TakeDuplicatesXml{

    public static void main(String[] args){

	try{
	    DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	    String uri = "/Users/ricardoparro/code/Exercises/file.xml";
	    Document doc = docBuilder.parse(uri);

	    //get node list
	    List<String> aux = new ArrayList<String>();
	    removeDuplicate(doc.getDocumentElement(), aux);
	   
	    //print the new document out
	    printXmlDocument(doc);
	   
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }

    public static void printXmlDocument(Document doc){
	try{
	    DOMSource domSource = new DOMSource(doc);
	    StringWriter writer = new StringWriter();
	    StreamResult result = new StreamResult(writer);
	    TransformerFactory tf = TransformerFactory.newInstance();
	    Transformer transformer = tf.newTransformer();
	    transformer.transform(domSource, result);
	    System.out.println("XML IN String format is: \n" + writer.toString());
	}
	catch (Exception ex) {
            ex.printStackTrace();
        }
	
    }

    public static void removeNode(Node node){
	Node parentNode = node.getParentNode();
	String value = parentNode.getTextContent();
	parentNode.removeChild(node);
	parentNode.setTextContent(value);
    }
    
    //with recursion using DOM
    public static void removeDuplicate(Node node, List<String>  aux){
	
	//check if node exists
	if(aux.contains(node.getNodeName()))
	     removeNode(node);
	else
	    //add node name to aux list
	    aux.add(node.getNodeName());
      
	NodeList nodeList = node.getChildNodes();
	iterateOverXml(nodeList, aux);
    }
    public static void iterateOverXml(NodeList nodeList, List<String> aux){
    
	for (int i = 0; i < nodeList.getLength(); i++) {
            Node currentNode = nodeList.item(i);
            if (currentNode.getNodeType() == Node.ELEMENT_NODE)
                //calls this method for all the children which is Element
		removeDuplicate(currentNode, aux);
        }
    
    }
}