package com.MultiProcessing;

public class MainMethod {

	public static void main(String[] args) throws InterruptedException {
		ThreadsMethod m1 = new ThreadsMethod();
		m1.start();
		m1.join(100);
		
		
		ThreadsMethod2 m2 = new ThreadsMethod2();
		m2.start();
	}
	
}
