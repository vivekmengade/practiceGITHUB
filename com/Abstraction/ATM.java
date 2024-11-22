package com.Abstraction;

public abstract class  ATM {
	String AC_name;
	int AC_No;
	String Branch;
	double Balance;
	public ATM(String a,int no, String b,double bal) {
		this.AC_name=a;
		this.AC_No=no;
		this.Branch=b;
		this.Balance=bal;
	}
	abstract void deposite(float D);
	abstract void withdraw(float W);
	abstract void display();
}
