package com.RunnableInterface;

public class Main {
	public static void main(String[] args) {
		MyThread_1 m1 = new MyThread_1();
		Thread t1= new Thread(m1);
		t1.start();
		
		System.out.println("-----------------");
		MyThread_2 m2 = new MyThread_2();
		Thread t2 = new Thread(m2);
		t2.start();
	}
}
