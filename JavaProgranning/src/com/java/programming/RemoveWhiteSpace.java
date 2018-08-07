package com.java.programming;

public class RemoveWhiteSpace {
public static void main(String[] args) {
 
String Str="Hello Java  Programming";	

String s=Str.replaceAll("\\s", "");
System.out.println(s);
}
}
