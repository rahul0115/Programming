package com.java.programming;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInString {
	
public static void main(String[] args) {
	
 String str="Hello Java Programming ";
 
 HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
 
 char[] ch=str.toCharArray();
 for(Character c:ch) {
	if(hm.containsKey(c)) {
		 hm.put(c, hm.get(c)+1);
 }
	else {
		hm.put(c,1);
}
}
 
Set<Character> hs=hm.keySet();
System.out.println("Duplicate Characters In "+str);

for(Character ch1:hs) {
	 if(hm.get(ch1) > 1)
     {
         //If any char has a count of more than 1, printing it's count

         System.out.println(ch1 +" : "+ hm.get(ch1));
     }
}
}
}