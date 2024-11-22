package com.Abstraction;

public abstract class Stu_Joined {
	String name;
	int id;
	double marks;
	public Stu_Joined(String name, int id, double marks) {
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	public abstract void Display();
	public static void m1() {
		System.out.println("hello ");
		System.out.println("this is m1 method");
	}
}
