package com.array;

public class Max_Ele {
	public static void max(int a[]) {
		int max=0;
		for(int i=a.length-1;i>=0;i--) {
			
			if(max<a[i]) {
				max=a[i];
			}
			
		}
		System.out.println(max);
	}
	public static void main(String args[]) {
		int a[]= {11,22,33,44,55,66};
		Max_Ele.max(a);
	}
}
