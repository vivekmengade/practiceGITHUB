package com.Pattern;

public class Trianle {
	public static void main(String args[]) {
		for(int row=1; row<=5;row++) {
			for(int col=1; col<=row; col++) {
				if(col==row) {
					System.out.print(col+" ");
				}else {
					System.out.print(row+" ");
				}
			}
			System.out.println();
		}
	}
}
