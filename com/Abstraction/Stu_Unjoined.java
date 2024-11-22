package com.Abstraction;

public class Stu_Unjoined extends Stu_Joined{

	public Stu_Unjoined(String name, int id, double marks) {
		super(name,id,marks);
	}
	 public void Display() {
		 System.out.println(super.name);
		 System.out.println(super.id);
		 System.out.println(super.marks);
	 }
	
}
