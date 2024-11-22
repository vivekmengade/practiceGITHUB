package com.String1;

public class Revers {
	
	public static void rev(String str) {
		String rev = new String();
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
	}
	public static void main(String arg[]) {
		Revers.rev("hello boys");
	}
	
}
