package com.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Student {
	//practice about map hashmap,  linkedhashmap, tree map
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
		Set s2 = m1.entrySet();
		Iterator itr2 = s2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println("---------------");
		System.out.println(m1.values());
		System.out.println("---------------");
		Collection<String> values = m1.values();
		System.out.println(values);
		
		System.out.println("LinkedHash map");
		
		Map<Integer, String> m2 = new LinkedHashMap<>();
		m2.put(001, "Vivek");
		m2.put(002, "Nihar");
		m2.put(003, "Amruta");
		System.out.println(m2);
		Set s3= m2.keySet();
		Iterator itr1 = s3.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("---------------");
		Set s4 = m2.entrySet();
		Iterator itr3 = s2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println("---------------");
		System.out.println(m2.values());
		System.out.println("---------------");
		Collection<String> values3= m2.values();
		System.out.println(values);
		
		
		Map<Integer, String> m3 = new TreeMap<>();
		m2.put(001, "Vivek");
		m2.put(002, "Nihar");
		m2.put(003, "Amruta");
		System.out.println(m3);
		Set s5= m3.keySet();
		Iterator itr5 = s3.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("---------------");
		Set s6 = m3.entrySet();
		Iterator itr4 = s2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println("---------------");
		System.out.println(m3.values());
		System.out.println("---------------");
		Collection<String> values4= m3.values();
		System.out.println(values);
	}
}
