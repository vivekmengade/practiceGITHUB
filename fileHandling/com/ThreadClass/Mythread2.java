package com.ThreadClass;

public class Mythread2 extends Thread{
	@Override
	public void run() {
		int i=1;
		while(i<=5) {
			System.out.println("My Thread - 2");
			i++;
		}
	}
}
