package com.Overriding;

public class Square extends Shape{
	double side;
	Square(double side, String Shape){
		super(Shape);
		this.side=side;
		
	}
	double area() {
		double a=side*side;
		return a;
	}
}
