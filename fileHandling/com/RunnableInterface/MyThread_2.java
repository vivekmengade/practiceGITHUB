package com.RunnableInterface;

public class MyThread_2 implements Runnable{
	@Override
	public void run() {
		int i =1;
		while(i<=5) {
			System.out.println(i+". My Thread - 2");
			i++;
		}
	}
}