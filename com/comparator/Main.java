package com.comparator;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Employee> l1 = new ArrayList<Employee>();
		l1.add(new Employee("vivek",101,100000));
		l1.add(new Employee("Amruta",104,220000));
		l1.add(new Employee("Nihar",103,300000));
		l1.add(new Employee("Daivik",102,4000000));
		
		for(Employee emp:l1) {
			System.out.println(emp);
		}
		System.out.println("------------------");
		IdComparator id = new IdComparator();
		Collections.sort(l1, id);
		for(Employee emp:l1) {
			System.out.println(emp);
		}
		System.out.println("------------------");
		Collections.sort(l1, new IdComparator());
		for(Employee emp:l1) {
			System.out.println(emp);
		}
		System.out.println("------------------");
		Collections.sort(l1, new SalaryComparator());
		for(Employee emp:l1) {
			System.out.println(emp);
		}
		System.out.println("------------------");
		Collections.sort(l1, new NameComaparator());
		for(Employee emp:l1) {
			System.out.println(emp);
		}
	}
}
