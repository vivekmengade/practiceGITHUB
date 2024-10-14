package com.This;

import java.util.Scanner;

public class Math_OP {
	static int a;
	static int b;
	static int Add(int a,int b) {
		int c= a+b;
		System.out.println(c);
		return c;
	}
	static int Sub(int a, int b) {
		int c= a-b;
		System.out.println(c);
		return 0;
	}
	static int Mul(int a, int b) {
		int c= a*b;
		System.out.println(c);
		return a*b;
	}
	static int Div(int a, int b) {
		int c= a/b;
		System.out.println(c);
		return a/b;
	}
	public Math_OP(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int x;
		int y;
		System.out.println("Enter 1st Number");
		x=sc.nextInt();
		System.out.println("Enter 2nd Number");
		y=sc.nextInt();
		Math_OP math=new Math_OP(x,y);
		System.out.println("Enter your choice");
		System.out.println("Enter 1st Number");
		System.out.println("1.Addtion");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Divide");
		int ch =sc.nextInt();
		switch(ch){
			case 1:Add(a,b);
			break;
			case 2:Sub(a,b);
			break;
			case 3:Mul(a,b);
			break;
			case 4:Div(a,b);
			break;
		}
		
	}
}
