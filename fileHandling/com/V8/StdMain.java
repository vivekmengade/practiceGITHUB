package com.V8;

public class StdMain {
	public static void main(String[] args) {
		
		Student s = new Student() {
			@Override
			public void stdInfo(String Name, int id, Double Marks) {
				String StdN=Name;
				int sid=id;
				double SMarks=Marks;
				System.out.println("Student Name :-> "+StdN);
				System.out.println("Student ID :-> "+sid);
				System.out.println("Student Marks :-> "+SMarks);
			}
		};
		s.stdInfo("Vivek",1001,70.80);
	}
}
