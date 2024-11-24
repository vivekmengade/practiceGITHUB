package com.Abstraction;

import java.util.Scanner;

public class Email extends Mail{
	public Email(String send,String sub, String body){
		super(send,sub,body);
	}
	@Override
	boolean authenticationmail() { 
		if(super.sendmail==null) {
			return false;
		}else {
			return true;
		}
		
	}
	@Override
	void connecting() {
		System.out.println("connecting....");
	}
	@Override
	void sendmail() {
		connecting();
		boolean x=authenticationmail();
		if(x==true) {
			System.out.println("Subject:- "+super.subject);
			System.out.println("Body:- "+super.body);
		}else {
			
		}
		disconnecting();
	}
	@Override
	void disconnecting() {
		System.out.println("Connection Disconnected.....");
	}
}
