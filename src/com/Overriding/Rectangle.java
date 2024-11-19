package com.Overriding;

public class Rectangle extends Shape{
	double l;
	double w;
	Rectangle(double l,double w, String Shape ){
		super(Shape);
		this.l=l;
		this.w=w;
	}
	double area() {
		double a=l*w;
		return a;
	}
}
