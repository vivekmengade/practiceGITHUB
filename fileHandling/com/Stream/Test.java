package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(14,12,15,11,16,17,19,18,20);
		Stream<Integer> s1 = l1.stream();
		
//		Filter Method
		List<Integer> list = s1.filter(i-> i%2==0).collect(Collectors.toList());
		System.out.println("These elements are all even Elements"+list);
		
		
//		Map Method
		Stream<Integer> s2=l1.stream();
		List<Integer> Square= s2.map(ele -> ele*ele).collect(Collectors.toList());
		System.out.println("Square of all elemets"+Square);
		
		
		
		Stream<Integer> s3=l1.stream();
		List<Integer> list3= s3.sorted().collect(Collectors.toList());
		System.out.println(list3);
		
		
//		ForEach Method
		l1.stream().forEach(ele->{
			System.out.println(ele);
		});
		
		
//		min Method
		Integer res =l1.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println("min "+res);
		
//		max Method
		Integer max = l1.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println("Max = "+max);
		
		
//		reduce method
		Stream<Integer> s4 = l1.stream();
		Optional<Integer> red = s4.reduce((a,b)-> a+b);
		System.out.println(red);
		System.out.println("-----------end of core java-----------");
		
	}
}
