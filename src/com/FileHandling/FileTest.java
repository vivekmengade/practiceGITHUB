package com.FileHandling;


import java.io.*;

public class FileTest {
	
	
	public static void main(String[] args) throws Exception{
		System.out.println("hello");
		
		/*
		//create file
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
		
		
		//write file
		FileWriter Write = new FileWriter(file);
		Write.write("Good Morning Everyone....");
		Write.write("Hello, Nice To Meet You....");
		Write.close();
		
		
		//read file
		FileReader Read = new FileReader(file);
		int num=0;
		while((num=Read.read())!=-1) {
			System.out.print((char)num);
		}
		
		
		//delete file
		if(file.delete()) {
			System.out.println("File Deleted");
			
		}else {
			System.out.println("Somethimh went wrong");
		}
		*/
		
		
		File file = new File("D:\\New folder\\New file.txt");
		 if(file.createNewFile()) {
			 System.out.println("File is Created");
		 }else {
			 System.out.println("Problem in Creation");
		 }
		 
		 
		 FileWriter Write = new FileWriter(file);
		 Write.write("Hello... ");
		 Write.write("Writing File in path.....");
		 Write.close();
		 
		 FileReader Read = new FileReader(file);
		 int num=0;
		 while((num=Read.read())!=-1) {
			 System.out.print((char)num);
		 }
		 
		 
		 
		 
		 /*
		 if(file.delete()) {
			 System.out.println("File is Deleted");
		 }else {
			 System.out.println("Problem in deleting....");
		 }*/
	}
}
