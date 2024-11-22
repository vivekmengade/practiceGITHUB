package com.loop;

public class Revrse {
	public static void Rev(int num) {
//		num =526;
		int rev = 0;
		while(num!=0) {
			int res = num % 10;
			 rev= (rev*10) + res;
			 num/=10;
			 
		}
		System.out.println(rev);
	}
	public static void main(String args[]) {
		Revrse.Rev(652);;
	}
}
