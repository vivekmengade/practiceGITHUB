package com.String1;

public class CountI {
	public void CountI(String str) {
		str=str.toLowerCase();
		char I='i';
		int cnt=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == I) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	public static void main(String args[]) {
		CountI obj = new CountI();
		obj.CountI("is this pen Which one i see in the pocket of Vivek");
	}
}
