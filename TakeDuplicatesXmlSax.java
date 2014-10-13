import java.io.FileReader;

import org.xml.sax.XMLReader;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.helpers.XMLReaderFactory;
import org.xml.sax.helpers.DefaultHandler;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.*;
import java.util.Arrays;

public class TakeDuplicatesXmlSax extends DefaultHandler
{
    
    List<String> listAux = new ArrayList<String>();

    public static void main (String args[])
	throws Exception
    {
	XMLReader xr = XMLReaderFactory.createXMLReader();
	TakeDuplicatesXmlSax handler = new TakeDuplicatesXmlSax();
	xr.setContentHandler(handler);
	xr.setErrorHandler(handler);
	
	// Parse each file provided on the
	// command line.
	FileReader r = new FileReader("/Users/ricardoparro/code/Exercises/file.xml");
        
	//char[] a = new char[150];
	//r.read(a);
	//for(char c : a)
	//    System.out.print(c);
	//r.close();
	
	 InputSource input = new InputSource(r);
	 xr.parse(input);
	
	
	
    }


    public TakeDuplicatesXmlSax ()
    {
	super();
    }


    ////////////////////////////////////////////////////////////////////
    // Event handlers.
    ////////////////////////////////////////////////////////////////////


    public void startDocument ()
    {
	System.out.println("Start document");
    }


    public void endDocument ()
    {
	System.out.println("End document");
    }


    public void startElement (String uri, String name,
			      String qName, Attributes atts)
    {
	if ("".equals (uri))
	    System.out.println("Start element: " + qName);
	else
	    System.out.println("Start element: {" + uri + "}" + name);


	if(this.listAux.contains(qName)){
	    
	}
	else{
	
	}


    }


    public void endElement (String uri, String name, String qName)
    {
	if ("".equals (uri))
	    System.out.println("End element: " + qName);
	else
	    System.out.println("End element:   {" + uri + "}" + name);
    }


    public void characters (char ch[], int start, int length)
    {
	System.out.print("Characters:    \"");
	for (int i = start; i < start + length; i++) {
	    switch (ch[i]) {
	    case '\\':
		System.out.print("\\\\");
		break;
	    case '"':
		System.out.print("\\\"");
		break;
	    case '\n':
		System.out.print("\\n");
		break;
	    case '\r':
		System.out.print("\\r");
		break;
	    case '\t':
		System.out.print("\\t");
		break;
	    default:
		System.out.print(ch[i]);
		break;
	    }
	}
	System.out.print("\"\n");
    }
}