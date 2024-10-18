package com.array;
import java.util.Scanner;


public class Employee {
	int id;
	String name;
	double sal;
	public Employee (int id, String name, double sal) {
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	public Employee() {
		
	}
	static int cnt;
	static Employee emp [] = new Employee[4];
	static void accept() {
//		System.out.println("Enter Number Of Employees");
		Scanner sc=new Scanner(System.in);
//		cnt=sc.nextInt();
		for(int i=0;i<emp.length;i++) {
			System.out.println("Enter Employee Details = ID  ,  Name , Salary");
			int id=sc.nextInt();
			String name = sc.next();
			double sal= sc.nextDouble();
			emp[i]=new Employee(id,name,sal);
			
		}
	}
	public void sort() {
		for(int i=0; i<emp.length;i++) {
			for(int j = i+1;j<emp.length; j++) {
				if(emp[i].sal>emp[j].sal) {
					Employee temp=emp[i];
					emp[i]=emp[j];
					emp[j]=temp;
				}
			}
//			System.out.println("ID "+emp[i].id+" Name = "+emp[i].name+" Salary : "+emp[i].sal);
			System.out.println("Employee Name = "+emp[i].name+" Employee ID = "+emp[i].id+" Employee Salary = "+emp[i].sal);
		}
	}
}
