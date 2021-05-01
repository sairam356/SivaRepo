package com.corejavaPratice.collectionframework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	
	

	public static void main(String[] args) {
		
		
		Map<String ,String> map = new HashMap<>();
		
		HashMap map1 = new HashMap();
		map1.put(1, "sairam");
		map1.put("2", "sairam2");
		
		System.out.println(map1.get(1));
		
	    map1.forEach((x,y) ->{
	    	   System.out.println("#########"+x+"  "+y);
	    });
		
	    Set keySet = map1.keySet();
	    System.out.println(keySet);
	    
	    Set entrySet = map1.entrySet();
	    Iterator iterator = entrySet.iterator();
	    
	    while(iterator.hasNext()) {
	    	System.out.println(iterator.next());
	    }
		
		System.out.println(map1);
		
		//map1.remove(1);
		System.out.println("@@"+map1);
		map1.put(1, "sairam12");
		System.out.println(map1);
		map1.put("232", "sairam");
		System.out.println(map1);
		map1.put(null, "rege");
		
		map1.put(null, "egege");
		map1.put("3r3",null);
		map1.put("sdfs", null);
		System.out.println(map1);
		
		Map  map3 = new HashMap();
		
		map3.put("q3rw", "Test1");
		map3.put(0, "Test");
		map3.put(1,"Test2");
		map3.put(2, "Test3");
		
		//System.out.println(map3);
		
		Collections.synchronizedMap(map3);
		map3.put(7, "Test");
		map3.put(12,"Test2");
		map3.put(23, "Test3");
		
		
		System.out.println(map3);
		
		
	}
}
