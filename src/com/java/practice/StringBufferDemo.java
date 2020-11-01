package com.java.practice;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=new String("spring");
		
		s1.concat("summer");
		
		final String s2=s1.concat("winter");
		
		s1=s1.concat("fall");
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		
		

	}

}
