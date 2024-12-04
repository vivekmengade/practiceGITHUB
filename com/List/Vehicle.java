package com.List;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

	public static void main(String[] args) {
		List<String> vehicle = new ArrayList<String>();
		vehicle.add("Maruti");
		vehicle.add("Suzuki");
		vehicle.add("Toyota");
		vehicle.add("Hyundai");
		vehicle.add("Ford");
		
		
		List<Integer> vehiclecost = new ArrayList<Integer>();
		vehiclecost.add(1000000);
		
		
		vehicle.addAll(vehiclecost);
		System.out.println(vehicle);
		
	}
}
