package com.Overriding;

public class Main {
	public static void main(String[] args) {
		Square s = new Square(5.5,"Square");
		double a=s.area();
		System.out.println("this is area of "+s.ShapeName+" = "+a);
		Rectangle r = new Rectangle(12.5,6.5,"Rectangle");
		a=r.area();
		System.out.println("this is area of "+r.ShapeName+" = "+a);
		Triangle t = new Triangle(12,5,"Triangle");
		a=t.area();
		System.out.println("this is area of "+t.ShapeName+" = "+a);
		
	}
}
