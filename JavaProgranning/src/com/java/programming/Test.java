package com.java.programming;

public class Test {
public static void main(String[] args) {
//Pattern 1	
	System.out.println("Pattern1");
for(int i=1;i<=4;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print("*");
	}
	System.out.println("");
	
}

System.out.println("=========================================================");
//Pattern 2
System.out.println("Pattern2");
for(int i=1;i<=4;i++) {
	for(int j=4;j>=i;j--) {
		System.out.print("*");
	}
	System.out.println(""); 
	
}

System.out.println("=========================================================");
//Pattern 3
System.out.println("Pattern3");
for(int i=1;i<=4;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print("*");
	}
	System.out.println("");
}
for(int i=1;i<=4;i++) {
	for(int j=3;j>=i;j--) {
		System.out.print("*");
	}
	System.out.println(""); 
	
}

System.out.println("=========================================================");
//Pattern 4
System.out.println("Pattern4");

for(int i=1; i<=4;i++) {
	for(int j=3;j>=i;j--) {
		System.out.print(" ");		
	}
	
for(int k=1;k<=i;k++) {
System.out.print("*");	
}
System.out.println(" ");
}
System.out.println("=========================================================");
//Pattern 5
System.out.println("Pattern5");
for(int i=1;i<=4;i++) {
    for(int j=1;j<=i;j++) {
	System.out.print(" "); 
	
}
for(int k=4;k>=i;k--) {
	System.out.print("*"); 
	
}
System.out.println(" ");
}
System.out.println("=========================================================");
//Pattern 6
System.out.println("Pattern6");
for(int i=1; i<=4;i++) {
	for(int j=3;j>=i;j--) {
		System.out.print(" ");		
	}
	
for(int k=1;k<=i;k++) {
System.out.print("*");	
}
System.out.println(" ");
}
for(int i=1;i<=4;i++) {
    for(int j=1;j<=i;j++) {
	System.out.print(" "); 
	
}
for(int k=3;k>=i;k--) {
	System.out.print("*"); 
	
}
System.out.println(" ");
}

System.out.println("=========================================================");
//Pattern 7
System.out.println("Pattern7");

for(int i=1;i<=4;i++) {
	for(int j=4;j>=i;j--) {
		System.out.print(" ");
	}
	
    for(int k=1;k<=i;k++) {
    System.out.print(" *");	
    }
    System.out.println(" ");
}

//Pattern 7
System.out.println("Pattern8");

for(int i=1;i<=4;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(" ");
	}
	for(int k=4;k>=i;k--) {
		System.out.print(k);
	}
	for(int l=4;l>=i;l--) {
		System.out.print(l);
	}
	
	
	System.out.println(" ");
	
}

System.out.println("=========================================================");

}
}
