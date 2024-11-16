package com.Overloading;

public class MathOP {
	public void operation(int a, int b) {
		System.out.println("addding = "+(a+b));
		
	}
	int operation(int a, int b, int c) {
		return a-b-c;
	}
	int operation(int a, int b, String name) {
		System.out.println(name);
		return a*b;
	}
	public void operetion() {
		System.out.println(10/5);
	}
}
