package com.java.practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;


public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		
		PrintWriter Pw=new PrintWriter("C:\\Users\\user\\Documents\\EclipseProjects\\JavaPractice\\src\\com\\java\\practice\\FilesForTest\\abc.txt");
		
		Pw.print(100);
		
		Pw.println();
		
		Pw.println(true);
		
		Pw.write(100);
		
		Pw.flush();
		
		Pw.close();
		
		
		
		

	}

}
