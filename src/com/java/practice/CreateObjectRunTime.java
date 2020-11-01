package com.java.practice;

import java.lang.reflect.Method;

public class CreateObjectRunTime {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		
			Object o=Class.forName(args[0]).newInstance();
			
			Class c=o.getClass();//Returns run-time Class class object of the .Class file for which the object is created.
			
			System.out.println(c.getName());
			
			Method[] m=c.getDeclaredMethods();
			
			for(Method m1:m)
			{
				System.out.println(m1.getName());
			}
		
			
	}

}


