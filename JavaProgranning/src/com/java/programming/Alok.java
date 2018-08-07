package com.java.programming;

public class Alok {
	public static void main(String[] args) {

		char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };

		int j = ch.length;

		System.out.println("Alphabet from A to Z and a to z");

		for (int i = 0; i < ch.length; i++) {

			System.out.println(Character.toString(Character.toUpperCase(ch[i])) + Character.toString(Character.toUpperCase(ch[j - 1]) )+ " ");

			--j;
		}
		System.out.println();

	}
}
