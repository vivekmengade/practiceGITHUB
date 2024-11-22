package com.Abstraction;

public class ATM_Verify extends ATM{
	public ATM_Verify(String a, int no, String b,double bal){
		super(a,no,b,bal);
	}
	@Override
	public void display() {
		System.out.println(" Your name = "+super.AC_name);
		System.out.println(" Your Account number = "+super.AC_No);
		System.out.println(" Your Branch name = "+super.Branch);
		System.out.println(" Your Balance = "+super.Balance);
	}
	@Override
	void deposite(float D) {
		System.out.println(super.Balance+" = this is balance before Deposite.");
		System.out.println(D+"this is Deposite amount.");
		System.out.println((super.Balance+D)+"this is balance after Deposite.");
		super.Balance=super.Balance+D;
	}
	@Override
	void withdraw(float W) {
		System.out.println(super.Balance+" = this is balance before withdraw.");
		System.out.println(W+"this is withdraw amount.");
		System.out.println((super.Balance-W)+"this is balance after withdarw.");
		super.Balance=super.Balance-W;
	}
}
