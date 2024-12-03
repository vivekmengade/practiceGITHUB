package com.Treeset;

import java.util.*;

public class Sets {
	
	public static void main(String[] args) {
		TreeSet tset= new TreeSet();
		tset.add("hello");
//		tset.add(1);
		tset.add("hello TreeSet");
		
		HashSet hset= new HashSet();
		hset.add(1);
		hset.add(2);
		
		
		LinkedHashSet Lhset=new LinkedHashSet();
		Lhset.add("hello LinkedHashSet");
		Lhset.add("LinkedHashSet 1");
		
		
		Iterator titr = tset.iterator();
		while(titr.hasNext()) {
			System.out.println(titr.next());
		}
		Iterator hitr = hset.iterator();
		while(hitr.hasNext()) {
			System.out.println(hitr.next());
		}
		Iterator litr =  Lhset.iterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
	}
	
}
