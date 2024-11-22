package com.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class AccaptEven {
	void Even(){
		Scanner sc=new Scanner(System.in);
		int a = 0;
		System.out.println("enter size of array");
		a=sc.nextInt();
		int arr[]=new int[a];
		for(int i =0 ; i<arr.length;i++) {
			System.out.println("enter ele");
			int ele=sc.nextInt();
			if(ele%2==0) {
				arr[i]=ele;
			}else {
				System.out.println("no. is not even");
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String args[]) {
		AccaptEven a=new AccaptEven();
		a.Even();
	}
	
}
