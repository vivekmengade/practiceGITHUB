package com.loop;

public class PrimeNo {
	public static void Prime(int num) {
		int cnt=0;
		for (int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.println(i);
				cnt++;
			}
		}
		if(cnt==2) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Composite Number");
		}
	}
	public static void main(String args[]) {
		PrimeNo.Prime(10);
		
	}
}
