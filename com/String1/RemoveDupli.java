package com.String1;

public class RemoveDupli {
	public static void remove() {
		String str = "i am java developer java is very easy language java is very interesting to learn";
		String strarray []= str.split(" ");
		 
		for(int i=0; i<strarray.length; i++) {
			int cnt=0;
			
			for(int j=i+1; j<strarray.length; j++) {
				
				if(strarray[i].equals(strarray[j])) {
					cnt++;
					
				}
			}
			if(cnt==0) {
				System.out.print(strarray[i]+" ");
			}
		}
	}
	public static void main(String arg[]) {
		RemoveDupli.remove();
	}
}
