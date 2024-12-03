package com.ArrayList.copy;

import java.util.*;

public class ArrayLst {
	public static void main(String[] args) {
		List lst = new ArrayList();
		lst.add("hello");
		lst.add(1);
		lst.add("hello 2");
		lst.contains("hello");
		System.out.println(lst.contains("hello"));
		
		Iterator itr = lst.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ArrayList Alst = new ArrayList();
		Alst.add("hello Arraylist");
		Alst.add("hiii");
		Alst.add("bye");
		Alst.add(2);
		
		Iterator aitr = Alst.iterator();
		while(aitr.hasNext()) {
			System.out.println(aitr.next());
		}
		LinkedList Llist = new LinkedList();
		Llist.add("Hello LinkedList");
		Llist.add("1Llist");
		Llist.add("2Llist");
		
		Iterator llist = Llist.iterator();
		while(llist.hasNext()) {
			System.out.println(llist.next());
		}
	
	}
	
}