package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l=new ArrayList<String>(5);//--------------Non-Synchronized
		
		for(int i=1;i<=5;i++)
		{
			l.add("durga" + " " +i);
		}
		
		System.out.println(l);
		
		List<String> al=Collections.synchronizedList(l);//---------------Synchronized
		
		System.out.println(al);
		
		
		

	}

}
