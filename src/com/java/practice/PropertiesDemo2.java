package com.java.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\user\\Documents\\EclipseProjects\\JavaPractice\\src\\com\\java\\practice\\FilesForTest","durga.properties");
		
		if(f.exists())
		{
			System.out.println("File Already Exists");
		}
		
		else
		{
			f.createNewFile();
		}
		
		FileWriter Fw=new FileWriter(f,true);
		
		FileReader Fr=new FileReader(f);
		
		Fw.write("Username : " + "Admin");
		
		Fw.write("\n");
		
		Fw.write("Password : " + "Admin123");
		
		Fw.write("\n");
		
		Fw.flush();
		
		//Fw.close();
		
		Properties p=new Properties();
		
		p.load(Fr);
		
		System.out.println(p.getProperty("Username"));
		
		p.setProperty("URL", "https://www.google.com");
		
		p.store(Fw, "Updated by Durga");
		
		
		
		
		
		
		
		
		
		
		

	}

}
