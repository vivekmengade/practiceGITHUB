package com.array;

public class _2nd_Smallest_ele {
	static void small_ele(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print(a[1]);
	}
	public static void main(String arg[]) {
		int a[]= {11,66,44,88,99};
		_2nd_Smallest_ele.small_ele(a);
	}
}
