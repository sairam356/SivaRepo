package com.corejavaPratice.collectionframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Properties;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LinkedHashMapExample {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		JSONParser  jsonPr = new  JSONParser();
		
		FileReader  file = new FileReader("C:\\Users\\gsair\\Desktop\\SivaSaiChatinya\\siva.json");
		
		//Object parse = jsonPr.parse(file);
		
		StringBuffer sb = new StringBuffer();
		sb.append("{\"sairam\" :");
		sb.append("\"sa\"}");
		
		
		Object parse = jsonPr.parse(sb.toString());
		
		System.out.println(parse);

		LinkedHashMap lmp = new LinkedHashMap();
		lmp.put(1, "sairam");
		lmp.put("2", "sairam2");
		lmp.put(90, "Test3");
		System.out.println(lmp);
		
	     
		
		Collections.synchronizedMap(lmp);
		
		
		//HashTable 
		
	   @SuppressWarnings("rawtypes")
	Hashtable  map  = new Hashtable();
	   map.put(12, "saira");
	 
	   System.out.println(map);
    
	   
	   Properties  ps = new Properties();
	   ps.load(new FileInputStream("C:/Users/gsair/Desktop/SivaSaiChatinya/Test.properites"));
	   
	   System.out.println(ps.get("Test"));
	   
	
	   
	   
	   
	}

}
