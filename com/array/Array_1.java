package com.array;
import java.util.Scanner;



public class Array_1 {
	static int a[];
	public static void Accept() {
		int size;
		System.out.println("Enter Size of an Array");
		Scanner sc = new Scanner(System.in);
		size=sc.nextInt();
		a = new int[size];
		for(int i =0; i<a.length; ) {
			System.out.println("Enter "+i+"index element");
			int ele = sc.nextInt();
			
			if(ele %2==0) {
				a[i]=ele;
				i++;
			}else{
				System.out.print("Enetr another Number   ");
//				i--;
			}
		}
	}
	
	
	public static void print() {
		for(int j=0; j<a.length;j++) {
			System.out.print(a[j]);
		}
	}
	public static void main(String args[]) {
		Array_1.Accept();
		Array_1.print();
	}
}
