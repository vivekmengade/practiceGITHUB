package com.comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		return e1.id - e2.id;
	}
	
}
