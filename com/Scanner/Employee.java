package com.Scanner;

import java.util.Scanner;

public class Employee {
	public static void Diplayinfo() {
		int id,age, exp;
		double contNo , Sal;
		String name,add;
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter Name");
		name = Sc.next();
		System.out.println("Enter Id");
		id = Sc.nextInt();
		System.out.println("Enter Salary");
		Sal = Sc.nextDouble();
		System.out.println("Enter Address");
		add = Sc.next();
		System.out.println("Enter ContactNo.");
		contNo =Sc.nextDouble();
		System.out.println("Enter Experience");
		exp = Sc.nextInt();
		System.out.println("Enter Age");
		age = Sc.nextInt();
		System.out.println("Name = "+name);
		System.out.println("ID = "+id);
		System.out.println("Salary = "+Sal);
		System.out.println("Address = "+add);
		System.out.println("Contact Number = "+contNo);
		System.out.println("Experince = "+exp);
		System.out.println("Age = "+age);
		
		
		
		
	}
	public static void main(String args[]) {
		Employee.Diplayinfo();
	}
}
