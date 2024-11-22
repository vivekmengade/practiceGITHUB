package com.String1;

public class SortChar {
	public static void rev() {
		String str = "aecbd";
		char []ch=str.toCharArray();
		for(int i=0; i < ch.length-1; i++) {
			for(int j=i+1; j<=ch.length-1; j++) {
				if(ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
//			System.out.println(ch);
		}
		for(int k=0; k<ch.length-1;k++) {
			System.out.print(ch[k]+" ");
		}
	}
	public static void main(String arg[]) {
		SortChar.rev();
	}
}
