package com.java.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayToListConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s= {"A","Z","B"};//String Array object
		
		List l=Arrays.asList(s);
		
		System.out.println(l);//List Object
		
		s[0]="K";
		
		System.out.println(l);
		
		l.set(1, "L");
		
		System.out.println(l);
		
		for(String s1:s)
		{
			System.out.println(s1);
		}
		
		//l.add("durga");
		
		//l.remove(2);
		
		//l.set(1, new Integer(10));
		
		Collections.reverse(l);
		
		System.out.println(l);
		
		
		
		
		
		
		
		
		
		

	}

}
