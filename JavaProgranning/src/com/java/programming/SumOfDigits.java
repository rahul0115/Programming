package com.java.programming;

import java.util.Scanner;

public class SumOfDigits {
@SuppressWarnings("resource")
public static void main(String[] args) {
//(like 123=6,234=9,345=12 etc.)
int r,sum=0;
System.out.println("Eneter The Numbers:");
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();

while(n>0) {
r=n%10; //getting remainder for the number 
sum=sum+r; // adding remainder to the sum
n=n/10;


}
System.out.println(sum);
}
}
