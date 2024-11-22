package com.Practice;

import java.util.Scanner;

public class Pattern {
	void Pattern1() {
		for(int row=1; row<=3;row++) {
			for(int col=1;col<=3;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String arg[]) {
		Pattern a=new Pattern();
		a.Pattern1();
	}
}
