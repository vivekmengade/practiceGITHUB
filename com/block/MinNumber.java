package com.block;

public class MinNumber {
	public void Num(int num1, int num2, int num3) {
		if (num1 < num2 && num1 < num3) {
	         System.out.println("The minimum number is: " + num1);
	     } else if (num2 < num1 && num2 < num3) {
	         System.out.println("The minimum number is: " + num2);
	     } else {
	            System.out.println("The minimum number is: " + num3);
	}
	}
	public static void main(String args[]) {
		MinNumber Check =new MinNumber();
		Check.Num(70, 50, 60);
	}
}
