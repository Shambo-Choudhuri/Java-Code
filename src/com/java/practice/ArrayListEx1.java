package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1=new ArrayList<String>();
		l1.add("Saffron");
		l1.add("White");
		l1.add("Green");
		l1.add(1, "Blue");
		
		Iterator<String> itr=l1.iterator();
		
		while(itr.hasNext())
		{
			String str=itr.next();
			System.out.println(str);
		}
		
		System.out.println(l1);
		
		List<String> l2=new ArrayList<String>();
		
		l2.add("White");
		l2.add("Purple");
		l2.add("Green");
		
		System.out.println(l2);
		
		List<String> l=new ArrayList<String>();
		
		l.addAll(l1);
		l.addAll(l2);
		
		System.out.println(l);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
