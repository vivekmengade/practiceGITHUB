package com.block;

public class DivisibleBY3_5 {
	public String DivisibleBY3_5(int a) {
		if(a % 3 == 0 && a % 5 == 0) {
			return "Divisible By 3&5";
		}else {
			return "Not Divisible By 3&5";
		}
	}
	public static void main(String args[]) {
		DivisibleBY3_5 Check = new DivisibleBY3_5();
		String x = Check.DivisibleBY3_5(15);
		System.out.println(x); 
	}
}
