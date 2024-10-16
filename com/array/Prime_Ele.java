package com.array;

import java.util.Scanner;

public class Prime_Ele {
	static int a[];
	public static void accept() {
		System.out.println("Enter the size of Element");
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		a=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter "+i+" Element");
			int ele=sc.nextInt();
			int cnt =0;
			for(int j =1;j<=ele;j++) {
				if(ele %2==0) {
					cnt++;
				}
			}
				if(cnt>=3 || ele!=0 || ele!=1) {
					a[i]=ele;
//					i++;
				}
			}
		}
		
//	}
	public static void print() {
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
	}
	public static void main(String ags[]) {
		Prime_Ele.accept();
		Prime_Ele.print();
	}
}
