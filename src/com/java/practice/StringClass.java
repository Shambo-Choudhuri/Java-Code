package com.java.practice;

public class StringClass {
	
	public static void main(String[] args)
	{
		StringBuffer Sb=new StringBuffer("durga");
		
		String s=new String(Sb);
		
		Sb.append("software");
		
		System.out.println(Sb);
	}

}
