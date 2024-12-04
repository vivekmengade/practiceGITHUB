package com.comparator;



import java.util.*;
public class NameComaparator implements Comparator<Employee>{

	
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}
