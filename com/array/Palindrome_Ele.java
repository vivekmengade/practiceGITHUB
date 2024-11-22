package com.array;

import java.util.Scanner;

public class Palindrome_Ele {
	static int a[];
	static int ele;
	static int num=0;
	public static int check(int ele) {
		int rev = 0;
		while(ele!=0) {
			int red = ele % 10;
			 rev= (rev*10) + red;
			 ele/=10;
		}
		return rev;
	}
	public static void accept() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=sc.nextInt();
		a= new int[size];
		for(int i=0; i<a.length;) {
			System.out.println("enter "+i+" ELement  Of Array");
			 ele = sc.nextInt();
			 int x=Palindrome_Ele.check(ele);
			
			if(x==ele) {
				a[i]=ele;
				i++;
			}
			
			
			
		}
	}
	public static void print() {
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
