package com.String1;

public class PalindromStr {
	public static void Palindrom(String str) {
		String rev =" ";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(str)) {
			System.out.println("String is palindrom");
		}else {
			System.out.println("String not palindrom");
		}
	}
	public static void main(String arg[]) {
		PalindromStr.Palindrom("ili");
	}
}
