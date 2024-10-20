package com.Matrics;

public class M1 {
	public static void main(String args[]) {
		
		int arr1[] [] = {{12,21},{56,65}};
		int arr2[] [] = {{34,43},{89,98}};
		int res[] [] = new int[2] [2];
		int mul[] [] = new int[2] [2];
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length;j++) {
				res [i] [j] = arr1 [i] [j] + arr2 [i] [j];
				mul [i] [j] = arr1 [i] [j] * arr2 [i] [j];
				System.out.println("Addition"+res [i] [j]);
				System.out.println("Multiplication"+mul [i] [j]);
			}
		}
	}
}