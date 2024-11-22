package com.loop;

public class CalPower {
	public static void Cal(int num) {
		int power=4 ,res = 1;
		for(int i = 1;i<=power;i++) {
		res =res*num;
		}
		System.out.println(res);
	}
	public static void main(String args[]) {
		CalPower.Cal(2);
	}
}
