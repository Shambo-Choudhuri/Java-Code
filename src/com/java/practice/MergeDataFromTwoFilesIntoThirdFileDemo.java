package com.java.practice;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class MergeDataFromTwoFilesIntoThirdFileDemo {
	
	public static File f;
	public static File f1;
	public static FileWriter Fw;
	public static FileReader Fr;
	public static FileReader Fr1;
	
	public static void main(String[] args) throws IOException
	{
		
		OperationFirstFile();
		OperationSecondFile();
		MergeOperation();
		
	}
	
	public static void OperationFirstFile() throws IOException
	{
		f=new File("C:\\Users\\user\\Desktop\\Files\\","pdf.txt");
		
		if(f.exists())
		{
			System.out.println("File Already Exists");
		}
		else
		{
			f.createNewFile();
		}
		
		FileWriter Fw=new FileWriter(f,true);
		
		PrintWriter Pw=new PrintWriter(Fw);
		
		
		  Pw.print(222);
		  
		  Pw.println();
		  
		  Pw.print(333);
		  
		  Pw.println();
		  
		  Pw.print(444);
		  
		  Pw.println();
		  
		  Pw.print(555);
		  
		  Pw.println();
		  
		  Pw.flush();
		  
		  Pw.close();
		  
		  Fr=new FileReader(f);
		  
		  
		  
		  
		  
		  
		  
	}
	
	public static void OperationSecondFile() throws IOException
	{
		f1=new File("C:\\Users\\user\\Desktop\\Files\\","abc.txt");
		
		if(f1.exists())
		{
			System.out.println("File Already Exists");
		}
		else
		{
			f1.createNewFile();
		}
		
		
		FileWriter Fw1=new FileWriter(f1);
		
		PrintWriter Pw1=new PrintWriter(Fw1);
		
		Pw1.println("AAA");
		Pw1.println("BBB");
		Pw1.println("CCC");
		Pw1.println("DDD");
		Pw1.println("EEE");
		
		Pw1.flush();
		
		Pw1.close();
		
		Fr1=new FileReader(f1);
		
		
	}
	
	public static void MergeOperation() throws IOException
	{
		File f2=new File("C:\\Users\\user\\Desktop\\Files\\","Final.txt");
		
		if(f2.exists())
		{
			System.out.println("File Already Exists");
		}
		else
		{
			f2.createNewFile();
		}
		
		PrintWriter Pw=new PrintWriter(f2);
		
		BufferedReader Br=new BufferedReader(Fr,2);
		
		String FirstFile_Line=Br.readLine();
		
		while(FirstFile_Line!=null)
		{
			Pw.println(FirstFile_Line);
			
			FirstFile_Line=Br.readLine();
		}
		
		
		
		
		
		BufferedReader Br1=new BufferedReader(Fr1,2);
		
		String SecondFile_Line=Br1.readLine();
		
		while(SecondFile_Line!=null)
		{
			Pw.println(SecondFile_Line);
			
			SecondFile_Line=Br.readLine();
		}
		
		Pw.flush();
		
		Pw.close();
		
		
	}

}


