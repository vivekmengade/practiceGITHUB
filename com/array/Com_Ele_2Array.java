package com.array;

public class Com_Ele_2Array {
	static void _2Array(int a[],int b[]) {
		for(int i=0;i<a.length;i++) {
			int cnt=0;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					cnt++;
				}
			}
			if(cnt==1) {
				System.out.println(a[i]+" ");
			}
		}
	}
	public static void main(String arg[]) {
		int arr[]={11,22,33,444,55,6};
		int arr2[]={1,22,33,44,54,6};
		Com_Ele_2Array._2Array(arr,arr2);
	}
}
