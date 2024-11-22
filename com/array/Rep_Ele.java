package com.array;

public class Rep_Ele {
	static void Rep_ele(int a[]) {
		for(int i=0; i<a.length; i++) {
			int cnt=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]){
					cnt++;
				}
			}
			if(cnt==1) {
				System.out.print(a[i]+" ");
			}
		}
	}
	public static void main(String arg[]) {
		int arr[]= {11,22,11,33,44,22,55,33};
		Rep_Ele.Rep_ele(arr);
	}
}
