package com.Overriding;

public class Triangle extends Shape {
	double base;
	double height;
	Triangle(double base, double height, String Shape){
		super(Shape);
		this.base=base;
		this.height=height;	
	}
	double area() {
		double a= 0.5*base*height;
		return a;
	}
}
