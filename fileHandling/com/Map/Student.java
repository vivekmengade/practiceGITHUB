package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Student {
	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(001, "Vivek");
		m1.put(002, "Nihar");
		m1.put(003, "Amruta");
		System.out.println(m1);
		Set s1= m1.keySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------");
	}
}
