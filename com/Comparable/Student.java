package com.Comparable;

public class Student implements Comparable<Student>{
	String name;
	int id;
	int per;
	
	public Student(String name, int id, int per) {
		super();
		this.name = name;
		this.id = id;
		this.per = per;
	}
	
	public Student() {
		
	}
	 
	@Override
	public int compareTo(Student s1) {
		return this.id -s1.id ;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", per=" + per + "]";
	}
	
	
}
