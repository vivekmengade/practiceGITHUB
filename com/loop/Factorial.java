package com.loop;

public class Factorial {
	public static void Fact(int num) {
		int ans =1;
		for(int i=1; i<=num; i++) {
			
			ans*=i;
		}
//		return ans;
		System.out.println(ans);
			
	}
	public static void main(String args[]) {
		Factorial.Fact(5);
	}
}
