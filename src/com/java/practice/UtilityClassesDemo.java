package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UtilityClassesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s= {"A","Z","B"};
		
		Comparator c=new MyComparator();
		
		System.out.println("Before Sorting");
		
		for(String s1:s)
		{
			System.out.println(s1);
		}
		
		System.out.println("After Sorting");
		
		Arrays.sort(s,c);
		
		for(String s1:s)
		{
			System.out.println(s1);
		}
		
		System.out.println(Arrays.binarySearch(s, "Z",c));
		
		System.out.println(Arrays.binarySearch(s, "P",c));
		
		
		
		
		
		
		
		

	}

}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
		String s2=(String)obj2;
		
		return s2.compareTo(s1);
	}
}

