package com.Practice;

public class SortChar {
	public static void sort() {
		String str;
		str = "aEbdcgf";
		str=str.toLowerCase();
		char ch[]=str.toCharArray();
		for(int i=0; i<ch.length-1;i++) {
			for(int j=i+1; j<=ch.length-1; j++) {
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		for(int k=0; k <ch.length;k++) {
			
			System.out.print(ch[k]+" ");
		}
	}
	
	
	public static void main(String args[]) {
		SortChar.sort();
	}
}
