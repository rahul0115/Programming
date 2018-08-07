package com.java.programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class DuplicateFromArrayList {
public static void main(String[] args) {
	
ArrayList<String> al= new ArrayList<String>();

al.add("Alok");
al.add("Ranjan");
al.add("Rahul");
al.add("Kumar");
al.add("Alok");
al.add("Ranjan");


System.out.println("ArrayList With Duplicates:"+al);

//using LinkedHashSet

LinkedHashSet<String> hs=new LinkedHashSet<String>(al);

ArrayList<String> al2=new ArrayList<String>(hs);

System.out.println(" ArrayList Without Duplicates values: "+al2);

//By using Iterative Method

System.out.println("=====================================================");
System.out.println("By Using iterative method :"); 

for(int i=0;i<al.size();i++) {

	for(int j=i+1;j<al.size();j++) {
	if(al.get(i).equals(al.get(j))) {
		al.remove(j);
		j--;
	}
	}
	 }
System.out.println(al);

System.out.println("=====================================================");
System.out.println("Logic to Find duplicates in ArrayList:"); 

Map<String, Integer> duplicates = new HashMap<String, Integer>();

for (String str : al) {
   if (duplicates.containsKey(str)) {
      duplicates.put(str, duplicates.get(str) + 1);
   } else {
      duplicates.put(str, 1);
   }
}

for (Map.Entry<String, Integer> entry : duplicates.entrySet()) {
   System.out.println(entry.getKey() + " = " + entry.getValue());
}
}
}
