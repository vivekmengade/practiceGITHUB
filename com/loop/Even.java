package com.loop;

public class Even {
	public void Even(int a) {
		int cnt=0;
		for(int i = 2;i<=a;i++) {
			if(a%i==0){
				System.out.println(i);
			}
			
		}
	}
	public static void main(String args[]) {
		Even obj=new Even();
		obj.Even(100);
	}

}

