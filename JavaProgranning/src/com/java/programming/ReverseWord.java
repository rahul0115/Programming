package com.java.programming;

public class ReverseWord {
 public static void main(String[] args) {
	String str="Java is a programming language ";
	String[] s=str.split("");
	String rs="";
	System.out.println(s);
	for(int i=0;i<s.length;i++) {
	String word=s[i];
	String rw="";
	for(int j=word.length()-1;j>0;j--) {
		rw=rw+word.charAt(j);
	}
	rs=rs+rw+"";
	System.out.println(rs);
	}

}
}
