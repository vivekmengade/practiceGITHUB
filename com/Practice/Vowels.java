package com.Practice;

public class Vowels {
	void vowel(String sen) {
		sen=sen.toLowerCase();
		String Vowel="aeiou";
		int cnt=0; 
		for(int i=0;i<Vowel.length()-1;i++) {
			for(int j=0;j<=sen.length()-1;j++) {
				if(sen.charAt(j)==Vowel.charAt(i)) {
					cnt++;
					System.out.print(Vowel.charAt(i)+" ");
				}
			}
		}
		System.out.println("count = "+cnt);
	}
	public static void main(String arg[]) {
		Vowels a=new Vowels();
		a.vowel("hello i am vivek i am here to check vowels ");
	}
}
