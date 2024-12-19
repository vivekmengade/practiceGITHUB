package com.Refrence;

public class Main {
	public static void main(String[] args) {
		Student s = new Student();
		RunInterface r = s :: StudentRunning;
		r.run();
		RunInterface r1 = Student::PRun;
		r1.run();
		RunInterface r2 = Student :: new;
		r2.run();
	}
}
