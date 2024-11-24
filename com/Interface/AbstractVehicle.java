package com.Interface;

public abstract class AbstractVehicle implements Vehicle {
	
	@Override
	public
	void Start() {
		System.out.println("Vehicle is Start");
	}
	@Override
	public 
	void Stop() {
		System.out.println("Vehicle is Stop");
	}
	@Override
	public
	void Accelerate(double Speed) {}
	@Override
	public
	void Decelerate(double Speed) {}
	
	
	String Brand;
	String getBrand(String Brand) {
		return Brand;
	}
	String setBrand() {
		System.out.println(this.Brand+" is the Brand Of Vehicle");
		return this.Brand;
	}
	public AbstractVehicle(String B){
		this.Brand=B;
	}

}
