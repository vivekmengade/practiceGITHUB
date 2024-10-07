package com.block;

public class GreaterNo {
	public void Num(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
	         System.out.println("The maximum number is: " + num1);
	     } else if (num2 > num1 && num2 > num3) {
	         System.out.println("The maximum number is: " + num2);
	     } else {
	            System.out.println("The maximum number is: " + num3);
	}
	}
	public static void main(String args[]) {
		GreaterNo Check =new GreaterNo();
		Check.Num(10, 50, 60);
	}
}
