package com.array;

public class _2nd_Large_ele {
	static void Large_ele(int a[]) {
		for(int i=0; i<a.length; i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
				}
			}
			
			System.out.print(a[i]+" ");
		}
		System.out.println(a[a.length-2]);
	}
	public static void main(String arg[]) {
		int a[]= {9,22,3,4,51};
		_2nd_Large_ele.Large_ele(a);
		
	}
}
