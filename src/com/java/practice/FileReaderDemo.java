package com.java.practice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\user\\Documents\\EclipseProjects\\JavaPractice\\src\\com\\java\\practice\\FilesForTest","abc.txt");
		
		if(f.exists())
		{
			System.out.println("File Already Exists");
		}
		else
		{
			f.createNewFile();
		}
		
		FileWriter Fw=new FileWriter(f);
		
		Fw.write("I love my mom and dad");
		
		Fw.write("\n");
		
		Fw.flush();
		
		Fw.close();
		
		FileReader Fr=new FileReader(f);
		
		char[] ch=new char[(int) f.length()];
		
		int NoOfCharectersCopied=Fr.read(ch);
		
		System.out.println("Total No of Characters = " +NoOfCharectersCopied);
		
		for(char ch1:ch)
		{
			System.out.println(ch1);
		}
		
		Fr.close();
		
		
		
		/*
		 * while(i!=-1) { char c=(char)i; System.out.println(c); i=Fr.read(); }
		 */
		
		
		
		

	}

}
