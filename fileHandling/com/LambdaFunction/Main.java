package com.LambdaFunction;

public class Main {
	public static void main(String[] args) {
		StringInterface s = (String str)->str.length();
		System.out.println(s.findLength("Vivek Mengade"));
	}
}
