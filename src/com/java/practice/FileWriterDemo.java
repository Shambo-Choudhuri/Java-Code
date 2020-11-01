package com.java.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\user\\Documents\\EclipseProjects\\JavaPractice\\src\\com\\java\\practice\\FilesForTest","pdf.txt");
		
		f.createNewFile();
		
		FileWriter Fw1=new FileWriter("pdf.txt");
		
		Fw1.write("I love my Mom and Dad");
		
		Fw1.flush();
		
		FileWriter Fw2=new FileWriter(f,true);
		
		Fw2.write("\n");
		
		Fw2.write("I love my Mom and Dad");
		
		Fw2.flush();
		
		Fw2.close();
		
		Fw1.close();

	}

}
