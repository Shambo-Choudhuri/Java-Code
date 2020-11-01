package com.java.practice;

import java.util.Enumeration;
import java.util.Vector;
import static java.lang.System.out;

public class EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v=new Vector();
		
		for(int i=0;i<=10;i++)
		{
			v.addElement(i);
			
		}
		
		out.println(v);
		
		Enumeration e=v.elements();
		
		while(e.hasMoreElements())
		{
			Object o=e.nextElement();
			
			Integer I=(Integer)o;
			
			int i=I;
			
			if(i%2==0)
			{
				out.println(i);
			}
		}
		

	}

}
