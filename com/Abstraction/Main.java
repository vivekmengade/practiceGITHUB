package com.Abstraction;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		Stu_Joined s = new Stu_Unjoined("vivek", 101, 90.5);
//		s.Display();
//		s.m1();
		System.out.println("Enter your name= ");
		String name=s.next();
		System.out.println("Enter your Account Number = ");
		int no = s.nextInt();
		System.out.println("Enter your Branch Name = ");
		String branch = s.next();
		System.out.println("Enter your Balance = ");
		double bal = s.nextDouble();
		
		
		ATM a= new ATM_Verify(name,no,branch,bal);
		a.display();
		
		
		System.out.println("Enter your Withdraw Amount = ");
		float W = s.nextFloat();
		System.out.println("Enter your Deposite Amount = ");
		float D = s.nextFloat();
		
		
		a.withdraw(W);
		a.deposite(D);
	}
}
