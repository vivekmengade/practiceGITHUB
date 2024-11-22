package com.String1;

public class RemoveCharDupli {
	public void charremove() {
	String str ="Programming";
	char charstr []=str.toCharArray();
	for(int i =0; i<charstr.length; i++) {
		int cnt=0;
		
		for(int j=i+1; j<charstr.length;j++) {
			if(charstr[i]==charstr[j]) {
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.print(charstr[i]+" ");
		}
		}
	}
	public static void main(String arg[]) {
		RemoveCharDupli s = new RemoveCharDupli();
		s.charremove();
	}
}