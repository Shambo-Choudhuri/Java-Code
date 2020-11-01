package com.java.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	
	public static File f3;
	public static FileWriter Fw;
	public static BufferedWriter Bw;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1=new File("C:\\Users\\user\\Documents\\EclipseProjects\\JavaPractice\\src\\com\\java\\practice");
		
		File f2=new File(f1,"FilesForTest");
		
		if(f2.exists())
		{
			System.out.println("Directory Exists");
		}
		
		else
		{
			f2.mkdir();
		}
		
		f3=new File(f2,"abc.txt");
		
		if(f3.exists())
		{
			System.out.println("File Exists");
		}
		
		else
		{
			f3.createNewFile();
		}
		
		Fw=new FileWriter(f3,true);
		
		Bw=new BufferedWriter(Fw,2);
		
		Bw.write("I Love My Mom and Dad");
		
		Bw.newLine();
		
		char[] ch= {'a','e','i','o','u'};
		
		Bw.write(ch);
		
		Bw.newLine();
		
		Bw.flush();
		
		Bw.close();
		
		FileReader Fr=new FileReader(f3);
		
		BufferedReader Br=new BufferedReader(Fr,2);
		
		String s=Br.readLine();
		
		while(s!=null)
		{
			System.out.println(s);
			s=Br.readLine();
			
		}
		
		Br.close();
		
		
		
		

	}

}
