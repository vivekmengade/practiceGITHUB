package com.Pattern;

public class X {
	public static void main(String args[]) {
		for(int row=1; row<=5;row++) {
			for(int col=5;col>=1;col--) {
				
					
					if( row==col || col+row==6) {
						
						System.out.print("@ ");
					}else {
						System.out.print("# ");
					}
				
			}
			System.out.println();
		}
	}
}
