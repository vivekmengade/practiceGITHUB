package com.array;

public class Larg_Ele_array {
	static void Odd_Ele(int a[]) {
		for(int i=0; i<a.length; i++) {
			int max=a[i];
			if(max>a[i] || max%2!=0) {
				System.out.println(max);
			}
//			if(a[i]%2!=0) {
//				System.out.println(a[i]);
//			}
			}
		}
	public static void main(String arg[]) {
		int arr[]={11,22,33,444,55,6};
		Larg_Ele_array.Odd_Ele(arr);
	
	}
}
