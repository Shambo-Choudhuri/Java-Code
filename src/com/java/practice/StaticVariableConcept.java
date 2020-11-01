package com.java.practice;

public class StaticVariableConcept {
	
	static int rollNo;
	static String Name="Faheem";
	static Student s=new Student();

	public static void main(String[] args) {
		System.out.println(rollNo);
		System.out.println(Name);
		System.out.println(s.x);
		System.out.println(s.y);
		
		StaticVariableConcept s=new StaticVariableConcept();
		s.m1();
		
		
		

	}
	
	void m1()
	{
		System.out.println(rollNo);
		System.out.println(Name);
		System.out.println(s.x);
		System.out.println(s.y);
	}
	

}
class Student
{
	static int x=10;
	static int y=20;
}
