package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(11,12,13,14,15,16,17,18,19,20);
		Stream<Integer> s1 = l1.stream();
		s1.filter(i-> i%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
	}
}
