package com.Refrence;

public class Main {
	public static void main(String[] args) {
		Student s = new Student();
		RunInterface r = s :: StudentRunning;
		r.run();
	}
}