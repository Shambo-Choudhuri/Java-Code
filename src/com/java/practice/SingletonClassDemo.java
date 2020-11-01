package com.java.practice;

public class SingletonClassDemo {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SingleTonClass t1=SingleTonClass.getSingleTonClass();
		SingleTonClass t2=SingleTonClass.getSingleTonClass();
		SingleTonClass t3=SingleTonClass.getSingleTonClass();
		
		
		//SingleTonClass t4=new SingleTonClass(); //Can't create object from outside class
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		
		
		
		

	}
	
	

}

class SingleTonClass
{
	private static SingleTonClass t=new SingleTonClass();
	
	//private-constructor
	
	private SingleTonClass()
	{
		
	}
	
	//public-factory Method
	
	public static SingleTonClass getSingleTonClass()
	{
		return t;
	}
}


