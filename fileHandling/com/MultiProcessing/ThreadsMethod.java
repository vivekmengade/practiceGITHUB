package com.MultiProcessing;

public class ThreadsMethod extends Thread {
	@Override
	public void run() {
		int i = 1;
		while(i<=5) {
			System.out.println("Thread - 1");
			i++;
//			try {
//				sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(getId());
//			System.out.println(getState());
//			System.out.println(getThreadGroup());
//			System.out.println(isAlive());
//			System.out.println(getName());
//			setName("Set Name");
//			System.out.println(toString());
//			System.out.println(getClass());
//			if(i>10) {
//				stop();
//			}
		}
	}
}
