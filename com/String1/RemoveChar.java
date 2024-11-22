package com.String1;

public class RemoveChar {
	
	public static void main(String args []) {
		String a[]= {"@#jp&ma++"};
		String A[]=a.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(A);
	}
}
