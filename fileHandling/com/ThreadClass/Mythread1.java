package com.ThreadClass;

public class Mythread1 extends Thread{
	@Override
	public void run() {
		int i=1;
		while(i<=50) {
			System.out.println("My Thread - 1");
			i++;
		}
	}
}
