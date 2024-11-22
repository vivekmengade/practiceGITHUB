package com.loop;

public class Countno {
	public static void main(String args[]) {
		int cnt = 0 ;
		int num = 55555;
		while(num!=0) {
			num/=10;
			cnt++;
		}
		System.out.println(cnt);
	}
}
