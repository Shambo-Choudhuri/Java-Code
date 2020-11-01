package com.java.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap m=new HashMap();

		m.put("Chiranjeevi",700);
		m.put("Balaiah",800);
		m.put("Venkatesh",200);
		m.put("Nagarjuna",500);

		System.out.println(m);

		Set s=m.entrySet();

		System.out.println(s);

		Iterator itr=s.iterator();

		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			
			if(m1.getKey().equals("Nagarjuna"))
			{
				m1.setValue("1000");
				break;
			}
		}
		
		System.out.println(m);

	}

}
