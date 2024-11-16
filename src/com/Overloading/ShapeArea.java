package com.Overloading;

public class ShapeArea {
	void area(double l) {
		System.out.println("area of square = "+l*l);
	}
	public void area(double l, double h) {
		System.out.println("Area of Rectangle = "+l*h);
	}
	void area(double l, double b, String name) {
		System.out.println("this is area of "+name+"= "+l*b);
	}
	void area(double l, String name) {
		System.out.println("this is area of "+name+"= "+3.14*l );
	}
}
