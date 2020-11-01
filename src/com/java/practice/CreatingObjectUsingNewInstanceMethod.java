package com.java.practice;

class A
{
	int a;
}

class B
{
	int b;
}
public class CreatingObjectUsingNewInstanceMethod {
	
	static public void fun(String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		
		Object o=Class.forName(s).newInstance();
		System.out.println("Object Created For"+o.getClass().getName());
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		fun("A");
		
		
		
		
		
		
		

	}

}
