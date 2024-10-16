package com.array;

public class _2nd_max {
	static void max2(int a[]) {
		int max=0;
		for(int i=0; i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp= a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
//			if(max<a[i]) {
//				max=a[i];
//			}
			System.out.print(a[i]+" ");
		}
		System.out.print(a[a.length-2]+" ");
	}
	public static void main (String args[]) {
		int a[]= {11,44,22,77,33};
		_2nd_max.max2(a);
	}
}
