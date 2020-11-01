package com.java.practice;

import com.java.practice.InstanceVariableConcept.Student;

public class ConstructorConcept {
	
	int x;
	String name;
	Customer c;
	
	ConstructorConcept(int x)
	{
		this("Shyam");
		this.x=x;
		System.out.println(x);
		
	}
	
	ConstructorConcept(String name)
	{
		this(new Customer(20));
		this.name=name;
		System.out.println(name);
	}
	
	ConstructorConcept(Customer c)
	{
		this.c=c;
		System.out.print(c.x);
	}
	

	public static void main(String[] args) {
		
		ConstructorConcept c1=new ConstructorConcept(10);
		
		ConstructorConcept c2=new ConstructorConcept("Iqbal");
		
		ConstructorConcept c3=new ConstructorConcept(new Customer(10));
		
		System.out.println("Constructor Concept");
		
		
		}

}

class Customer
{
	int x;
	Customer(int x)
	{
		this.x=x;
	}
}

