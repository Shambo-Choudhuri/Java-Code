package com.java.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList l=new ArrayList();
		for(int i=0;i<=9;i++)
		{
			l.add(i);
		}
		
		System.out.println(l);
		
		Iterator itr=l.iterator();
		
		while(itr.hasNext())
		{
			Integer I=(Integer) itr.next();
			
			int i=I;
			
			if(!(i%2==0))
			{
				itr.remove();
			}
			
		}
		
		System.out.println(l);
		
		
		
		

	}

}
