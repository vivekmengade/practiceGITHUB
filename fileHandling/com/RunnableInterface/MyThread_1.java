package com.RunnableInterface;

public class MyThread_1 implements Runnable{
	@Override
	public void run() {
		int i =1;
		while(i<=5) {
			System.out.println(i+". My Thread - 1");
			i++;
		}
	}
}
