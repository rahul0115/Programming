package com.java.programming;

public class ArmstrongExample {
public static void main(String[] args) {
	int sum=0,r,temp=0;
	int num=153;
	temp=num;
	while(num>0) {
	r=num%10;
	sum=sum+(r*r*r);
	num=num/10;
	}
	if(temp==sum) {
		System.out.println("Armstronge");
	}else {
		System.out.println("Not"); 
		
	
		
	}
}
}
