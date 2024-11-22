package com.Practice;

public class CountWords {
	public static void CountW() {
		String line = "i am vivek i have my laptop.";
		String ln[]=line.split(" ");
		int cnt=0;
		for(int i=0; i<ln.length;i++) {
			cnt++;
		}
		System.out.println(cnt);
		
	}
	public static void main(String args[]) {
		CountWords.CountW();
	}
}
