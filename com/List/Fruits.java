package com.List;

import java.util.ArrayList;
import java.util.List;

public class Fruits {
	public static void main(String[] args) {
		List fruits = new ArrayList();
		fruits.add("Apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add(1,"Watermelon");
		System.out.println(fruits);
		
		
		List price = new ArrayList();
		price.add(100);
		price.add(200);
		price.add(300);
		price.add(1,250);
		fruits.addAll(price);
//		fruits.addAll(2, 2000);
		System.out.println(price);
		System.out.println(fruits);
		System.out.println(fruits.contains("Apple"));
		System.out.println(fruits.get(3));
	}
}
