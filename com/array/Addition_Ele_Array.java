package com.array;

public class Addition_Ele_Array {

	static void Addition(int a[]) {
		int add=0;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1;j<a.length-1;j++) {
				add=a[i]+a[j];
			}
		}
		System.out.println(add);
	}
		public static void main(String arg[]) {
			int arr[]= {1,2,3,4};
			Addition_Ele_Array.Addition(arr);
		}
}
