package com.java.programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MutliMapTest {
	public static void main(String... args) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();

		  // create list one and store values

		    List<String> One = new ArrayList<String>();
		    One.add("Apple");
		    One.add("Aeroplane");
        System.out.println(One);
        
  System.out.println("========================================");      
        
		    // create list two and store values
		    List<String> Two = new ArrayList<String>();
		    Two.add("Bat");
		    Two.add("Banana");
		    System.out.println(Two);
		    // put values into map

		    
	System.out.println("========================================");
	
	List<String> Three=new ArrayList<String>();
	Three.add("Alok");
	Three.add("Ranjan");
	Three.add("Ray");
	
	
		    map.put("A", One);
		    map.put("B", Two);
		    map.put("C", Three);
		    
		System.out.println(map);
	
		
	//	System.out.println(map.get("C")); 
		
		}
}
