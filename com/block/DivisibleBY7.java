package com.block;

public class DivisibleBY7 {
	public String EvenOdd(int a) {
		if(a % 7 == 0) {
			return "Divisible By 7";
		}else {
			return "Not Divisible By 7";
		}
	}
	public static void main(String args[]) {
		DivisibleBY7 Check = new DivisibleBY7();
		String x = Check.EvenOdd(6);
		System.out.println(x);
	}
}
