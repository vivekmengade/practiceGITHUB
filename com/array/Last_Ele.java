package com.array;

public class Last_Ele {
	public static void lst_ele(int a[]) {
		System.out.println(a[a.length-2]);
	}
	public static void main(String args[]) {
		int a[]= {11,98,74,87,60};
		Last_Ele.lst_ele(a);
	}
}
