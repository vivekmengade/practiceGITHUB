package com.Overloading;

public class MainShapeArea {
	public static void main(String[] args) {
		ShapeArea a = new ShapeArea();
		a.area(5);
		a.area(5, 10);
		a.area(5,10, "Triangle");
		a.area(5,"circle");
		System.out.println("practicing of overloading");
		
	}
}
