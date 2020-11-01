package com.java.practice;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("no1");
		a1.add("no2");
		
		Vector<String> v=new Vector<String>(a1);
		
		v.add("ratan");
		v.add("aruna");
		System.out.println(v);
		
		ArrayList<String> a2=new ArrayList<String>(v);
		
		a2.add("xxx");
		a2.add("yyy");
		
		System.out.println(a2);
		
		
		
		
		
		
		
		

	}

}
