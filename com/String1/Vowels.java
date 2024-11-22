package com.String1;

public class Vowels {
	
	public void Count(String str) {
		str=str.toLowerCase();
		int cnt=0;
		String vowel= "aeiou";
		for(int i = 0 ; i < vowel.length()-1 ; i++) {
			for(int j = 0 ; j < str.length()-1 ; j++) {
				if(str.charAt(j) == vowel.charAt(i)) {
					cnt++;
				}
			}
			System.out.println(vowel.charAt(i)+"->"+cnt);
		}
	}
	public static void main(String arg[]) {
		Vowels obj = new Vowels();
		obj.Count("hello i am vivek here present");
	}
}