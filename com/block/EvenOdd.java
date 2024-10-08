package com.block;

public class EvenOdd {
	public String EvenOdd(int a) {
		if(a % 2 == 0) {
			return a;
		}else {
			return "Odd Number";
		}
	}
	public static void main(String args[]) {
		EvenOdd Check = new EvenOdd();
		String x = Check.EvenOdd(5); 
		System.out.println(x);
	} 

}
