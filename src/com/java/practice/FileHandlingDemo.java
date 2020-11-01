package com.java.practice;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1=new File("C:\\Users\\user\\Documents\\EclipseProjects\\JavaPractice\\src\\com\\java\\practice\\FilesForTest");
		
		File f2=new File(f1,"abc.txt");
		
		f2.createNewFile();
		
		boolean b=f2.isFile();
		
		System.out.println(b);
		
		String[] files=f1.list();
		
		int File_Count=0;
		int Dir_Count=0;
		
		for(String f:files)
		{
			File f3=new File(f1,f);
			
			if(f3.isFile())
			{
				File_Count++;
				System.out.println(f);
			}
			else if(f3.isDirectory())
			{
				Dir_Count++;
				System.out.println(f);
			}
			else
			{
				break;
			}
			
			
		}
		
		System.out.println("Total Number of Files = " +File_Count);
		
		System.out.println("Total Number of Directories = " +Dir_Count);
		
		
		
		
		
		
		
		
		
		
		

	}

}
