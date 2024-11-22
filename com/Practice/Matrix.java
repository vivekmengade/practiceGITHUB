package com.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
	static void Matrix() {
		int matrix[]= new int[2];
		int matrix2[][]=new int [2][2];
		Scanner sc=new Scanner(System.in);				
		for(int i=0;i<matrix.length;i++) {
			System.out.println("enter element of matrix 1d array");
			matrix[i]=sc.nextInt();
		}
		for(int i=0;i<matrix2.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				System.out.println("enter element on position"+i+" "+j);
				matrix2[i][j]=sc.nextInt();
			}
		}
		System.out.println("2D Matrix"+Arrays.deepToString(matrix2));
		System.out.println("1D Matrix"+Arrays.toString(matrix));
	}
	public static void main(String args[]) {
		Matrix.Matrix();
	}
}
