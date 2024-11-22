package com.Pattern;

public class Pattern1 {
	public static void main(String args[]) {
			for(int col=5; col>=1; col--) {
				for(int row=5; row>=col;row--) {
				if(col!=row) {
					System.out.print(col+" ");
				}else {
					System.out.print(col+" ");
				}
			}
			System.out.println();
		}
	}
}
