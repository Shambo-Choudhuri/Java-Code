package com.java.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * File f=new File(
		 * "C:\\Users\\user\\Documents\\EclipseProjects\\JavaPractice\\src\\com\\java\\practice\\FilesForTest\\durga.properties"
		 * );
		 * 
		 * if(f.exists()) {
		 * System.out.println("File Already Exists-"+f.createNewFile()); } else {
		 * f.createNewFile(); }
		 * 
		 * 
		 * 
		 * 
		 * FileWriter Fw=new FileWriter(f,true);
		 * 
		 * Fw.write("Username:" + " " + "durga"); Fw.write("Password:" + " " +
		 * "durga123");
		 * 
		 * FileReader FR=new FileReader(f);
		 * 
		 *
		 */
		
		FileInputStream FIS=new FileInputStream(System.getProperty("user.dir") + "\\src\\com\\java\\practice\\FilesForTest\\durga.properties");
		
		Properties p=new Properties();
		
		
		  p.load(FIS);
		  
		  p.setProperty("Username","Durga");
		  
		  p.setProperty("Password", "Durga123");
		  
		  p.setProperty("URL", "https://www.readyplatform.adtheorent.com");
		  
		  
		  
		  System.out.println("Username = " +p.getProperty("Username"));
		  
		  System.out.println("Password = " +p.getProperty("Password"));
		  
		  System.out.println("URL = " +p.getProperty("URL"));
		  
		 
		  
			
		FileOutputStream FOS=new FileOutputStream("C:\\Users\\user\\Documents\\EclipseProjects\\JavaPractice\\src\\com\\java\\practice\\FilesForTest\\durga.properties");
			 
		  
		  p.store(FOS, "Updated By Durga Sir");
		  
		  
		 System.out.println(p);
		  
		  
		  
		  Enumeration e=p.propertyNames();
		  
		  while(e.hasMoreElements()) 
		  { 
			  if(e.nextElement().equals("URL")) 
			  {
				  p.setProperty("URL","https://www.google.com"); 
				  break; 
			  } 
		  }
		  
		  System.out.println(p);
		  
		  p.store(FOS, "Updated By Durga Sir");
		 
		
		
		
		
		
		

	}

}
