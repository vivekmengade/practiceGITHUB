package com.Pattern;

public class _3X3 {
	public static void main(String args[]) {
		for(int row=1; row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if( row==3 && col==3) {
					
					System.out.print("@ ");
				}else {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}
}
