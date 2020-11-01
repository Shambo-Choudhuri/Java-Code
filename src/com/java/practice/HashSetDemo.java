package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		Test t1=new Test(100,"Rohan");
		Test t2=new Test(60,"Abhishek");
		Test t3=new Test(75,"Akanksha");
		
		TreeSet<Test> l=new TreeSet<Test>();
		
		l.add(t1);
		l.add(t2);
		l.add(t3);
		
		
		
		
		
		for(Test t:l)
		{
			System.out.println("ID = " +t.getID());
			System.out.println("Name = " +t.getName());
			
		}
		
		
		
		
		
		
		
		
		
		
	}
		
}

class Test implements Comparable<Test>
{
	private int ID;
	private String name;
	
	Test(int ID,String name)
	{
		this.ID=ID;
		this.name=name;
	}
	
	public int compareTo(Test t)
	{
		return this.ID+t.ID;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public String getName()
	{
		return name;
	}
}

	