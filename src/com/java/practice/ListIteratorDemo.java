package com.java.practice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList l=new ArrayList();
		
		l.add("balakrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		
		System.out.println(l);
		
		ListIterator ltr=l.listIterator();
		
		while(ltr.hasNext())
		{
			String s=(String) ltr.next();
			
			if(s.equals("nag"))
			{
				ltr.remove();
			}
			else if(s.equals("chiru"))
			{
				ltr.add("chaitu");
			}
			else if(s.equals("venki"))
			{
				ltr.set("charan");
			}
			
		}
		
		System.out.println(l);
		

	}

}
