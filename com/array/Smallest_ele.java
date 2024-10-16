package com.array;

public class Smallest_ele {
	static void Small_ele(int a[]) {
		int small = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]<small) {
				small=a[i];
			}
		}
		System.out.println(small);
	}
	public static void main(String arg[]) {
		int a[]= {9,2,3,4,51,2};
		Smallest_ele.Small_ele(a);
	}
}
