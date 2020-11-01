package com.java.practice;

import java.io.File;
import java.io.IOException;

public class FileHandlingExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\user\\Documents\\EclipseProjects\\JavaPractice\\src\\com\\java\\practice\\FilesForTest");
		
		System.out.println(f.exists());
		
		System.out.println(f.isDirectory());
		
		File f2=new File(f,"pdf.txt");
		
		if(f2.exists())
		{
			f2.createNewFile();
		}
		
		System.out.println(f2.exists());
		
		System.out.println(f2.isFile());
		
		String[] s=f.list();
		
		for(String s1:s)
		{
			File f3=new File(f,s1);
			if(f3.isFile())
			{
				f3.delete();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
