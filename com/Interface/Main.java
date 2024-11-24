package com.Interface;

import java.util.Scanner;

public class Main {
//	public static void main(String[] args) {
//		MediaPlayer m = new VideoPlayer();
//		m.Play();
//		m.Pause();
//		m.Stop();
//		
//		System.out.println("-----------------------");
//		MediaPlayer V = new AudioPlayer();
//		V.Play();
//		V.Pause();
//		V.Stop();
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Brand Of Bike");
		String BrandB=sc.next();
		System.out.println("Enter Speed of Bike");
		double SpeedB=sc.nextDouble();
		
		AbstractVehicle B = new Bike(BrandB,SpeedB);
		B.Start();
		B.Accelerate(SpeedB);
		B.Decelerate(SpeedB);
		B.Stop();
		
		System.out.println("Enter Brand Of Car");
		String BrandC=sc.next();
		System.out.println("Enter Speed of Car");
		double SpeedC=sc.nextDouble();
		
		AbstractVehicle C = new Bike(BrandC,SpeedC);
		C.Start();
		C.Accelerate(SpeedC);
		C.Decelerate(SpeedC);
		C.Stop();
		
	}
}
