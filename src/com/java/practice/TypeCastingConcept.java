package com.java.practice;

public class TypeCastingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=100;
		
		char d=(char) x;
		
		//double b=x;
		
		System.out.println(d);
		
		//System.out.println(b);
		
		Lotus l=new Lotus();
		
		Flower f=(Flower)l;
		
		Object o=(Object)l;
		
		System.out.println(f);
		System.out.println(o);
		
		
		
		
		

	}

}

class Flower
{
	
}

class Lotus extends Flower
{
	
}
