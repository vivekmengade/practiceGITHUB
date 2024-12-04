package com.Comparable;

import java.util.*;

public class MainStudent {
	public static void main(String[] args) {
		List<Student> l1 = new ArrayList<Student>();
		Student s1 = new Student("Vivek", 101, 76);
		l1.add(new Student("Vivek", 101, 76));
		l1.add(new Student("Nihar", 103, 70));
		l1.add(new Student("Amruta",102,80));
		
		for(Student stu:l1) {
			System.out.println(stu);
			
		}
		
		Collections.sort(l1);
		
		System.out.println("----------------------");
		
		for(Student stu:l1) {
			System.out.println(stu);
			
		}
	}
}
