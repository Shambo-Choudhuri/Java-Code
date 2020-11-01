package com.java.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> l1=new ArrayList<String>();
		
		l1.add("Green");
		l1.add("Pink");
		l1.add("Orange");
		l1.add("Yellow");
		
		System.out.println(l1);
		
		ArrayList<String> l2=(ArrayList<String>)l1.clone();
		
		l2.ensureCapacity(6);
		
		
		
		System.out.println(l2.size());
		
		l2.add("Purple");
		l2.add("Green");
		
		System.out.println(l2);
		
		
		
		

	}

}
