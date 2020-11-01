package com.java.practice;

public class InstanceVariableConcept {
	
	//instance variables
	int rollNo=10;//primitive variable
	String Name="Faheem";//reference variable
	String department="Cricket";//reference variable
	Student s=new Student();//reference variable
	
	public static void main(String[] args)
	{
		//Object created but not initialized
		final InstanceVariableConcept i=new InstanceVariableConcept();//Local Reference variable
		System.out.println(i.rollNo);
		System.out.println(i.Name);
		System.out.println(i.department);
		System.out.println(i.s.x);
		System.out.println(i.s.y);
		i.m1();
		
		
	}
	void m1()
	{
		System.out.println(rollNo);
		System.out.println(Name);
		System.out.println(department);
		System.out.println(s.x);
		System.out.println(s.y);
	}
	class Student
	{
		int x;
		int y;
	}

}
