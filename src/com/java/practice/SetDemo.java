package com.java.practice;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator c=new MyComparator1();
		
		SortedSet<StringBuffer> t=new TreeSet<StringBuffer>(c);
		
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		
				
		System.out.println(t);
		
		
		
		
		
	}

}

class MyComparator1 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String S1=obj1.toString();
		String S2=obj2.toString();
		
		return -S1.compareTo(S2);
	}
}
