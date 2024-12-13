package com.MultiProcessing;

public class ThreadsMethod2 extends Thread{
	@Override
	public void run() {
		int i = 1;
		while(i<=5) {
			System.out.println("Thread - 2");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				
			}
			i++;
//			if(i==5) {
//				stop();
//			}
		}
	}
}
