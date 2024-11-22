package com.array;

import java.util.Scanner;

public class Rev_Array {
	static int a[];
	public static void accept() {
		System.out.println("Enter the size of Element");
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		a=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter "+i+" Element");
			int ele=sc.nextInt();
			a[i]=ele;
		}
	}
	public static void Rev(int a[]) {
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
//			if(b[i]<0) {
//				System.out.println(b[i]);
//			}
		}
	}
	public static void main(String args[]) {
		Rev_Array.accept();
		Rev_Array.Rev(a);
	}
	
}
