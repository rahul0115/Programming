package com.java.programming;

import java.util.Scanner;

public class MatrixCreation {

	public static void main(String[] args) {
		 
	Scanner sc= new Scanner(System.in);
	

	 
	System.out.println("Enter the Number of Rows :");
	int row=sc.nextInt();
	
	System.out.println("Enter the Number Of Colunms :");
	int column=sc.nextInt();
	int[][] matrix= new int[row][column];
	System.out.println("Enter the Matrix Data :");
	for(int i=0;i<row;i++) {
		for(int j=0;j<column;j++) {
			matrix[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter Your Matrix :");
	for(int i=0;i<row;i++) {
		for(int j=0;j<column;j++) {
			System.out.print(matrix[i][j]+" "); 
			
		}
		System.out.println(" ");
	}
	

	
	
	
	}

}
