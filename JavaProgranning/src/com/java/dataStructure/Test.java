package com.java.dataStructure;

public class Test {
public static void main(String[] args) {
	// Autoboxing
	int a=50;
	Integer a1= new Integer(a);
	
	Integer a2=5;
	
	System.out.println(a1+""+a2);
	//Unboxing
	Integer i=new Integer(50);  
    int i2=i;  
      
    System.out.println(i2);
}
}
