package com.Stream;

import java.util.Arrays;
import java.util.List;
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
		
		l1.stream().forEach(ele->{
			System.out.println(ele);
		});
		
	}
}
