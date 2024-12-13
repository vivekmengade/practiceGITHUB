package com.Version1_8;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person() {
			public void ShowInfo() {
				System.out.println("This is in Anonymous Method");
			}
		};
		p.ShowInfo();
	}
}
