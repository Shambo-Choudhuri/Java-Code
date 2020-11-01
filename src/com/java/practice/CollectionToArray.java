package com.java.practice;

import java.util.ArrayList;

public class CollectionToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		
		al.add(new Emp(111,"ratan"));
		
		al.add(new Stu(1,"xxx"));
		
		al.add("ratan");
		
		Object[] o=al.toArray();
		
		for(Object oo:o)
		{
			if(oo instanceof Emp)
			{
				Emp e=(Emp)oo;
				
				System.out.println(e.index+"....."+e.str);
			}
			else if(oo instanceof Stu)
			{
				Stu s=(Stu)oo;
				System.out.println(s.index+"....."+s.s);
			}
			
			else if(oo instanceof String)
			{
				System.out.println(oo.toString());
			}
				
				
				
			}
		}
		
		

	}



class Emp
{
	int index;
	String str;
	Emp(int index,String str)
	{
		this.index=index;
		this.str=str;
	}
}

class Stu
{
	int index;
	String s;
	Stu(int index,String s)
	{
		this.index=index;
		this.s=s;
	}
}
