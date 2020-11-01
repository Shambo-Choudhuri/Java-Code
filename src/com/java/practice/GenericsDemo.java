package com.java.practice;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> l=new ArrayList<String>();
		
		Class<? extends ArrayList> c=l.getClass();
		
		System.out.println(c.getName());
		
		
		
		
		

	}

}

