package com.ThreadClass;

public class Main {
	public static void main(String[] args) {
		Mythread1 m1 = new Mythread1();
		m1.start();
		Mythread2 m2 = new Mythread2();
		m2.start();
		m2.start();
		m1.start();
	}
}
