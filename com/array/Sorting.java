package com.array;

import java.util.Arrays;

public class Sorting {
	public static void Sort(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int k=i+1;k<a.length;k++) {
				
				if(a[i]>a[k]) {
					int temp=a[i];
					a[i]=a[k];
					a[k]=temp;
				}
			}
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String args[]) {
		int a[]= {11,33,22,5,8,1};
		Sorting.Sort(a);
		
		
		
		
		System.out.println("inbuilt method keyword");
		Arrays.sort(a);
		System.out.print(Arrays.toString(a));
	}
}
