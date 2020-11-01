package com.java.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class RetrievalOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("ratan");
		al.add("anu");
		al.add("sravya");
		
		System.out.println(al);
		
		//Using for-each loop concept to retrieve objects
		
		for(String s:al)
		{
			System.out.println(s);
		}

		//Using get() method concept to retrieve objects
		
		for(int i=0;i<al.size();i++)
		{
			String s=(String)al.get(i);
			System.out.println(s);
			
		}
		
		
		
		//By using cursors
		
		ListIterator itr=al.listIterator();
		
		while(itr.hasNext())
		{
			if(itr.next().equals("ratan"))
			{
				itr.set("chiru");
			}
		}
		
		System.out.println(al);
		
		
		
		
	}

}
