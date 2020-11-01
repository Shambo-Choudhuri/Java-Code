package com.java.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer Sb=new StringBuffer();
		
		Class c=Sb.getClass();
		
		Method[] m=c.getDeclaredMethods();
		
		int MethodCount=0;
		
		for(Method m1:m)
		{
			System.out.println(m1.getName());
			System.out.println("\n");
			MethodCount++;
		}
		
		System.out.println("Total Number Of Methods in StringBuffer Class" +MethodCount);
		
		Constructor[] constructor=c.getDeclaredConstructors();
		
		int ConstructorCount=0;
		
		for(Constructor c1:constructor)
		{
			System.out.println(c1.getName());
			System.out.println("\n");
			ConstructorCount++;
		}
		
		System.out.println("Total Number Of Methods in StringBuffer Class" +ConstructorCount);
		
		
		
		
		
		
		

	}

}
