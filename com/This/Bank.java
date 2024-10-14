package com.This;
import java.util.Scanner;

public class Bank {
	String Bname="XYZ";
	double IFSC = 8096986;
	String Manager = "ABC";
	int EST_yr = 2000;
	String Location="Pune";
	public Bank(String Bname, Double IFSC, String Manager, int EST_yr, String Location) {
		this.Bname=Bname;
		this.IFSC=IFSC;
		this.Manager=Manager;
		this.EST_yr=EST_yr;
		this.Location=Location;
	}
	public void Display() {
		System.out.println("BANK NAME = "+Bname);
		System.out.println("IFSC CODE = "+IFSC);
		System.out.println("Manager NAME = "+Manager);
		System.out.println("Establish Year = "+EST_yr);
		System.out.println("Located in = "+Location);
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bank Name");
		String Bank=sc.nextLine();
		System.out.println("Enter IFSC No.");
		double ifsc=sc.nextDouble();
		System.out.println("Enter Manager Name");
		String mng=sc.next();
		System.out.println("Enter Establish Year");
		int yr=sc.nextInt();
		System.out.println("Enter Location");
		String loc=sc.next();
		Bank bank=new Bank(Bank,ifsc,mng,yr,loc);
		bank.Display();
	}
}
