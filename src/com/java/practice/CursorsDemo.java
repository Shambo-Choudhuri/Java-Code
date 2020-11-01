package com.java.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CursorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l=new ArrayList<Integer>();;
		
		for(int i=1;i<=10;i++)
		{
			l.add(i);
		}
		
		//retrieving the objects
		
		for(Integer I :l)
		{
			System.out.println(I);
		}
		
		System.out.println("\n");
		
		Iterator<Integer> itr=l.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\n");
		
		ListIterator<Integer> ltr=l.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
			System.out.print(ltr.nextIndex());
		}
		
		

	}

}
