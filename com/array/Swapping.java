package com.array;

public class Swapping {
	static void swap(int a,int b) {
		int temp1=a;
		a=b;
		b=temp1;
		System.out.println(a+","+b);
	}
	public static void main(String args[]) {
		Swapping.swap(5, 8);
	}
}
