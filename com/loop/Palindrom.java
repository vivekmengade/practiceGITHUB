package com.loop;

public class Palindrom {
	public static void Palindrom(int num) {
		int rev = 0;
		int temp =num;
		while(num!=0) {
			int res = num % 10;
			 rev= (rev*10) + res;
			 num/=10;
			 
		}
		System.out.println(rev);
		if(temp==rev) {
			System.out.println("number is palindrom");
		}else {
			System.out.println("number is  palindrom");
		}
	}
	public static void main(String args[]) {
		Palindrom.Palindrom(352);
	}
}
