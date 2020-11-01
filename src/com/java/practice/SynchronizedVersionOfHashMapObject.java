package com.java.practice;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SynchronizedVersionOfHashMapObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IdentityHashMap m=new IdentityHashMap();
		
		StringBuffer Sb1=new StringBuffer("Chiranjeevi");
		StringBuffer Sb2=new StringBuffer("Chiranjeevi");
		
		
		
		
		m.put(Sb1,700);
		m.put("Balaiah", 800);
		m.put("Venkatesh",200);
		m.put("Nagarjuna", 500);
		
		System.out.println(m);
		
		Integer I=(Integer)m.put(Sb2, 1000);
		
		System.out.println(I);
		
		System.out.println(m);
		
		Set s=m.keySet();
		
		System.out.println(s);
		
		Collection c=m.values();
		
		System.out.println(c);
		
		Set s1=m.entrySet();
		
		System.out.println(s1);
		
		Iterator itr=s1.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			
			System.out.println(m1.getKey()+"-------"+m1.getValue());
			
			if(m1.getKey().equals("Nagarjuna"))
			{
				m1.setValue(10000);
			}
		}
		
		
		System.out.println(m);
		
		
		
		
		
		

	}

}
