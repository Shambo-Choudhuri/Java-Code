package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"ratan","Sravya","bhavya"};
		
		
		//Conversion from Array to Collection
		//ArrayList al=new ArrayList(Collection c);
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(str));
		
		al.add("news-1");
		al.add("news-2");
		
		for(String s:al)
		{
			System.out.println(s);
		}

	} 

}
