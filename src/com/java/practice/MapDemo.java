package com.java.practice;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String, Integer> h=new LinkedHashMap<String, Integer>();
		
		h.put("Chiranjeevi", 700);
		h.put("Balaiah", 800);
		h.put("Venkatesh",200);
		h.put("Nagarjuna",500);
		
		System.out.println(h);

		System.out.println(h.put("Chiranjeevi",1000));
		
		System.out.println(h);
		
		Set<String> s=h.keySet();
		
		System.out.println(s);
		
		Collection<Integer> c=h.values();
		
		System.out.println(c);
		
		Set s1=h.entrySet();
		
		System.out.println(s1);
		
		Iterator itr=s1.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			
			if(m1.getKey().equals("Nagarjuna"))
			{
				m1.setValue(1000);
			}
		}
		
		System.out.println(h);
		
		Map<String, Integer> m=Collections.synchronizedMap(h);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
