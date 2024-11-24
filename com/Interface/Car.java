package com.Interface;

public class Car extends AbstractVehicle{

	
	
	double Speed;
	public Car(String b,double Speed){
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
		System.out.println("Speed is Accelerate = "+this.Speed);
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
