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
		
		
//		File file = new File("D:\\New folder\\New file.txt");
//		 if(file.createNewFile()) {
//			 System.out.println("File is Created");
//		 }else {
//			 System.out.println("Problem in Creation");
//		 }
//		 
//		 
//		 FileWriter Write = new FileWriter(file);
//		 Write.write("Hello... ");
//		 Write.write("Writing File in path.....");
//		 Write.close();
//		 
//		 FileReader Read = new FileReader(file);
//		 int num=0;
//		 while((num=Read.read())!=-1) {
//			 System.out.print((char)num);
//		 }
		 
		 
		 
		 
		 /*
		 if(file.delete()) {
			 System.out.println("File is Deleted");
		 }else {
			 System.out.println("Problem in deleting....");
		 }*/
		
		
		
		File file1 =new File("D:\\Adv java/1.txt");
		if(file1.createNewFile()) {
			System.out.println("File is Created....");
			
		}else {
			System.out.println("error to creation");
		}
//		FileWriter write = new FileWriter(file1);
//		write.write("Write this line.");
//		System.out.println("Written in file...");
//		write.close();
//		
//		
//		
//		FileReader read = new FileReader(file1);
//		int num= 0;
//		while((num=read.read())!=-1) {
//			System.out.print((char)num);
//		}
		
		
		if(file1.delete()) {
			System.out.println("File deleted");
		}else {
			System.out.println("problem in deleting");
		}
	}
}
