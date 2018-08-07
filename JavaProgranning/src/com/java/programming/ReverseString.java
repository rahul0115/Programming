package com.java.programming;

public class ReverseString {
public static void main(String[] args) {

String str="Welome to Java  Programm";

// way 1

/*StringBuffer sb= new StringBuffer(str);
sb.reverse();
System.out.println(sb);*/
//Way 2

/*char[] ch=str.toCharArray();
for(int i=ch.length-1;i>0;i--) {
	System.out.println(ch[i]);
}
*/
String str2=  reverseString("Welcome");

System.out.println(str2);
}
//Way 3
public static String reverseString(String str1) {
	if(str1==null||str1.length()<=1) {
		return str1;
	}else {
		 return reverseString(str1.substring(1)) + str1.charAt(0);
	}
}

 
}
