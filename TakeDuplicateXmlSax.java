import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.NodeList;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.*;

public class TakeDuplicateXmlSax{

    public static void main(String[] args){
	
	parseDocument();
    }

    public static void parseDocument() {
        // parse
        //SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser parser = new SAXParser();
            parser.parse("/Users/ricardoparro/code/Exercises/file.xml");
        } catch (Exception e) {
            System.out.println("ParserConfig error");
        } 
    }


}