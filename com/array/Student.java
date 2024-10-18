package com.array;
import java.util.Scanner;
public class Student {
	String name;
	int id;
	double marks;
	static int cnt;
	public Student(String name,int id, double marks) {
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	public Student() {
		
	}
	public String toString() {
		return name +" "+id +" "+marks;
	}
	static Student stu []=new Student[5];
	static void accept() {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enetr number of Student");
//		cnt=sc.nextInt();
		for(int i=0;i<stu.length;i++) {
			System.out.println("Eneter Student Details = Name + Id + Marks");
			String n=sc.next();
			int id=sc.nextInt();
			double m = sc.nextDouble();
			stu[i]=new Student(n,id,m);
		}
	}
	static void sort() {
		for(int i =0;i<stu.length;i++) {
			for(int j =i+1;j<stu.length;j++) {
				if(stu[i].id>stu[j].id) {
					Student temp=stu[i];
					stu[i]=stu[j];
					stu[j]=temp;
				}
			}
			System.out.println(stu[i]);
		}
	}
	
}
