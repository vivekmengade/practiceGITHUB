package com.Encapsulation;

import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		EncapsulationSTU s1=new EncapsulationSTU();
		Scanner sc=new Scanner(System.in);
		int id=0;
		System.out.println("Enter the id of Student");
		id=sc.nextInt();
		s1.setId(id);
		System.out.println("Enter the Name of Game");
		String name=sc.next();
		s1.setName(name);
		System.out.println(s1.getId());
		System.out.println(s1.getName());
//		Games g1=new Games(1,"Chess");
//		System.out.println(g1.setId());
//		System.out.println(g1.setName());
//		g1.getId(2);
//		g1.getName("Kabaddi");
//		System.out.println(g1.setId());
//		System.out.println(g1.setName());
	}
}
