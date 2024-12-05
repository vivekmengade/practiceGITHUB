package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	
	public static void main(String[] args){
		System.out.println("hello");
		File file = new File("D:\\New folder\\hello.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("File is created Successfully");
			}else {
				System.out.println("File is already exist...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
