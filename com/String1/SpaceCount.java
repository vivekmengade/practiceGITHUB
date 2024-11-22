package com.String1;

public class SpaceCount {
	public static void Spacecnt(String str) {
		str=str.trim();
//		String space=" ";
		int cnt=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ') {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	public static void main(String arg[]) {
		SpaceCount.Spacecnt(" I am Vivek and i am also a developer");
	}
}
