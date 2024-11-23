package com.Abstraction;

public abstract class Mail {
	String sendmail;
	String subject;
	String body;
	public Mail(String mail, String sub, String body){
		this.sendmail=mail;
		this.subject=sub;
		this.body=body;
		
	}
	abstract boolean authenticationmail();
	abstract void connecting();
	abstract void sendmail();
	abstract void disconnecting();
	
}
