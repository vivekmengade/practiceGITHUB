package com.Encapsulation;

public class Games {
	private int id;
	private String name;
	public Games(int Id, String Name) {
		this.id=Id;
		this.name=Name;
	}
	public void getId(int id) {
		this.id=id;
	}
	public void getName(String name) {
		this.name=name;
	}
	public int setId() {
		return id;
	}
	public String setName() {
		return name;
	}
}
