package com.LambdaFunction;

public class MathOPImplemented {
	public static void main(String[] args) {
		MathOP m1 = (double a, int b)->a+b;
		System.out.println(m1.add(10.5, 5));
	}
}
