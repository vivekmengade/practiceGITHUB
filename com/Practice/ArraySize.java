package com.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySize {
	static void size(int q) {
		int a[]= new int[q];
		for(int i = 0; i<a.length;i++) {
			System.out.println("enter elements in array");
			Scanner sc= new Scanner (System.in);
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
	}
	public static void main(String args[]) {
		System.out.println("Enter the size of array");
		Scanner sc= new Scanner (System.in);
		int s=sc.nextInt();
		ArraySize.size(s);
	}
}
