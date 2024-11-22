package com.array;

import java.util.Scanner;

public class Odd_Ele {
	static int a[];
	public static void accept() {
		System.out.println("Enter the size of Element");
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		a=new int[size];
		for(int i=0;i<a.length;) {
			System.out.println("Enter "+i+" Element");
			int ele=sc.nextInt();
			if(ele %2!=0) {
				a[i]=ele;
				i++;
			}
		}
		
	}
	public static void print() {
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
	}
	
	
}
