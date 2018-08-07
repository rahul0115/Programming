package com.java.programming;

public class ReverseNumber {
public static void main(String[] args) {
	int rev=0,digit=0;
	int num=123456789;
	while(num >0) {
		digit=num%10;
		rev=rev*10+digit;
		num=num/10;
	
		
	}
	System.out.println(rev); 
}
}
