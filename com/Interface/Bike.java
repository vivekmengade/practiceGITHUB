package com.Interface;

public class Bike extends AbstractVehicle{

	double Speed;
	public Bike(String b, double Speed) {
		super(b);
		this.Speed=Speed;
		
	}
	@Override
	public
	void Accelerate(double Speed) {
		if(Speed==0) {
			this.Speed=0;
		}
		this.Speed+=Speed;
		System.out.println("Speed is Decelerate = "+this.Speed);
	}
	@Override
	public
	void Decelerate(double Speed) {
		if(Speed==0) {
			this.Speed=0;
		}
		this.Speed-=Speed;
		System.out.println("Speed is Decelerate = "+this.Speed);
	}
}